package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by richard on 2015/12/7.
 */
public class WMSDetailDao extends BaseDao{
    public String getCodeByCNum(String CNum){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "select model.asnCode from WmsDetailEntity as model where model.cNum = ?";
            Query queryObject = session.createQuery(queryString);
            queryObject.setParameter(0, CNum);
            tx.commit();
            if(!queryObject.list().isEmpty())
                return (String)queryObject.list().get(0);
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return "";
    }

    public Object[] getGoodByCNum(String CNum) {
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "select model.saleBomCode, model.itemCode, model.isBom, model.itemName from WmsDetailEntity as model where model.cNum = ?";
            Query queryObject = session.createQuery(queryString);
            queryObject.setParameter(0, CNum);
            tx.commit();
            if(!queryObject.list().isEmpty())
                return (Object[]) queryObject.list().get(0);
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public String getApplyDocCodeByCNum(String CNum){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "select model.applyDocCode from WmsDetailEntity as model where model.cNum = ?";
            Query queryObject = session.createQuery(queryString);
            queryObject.setParameter(0, CNum);
            tx.commit();
            if(!queryObject.list().isEmpty())
                return (String)queryObject.list().get(0);
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return "";
    }

    public void bind(int locationID, String CNum){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "update WmsDetailEntity as model set model.allocationId = ? where model.cNum = ?";
            Query queryObject = session.createQuery(queryString);
            queryObject.setParameter(0, locationID);
            queryObject.setParameter(1, CNum);
            queryObject.executeUpdate();
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public boolean isBom(String Code){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "select model.isBom from WmsDetailEntity as model where model.asnCode = ?";
            Query queryObject = session.createQuery(queryString);
            queryObject.setParameter(0, Code);
            tx.commit();
            if(!queryObject.list().isEmpty())
                return ((String)queryObject.list().get(0)).toUpperCase().equals("Y");
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    public List<Object[]> getBomDistinctGoods(String Code){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "select model.saleBomCode, count(*),sum(model.expectedQuantity) from WmsDetailEntity as model where asnCode = ? group by model.saleBomCode";
            Query query = session.createQuery(hql);
            query.setParameter(0, Code);
            tx.commit();
            return query.list();
        }catch (HibernateException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Object[]> getERPDistinctGoods(String Code){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "select model.itemCode, count(*), sum(model.expectedQuantity), model.itemName, model.itemUnitCode from WmsDetailEntity as model where asnCode = ? group by model.itemCode";
            Query query = session.createQuery(hql);
            query.setParameter(0, Code);
            tx.commit();
            return query.list();
        }catch (HibernateException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Integer> getLocationIDsByItemERPCode(String ItemERPCode){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "select allocationId from WmsDetailEntity as model where itemCode = ? group by model.itemCode";
            Query query = session.createQuery(hql);
            query.setParameter(0, ItemERPCode);
            tx.commit();
            return query.list();
        }catch (HibernateException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Object[]> getBomGoodsByLocation(int lid){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "select model.saleBomCode,sum(model.expectedQuantity)  from WmsDetailEntity as model where allocationId = ? and isBom = 'Y' group by model.saleBomCode ";
            Query query = session.createQuery(hql);
            query.setParameter(0, lid);
            List bomlist = query.list();
            tx.commit();
            return bomlist;
        }catch (HibernateException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Object[]> getERPGoodsByLocation(int lid){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "select model.itemCode, sum(model.expectedQuantity), model.itemName, model.itemUnitCode from WmsDetailEntity as model where allocationId = ? and isBom = 'N' group by model.itemCode";
            Query query = session.createQuery(hql);
            query.setParameter(0, lid);
            List erplist = query.list();
            tx.commit();
            return erplist;
        }catch (HibernateException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

}
