package db;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by richard on 2015/12/6.
 */
@Entity
@Table(name = "transport", schema = "mobile", catalog = "")
public class TransportEntity {
    private String charge;
    private Timestamp time;
    private String position;
    private Integer type;
    private String posApplyDocCode;
    private Double longitude;
    private Double latitude;

    @Basic
    @Column(name = "CHARGE")
    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Basic
    @Column(name = "TIME")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "POSITION")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "TYPE")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "POS_APPLY_DOC_CODE")
    public String getPosApplyDocCode() {
        return posApplyDocCode;
    }

    public void setPosApplyDocCode(String posApplyDocCode) {
        this.posApplyDocCode = posApplyDocCode;
    }

    @Basic
    @Column(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransportEntity that = (TransportEntity) o;

        if (charge != null ? !charge.equals(that.charge) : that.charge != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (posApplyDocCode != null ? !posApplyDocCode.equals(that.posApplyDocCode) : that.posApplyDocCode != null)
            return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = charge != null ? charge.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (posApplyDocCode != null ? posApplyDocCode.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        return result;
    }
}