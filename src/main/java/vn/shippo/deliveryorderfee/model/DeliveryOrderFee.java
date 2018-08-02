package vn.shippo.deliveryorderfee.model;

import javax.persistence.*;

@Entity
@Table(name = "delivery_order_fee")
public class DeliveryOrderFee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer serviceFeeId;

    private Integer orderId;

    private String feeName;

    private String feeCode;

    private String unitPrice;

    private Float quantity;

    private Float rawAmount;

    private Float realAmount;

    private Integer isManual;

    private String feeGroup;

    private Integer isDeleted;

    private String note;

    private String changeType;

    private Integer version;

    public DeliveryOrderFee(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceFeeId() {
        return serviceFeeId;
    }

    public void setServiceFeeId(Integer serviceFeeId) {
        this.serviceFeeId = serviceFeeId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getRawAmount() {
        return rawAmount;
    }

    public void setRawAmount(Float rawAmount) {
        this.rawAmount = rawAmount;
    }

    public Float getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Float realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getIsManual() {
        return isManual;
    }

    public void setIsManual(Integer isManual) {
        this.isManual = isManual;
    }

    public String getFeeGroup() {
        return feeGroup;
    }

    public void setFeeGroup(String feeGroup) {
        this.feeGroup = feeGroup;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "DeliveryOrderFee{" +
                "id=" + id +
                ", serviceFeeId=" + serviceFeeId +
                ", orderId=" + orderId +
                ", feeName='" + feeName + '\'' +
                ", feeCode='" + feeCode + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", quantity=" + quantity +
                ", rawAmount=" + rawAmount +
                ", realAmount=" + realAmount +
                ", isManual=" + isManual +
                ", feeGroup='" + feeGroup + '\'' +
                ", isDeleted=" + isDeleted +
                ", note='" + note + '\'' +
                ", changeType='" + changeType + '\'' +
                ", version=" + version +

                '}';
    }
}
