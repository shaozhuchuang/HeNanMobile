package client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import rfid.service.ASN;
import rfid.service.POS;
import rfid.service.RFIDService;

import java.util.Iterator;
import java.util.List;

/**
 * Created by richard on 2015/12/9.
 */
public class RFIDClient {
    public static void main(String[] args) {
        try {
            // 设置调用的服务地址为本地，端口为 7777
            TTransport transport = new TSocket("192.168.1.178", 7777);
            transport.open();
            // 设置传输协议为 TBinaryProtocol
            TProtocol protocol = new TBinaryProtocol(transport);
            RFIDService.Client client = new RFIDService.Client(protocol);
            List<POS> list = client.getApplySheets();
            for(Iterator it = list.iterator();it.hasNext();){
                POS asn = (POS)it.next();
                System.out.println(asn.getApply_Doc_Code());
            }
            transport.close();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
