package vn.shippo.deliveryorderfee.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class MerchantPickupAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer isDeleted;

    private String createdBy;

    private Integer merchantId;

    private String pickupDetailAddress;

    private String pickupLocaltionIdsParth;

    private String pickupContactName;

    private String pickupContactPhone;

    private String pickupFullAddress;

    private String pickupLocationNamePath;

    private Integer version;

    private Timestamp createdAt;

    private Timestamp updateAt;

    public MerchantPickupAddress(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getPickupDetailAddress() {
        return pickupDetailAddress;
    }

    public void setPickupDetailAddress(String pickupDetailAddress) {
        this.pickupDetailAddress = pickupDetailAddress;
    }

    public String getPickupLocaltionIdsParth() {
        return pickupLocaltionIdsParth;
    }

    public void setPickupLocaltionIdsParth(String pickupLocaltionIdsParth) {
        this.pickupLocaltionIdsParth = pickupLocaltionIdsParth;
    }

    public String getPickupContactName() {
        return pickupContactName;
    }

    public void setPickupContactName(String pickupContactName) {
        this.pickupContactName = pickupContactName;
    }

    public String getPickupContactPhone() {
        return pickupContactPhone;
    }

    public void setPickupContactPhone(String pickupContactPhone) {
        this.pickupContactPhone = pickupContactPhone;
    }

    public String getPickupFullAddress() {
        return pickupFullAddress;
    }

    public void setPickupFullAddress(String pickupFullAddress) {
        this.pickupFullAddress = pickupFullAddress;
    }

    public String getPickupLocationNamePath() {
        return pickupLocationNamePath;
    }

    public void setPickupLocationNamePath(String pickupLocationNamePath) {
        this.pickupLocationNamePath = pickupLocationNamePath;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "MerchantPickupAddress{" +
                "id=" + id +
                ", isDeleted=" + isDeleted +
                ", createdBy='" + createdBy + '\'' +
                ", merchantId=" + merchantId +
                ", pickupDetailAddress='" + pickupDetailAddress + '\'' +
                ", pickupLocaltionIdsParth='" + pickupLocaltionIdsParth + '\'' +
                ", pickupContactName='" + pickupContactName + '\'' +
                ", pickupContactPhone='" + pickupContactPhone + '\'' +
                ", pickupFullAddress='" + pickupFullAddress + '\'' +
                ", pickupLocationNamePath='" + pickupLocationNamePath + '\'' +
                ", version=" + version +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
