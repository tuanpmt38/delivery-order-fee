package vn.shippo.deliveryorderfee.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "transection_histories")
public class TransectionHistories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String barCode;

    private Integer merchantId;

    private String finalMechantBalant;

    private String transAmount;

    private String transType;

    private String privateNote;

    private String transDetail;

    private String objectType;

    private Integer objectId;

    private String createdBy;

    private String complateBy;

    private Integer version;

    private Timestamp createAt;

    private Timestamp updateAt;

    public TransectionHistories(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getFinalMechantBalant() {
        return finalMechantBalant;
    }

    public void setFinalMechantBalant(String finalMechantBalant) {
        this.finalMechantBalant = finalMechantBalant;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getPrivateNote() {
        return privateNote;
    }

    public void setPrivateNote(String privateNote) {
        this.privateNote = privateNote;
    }

    public String getTransDetail() {
        return transDetail;
    }

    public void setTransDetail(String transDetail) {
        this.transDetail = transDetail;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getComplateBy() {
        return complateBy;
    }

    public void setComplateBy(String complateBy) {
        this.complateBy = complateBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "TransectionHistories{" +
                "id=" + id +
                ", barCode='" + barCode + '\'' +
                ", merchantId=" + merchantId +
                ", finalMechantBalant='" + finalMechantBalant + '\'' +
                ", transAmount='" + transAmount + '\'' +
                ", transType='" + transType + '\'' +
                ", privateNote='" + privateNote + '\'' +
                ", transDetail='" + transDetail + '\'' +
                ", objectType='" + objectType + '\'' +
                ", objectId=" + objectId +
                ", createdBy='" + createdBy + '\'' +
                ", complateBy='" + complateBy + '\'' +
                ", version=" + version +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
