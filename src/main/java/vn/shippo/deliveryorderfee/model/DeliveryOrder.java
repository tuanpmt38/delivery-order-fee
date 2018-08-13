package vn.shippo.deliveryorderfee.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "delivery_order")
public class DeliveryOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String barCode;

    private Integer merchantId;

    private Integer pickupLocationIdsPath;

    private String pickupLocationNamesPath;

    private Integer deliverLocationIdsPath;

    private String deliverLocationNamesPath;

    private String pickupPhone;

    private String contact;

    private String pickupDetailAddress;

    private String pickupFullAddress;

    private String state;

    private String merchantPrivateNote;

    private String deliverNote;

    private Float weight;

    private Integer pickupWarehouseId;

    private Integer deliverWarehouseId;

    private Float cod;

    private String orderState;

    private Integer currentWarehouseId;

    private String currentWarehouseState;

    private boolean isReturn;

    private Float realCod;

    private String createFromOrder;

    private Float totalFee;

    private Float merchantFee;

    private String createMethod;

    private String pickupNote;

    private String goads;

    private String merchantOrderCode;

    private Timestamp timeline;

    private Timestamp pickupTimes;

    private Timestamp deliverTimes;

    private Integer version;

    public String getDeliverLocationNamesPath() {
        return deliverLocationNamesPath;
    }

    public void setDeliverLocationNamesPath(String deliverLocationNamesPath) {
        this.deliverLocationNamesPath = deliverLocationNamesPath;
    }

    public DeliveryOrder(){}

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

    public Integer getPickupLocationIdsPath() {
        return pickupLocationIdsPath;
    }

    public void setPickupLocationIdsPath(Integer pickupLocationIdsPath) {
        this.pickupLocationIdsPath = pickupLocationIdsPath;
    }

    public String getPickupLocationNamesPath() {
        return pickupLocationNamesPath;
    }

    public void setPickupLocationNamesPath(String pickupLocationNamesPath) {
        this.pickupLocationNamesPath = pickupLocationNamesPath;
    }

    public Integer getDeliverLocationIdsPath() {
        return deliverLocationIdsPath;
    }

    public void setDeliverLocationIdsPath(Integer deliverLocationIdsPath) {
        this.deliverLocationIdsPath = deliverLocationIdsPath;
    }

    public String getDeliveLocationNamesPath() {
        return deliverLocationNamesPath;
    }

    public void setDeliveLocationNamesPath(String deliveLocationNamesPath) {
        this.deliverLocationNamesPath = deliveLocationNamesPath;
    }

    public String getPickupPhone() {
        return pickupPhone;
    }

    public void setPickupPhone(String pickupPhone) {
        this.pickupPhone = pickupPhone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPickupDetailAddress() {
        return pickupDetailAddress;
    }

    public void setPickupDetailAddress(String pickupDetailAddress) {
        this.pickupDetailAddress = pickupDetailAddress;
    }

    public String getPickupFullAddress() {
        return pickupFullAddress;
    }

    public void setPickupFullAddress(String pickupFullAddress) {
        this.pickupFullAddress = pickupFullAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMerchantPrivateNote() {
        return merchantPrivateNote;
    }

    public void setMerchantPrivateNote(String merchantPrivateNote) {
        this.merchantPrivateNote = merchantPrivateNote;
    }

    public String getDeliverNote() {
        return deliverNote;
    }

    public void setDeliverNote(String deliverNote) {
        this.deliverNote = deliverNote;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getPickupWarehouseId() {
        return pickupWarehouseId;
    }

    public void setPickupWarehouseId(Integer pickupWarehouseId) {
        this.pickupWarehouseId = pickupWarehouseId;
    }

    public Integer getDeliverWarehouseId() {
        return deliverWarehouseId;
    }

    public void setDeliverWarehouseId(Integer deliverWarehouseId) {
        this.deliverWarehouseId = deliverWarehouseId;
    }

    public Float getCod() {
        return cod;
    }

    public void setCod(Float cod) {
        this.cod = cod;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Integer getCurrentWarehouseId() {
        return currentWarehouseId;
    }

    public void setCurrentWarehouseId(Integer currentWarehouseId) {
        this.currentWarehouseId = currentWarehouseId;
    }

    public String getCurrentWarehouseState() {
        return currentWarehouseState;
    }

    public void setCurrentWarehouseState(String currentWarehouseState) {
        this.currentWarehouseState = currentWarehouseState;
    }

    public boolean isReturn() {
        return isReturn;
    }

    public void setReturn(boolean aReturn) {
        isReturn = aReturn;
    }

    public Float getRealCod() {
        return realCod;
    }

    public void setRealCod(Float realCod) {
        this.realCod = realCod;
    }

    public String getCreateFromOrder() {
        return createFromOrder;
    }

    public void setCreateFromOrder(String createFromOrder) {
        this.createFromOrder = createFromOrder;
    }

    public Float getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Float totalFee) {
        this.totalFee = totalFee;
    }

    public Float getMerchantFee() {
        return merchantFee;
    }

    public void setMerchantFee(Float merchantFee) {
        this.merchantFee = merchantFee;
    }

    public String getCreateMethod() {
        return createMethod;
    }

    public void setCreateMethod(String createMethod) {
        this.createMethod = createMethod;
    }

    public String getPickupNote() {
        return pickupNote;
    }

    public void setPickupNote(String pickupNote) {
        this.pickupNote = pickupNote;
    }

    public String getGoads() {
        return goads;
    }

    public void setGoads(String goads) {
        this.goads = goads;
    }

    public String getMerchantOrderCode() {
        return merchantOrderCode;
    }

    public void setMerchantOrderCode(String merchantOrderCode) {
        this.merchantOrderCode = merchantOrderCode;
    }

    public Timestamp getTimeline() {
        return timeline;
    }

    public void setTimeline(Timestamp timeline) {
        this.timeline = timeline;
    }

    public Timestamp getPickupTimes() {
        return pickupTimes;
    }

    public void setPickupTimes(Timestamp pickupTimes) {
        this.pickupTimes = pickupTimes;
    }

    public Timestamp getDeliverTimes() {
        return deliverTimes;
    }

    public void setDeliverTimes(Timestamp deliverTimes) {
        this.deliverTimes = deliverTimes;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "id=" + id +
                ", barCode='" + barCode + '\'' +
                ", merchantId=" + merchantId +
                ", pickupLocationIdsPath=" + pickupLocationIdsPath +
                ", pickupLocationNamesPath='" + pickupLocationNamesPath + '\'' +
                ", deliverLocationIdsPath=" + deliverLocationIdsPath +
                ", deliveLocationNamesPath='" + deliverLocationNamesPath + '\'' +
                ", pickupPhone='" + pickupPhone + '\'' +
                ", contact='" + contact + '\'' +
                ", pickupDetailAddress='" + pickupDetailAddress + '\'' +
                ", pickupFullAddress='" + pickupFullAddress + '\'' +
                ", state=" + state +
                ", merchantPrivateNote='" + merchantPrivateNote + '\'' +
                ", deliverNote='" + deliverNote + '\'' +
                ", weight=" + weight +
                ", pickupWarehouseId=" + pickupWarehouseId +
                ", deliverWarehouseId=" + deliverWarehouseId +
                ", cod=" + cod +
                ", orderState='" + orderState + '\'' +
                ", currentWarehouseId=" + currentWarehouseId +
                ", currentWarehouseState='" + currentWarehouseState + '\'' +
                ", isReturn=" + isReturn +
                ", realCod=" + realCod +
                ", createFromOrder='" + createFromOrder + '\'' +
                ", totalFee=" + totalFee +
                ", merchantFee=" + merchantFee +
                ", createMethod='" + createMethod + '\'' +
                ", pickupNote='" + pickupNote + '\'' +
                ", goads='" + goads + '\'' +
                ", merchantOrderCode='" + merchantOrderCode + '\'' +
                ", timeline=" + timeline +
                ", pickupTimes=" + pickupTimes +
                ", deliverTimes=" + deliverTimes +
                ", version=" + version +
                '}';
    }
}
