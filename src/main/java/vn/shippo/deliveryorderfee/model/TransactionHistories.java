package vn.shippo.deliveryorderfee.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "transaction_histories")
public class TransactionHistories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String barCode;

    private Integer merchantId;

    private Float finalMechantBalance;

    private Float transAmount;

    private String transType;

    private String privateNote;

    private String transDetail;

    private String objectType;

    private Integer objectId;

    private Integer createdBy;

    private Integer complateBy;

    private String recodeId;

    private Integer version;

    private Timestamp createAt;

    private Timestamp updateAt;

    public TransactionHistories(){}

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

    public Float getFinalMechantBalance() {
        return finalMechantBalance;
    }

    public void setFinalMechantBalance(Float finalMechantBalance) {
        this.finalMechantBalance = finalMechantBalance;
    }

    public void setTransAmount(Float transAmount) {
        this.transAmount = transAmount;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public void setComplateBy(Integer complateBy) {
        this.complateBy = complateBy;
    }

    public String getRecodeId() {
        return recodeId;
    }

    public void setRecodeId(String recodeId) {
        this.recodeId = recodeId;
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
        return "TransactionHistories{" +
                "id=" + id +
                ", barCode='" + barCode + '\'' +
                ", merchantId=" + merchantId +
                ", finalMechantBalance=" + finalMechantBalance +
                ", transAmount=" + transAmount +
                ", transType='" + transType + '\'' +
                ", privateNote='" + privateNote + '\'' +
                ", transDetail='" + transDetail + '\'' +
                ", objectType='" + objectType + '\'' +
                ", objectId=" + objectId +
                ", createdBy=" + createdBy +
                ", complateBy=" + complateBy +
                ", recodeId='" + recodeId + '\'' +
                ", version=" + version +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
