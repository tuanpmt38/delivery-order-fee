package vn.shippo.deliveryorderfee.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "transaction_histories")
public class TransactionHistories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String barcode;

    @Column(name="completed_by")
    private Integer completedBy;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="created_by")
    private Integer createdBy;

    @Column(name="final_merchant_balance")
    private double finalMerchantBalance;

    @Column(name="merchant_id")
    private Integer merchantId;

    @Column(name="object_id")
    private Integer objectId;

    @Column(name="object_type")
    private String objectType;

    @Column(name="private_note")
    private String privateNote;

    @Column(name="record_id")
    private Integer recordId;

    @Column(name="trans_amount")
    private double transAmount;

    @Column(name="trans_detail")
    private String transDetail;

    @Column(name="trans_type")
    private String transType;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    private Integer version;

    public TransactionHistories(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public void setTransAmount(Float transAmount) {
        this.transAmount = transAmount;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
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

    public Integer getCompletedBy() {
        return completedBy;
    }

    public void setCompletedBy(Integer completedBy) {
        this.completedBy = completedBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public double getFinalMerchantBalance() {
        return finalMerchantBalance;
    }

    public void setFinalMerchantBalance(double finalMerchantBalance) {
        this.finalMerchantBalance = finalMerchantBalance;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public double getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
