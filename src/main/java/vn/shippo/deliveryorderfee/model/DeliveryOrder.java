package vn.shippo.deliveryorderfee.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the delivery_order database table.
 *
 */
@Entity
@Table(name="delivery_order")
//@NamedQuery(name="DeliveryOrder.findAll", query="SELECT d FROM DeliveryOrder d")
public class DeliveryOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String barcode;

    private double cod;

    @Column(name = "create_from_order")
    private Integer createFromOrder;

    @Column(name = "create_method")
    private String createMethod;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "current_warehouse_id")
    private Integer currentWarehouseId;

    @Column(name = "current_warehouse_state")
    private String currentWarehouseState;

    @Column(name = "deliver_contact")
    private String deliverContact;

    @Column(name = "deliver_detail_address")
    private String deliverDetailAddress;

    @Column(name = "deliver_full_address")
    private String deliverFullAddress;

    @Column(name = "deliver_location_ids_path")
    private String deliverLocationIdsPath;

    @Column(name = "deliver_location_names_path")
    private String deliverLocationNamesPath;

    @Column(name = "deliver_phone")
    private String deliverPhone;

    @Column(name = "deliver_times")
    private Integer deliverTimes;

    @Column(name = "deliver_warehouse_id")
    private Integer deliverWarehouseId;

    @Column(name = "delivery_note")
    private String deliveryNote;

    @Column(name = "export_warehouse_at")
    private Timestamp exportWarehouseAt;

//    private Object features;

    private String goods;

    @Column(name = "import_warehouse_at")
    private Timestamp importWarehouseAt;

    @Column(name = "is_return")
    private Boolean isReturn;

    @Column(name = "merchant_id")
    private Integer merchantId;

    @Column(name = "merchant_order_code")
    private String merchantOrderCode;

    @Column(name = "merchant_private_note")
    private String merchantPrivateNote;

    @Column(name = "order_state")
    private String orderState;

    @Column(name = "pickup_contact")
    private String pickupContact;

    @Column(name = "pickup_detail_address")
    private String pickupDetailAddress;

    @Column(name = "pickup_full_address")
    private String pickupFullAddress;

    @Column(name = "pickup_location_ids_path")
    private String pickupLocationIdsPath;

    @Column(name = "pickup_location_names_path")
    private String pickupLocationNamesPath;

    @Column(name = "pickup_note")
    private String pickupNote;

    @Column(name = "pickup_phone")
    private String pickupPhone;

    @Column(name = "pickup_times")
    private Integer pickupTimes;

    @Column(name = "pickup_warehouse_id")
    private Integer pickupWarehouseId;

    @Column(name = "real_cod")
    private double realCod;

    private String state;

//    private Object timeline;

    @Column(name = "total_fee")
    private double totalFee;

    @Column(name = "total_merchant_fee")
    private double totalMerchantFee;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    private Integer version;

    private Integer weight;

    public DeliveryOrder() {
    }

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

    public double getCod() {
        return cod;
    }

    public void setCod(double cod) {
        this.cod = cod;
    }

    public Integer getCreateFromOrder() {
        return createFromOrder;
    }

    public void setCreateFromOrder(Integer createFromOrder) {
        this.createFromOrder = createFromOrder;
    }

    public String getCreateMethod() {
        return createMethod;
    }

    public void setCreateMethod(String createMethod) {
        this.createMethod = createMethod;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
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

    public String getDeliverContact() {
        return deliverContact;
    }

    public void setDeliverContact(String deliverContact) {
        this.deliverContact = deliverContact;
    }

    public String getDeliverDetailAddress() {
        return deliverDetailAddress;
    }

    public void setDeliverDetailAddress(String deliverDetailAddress) {
        this.deliverDetailAddress = deliverDetailAddress;
    }

    public String getDeliverFullAddress() {
        return deliverFullAddress;
    }

    public void setDeliverFullAddress(String deliverFullAddress) {
        this.deliverFullAddress = deliverFullAddress;
    }

    public String getDeliverLocationIdsPath() {
        return deliverLocationIdsPath;
    }

    public void setDeliverLocationIdsPath(String deliverLocationIdsPath) {
        this.deliverLocationIdsPath = deliverLocationIdsPath;
    }

    public String getDeliverLocationNamesPath() {
        return deliverLocationNamesPath;
    }

    public void setDeliverLocationNamesPath(String deliverLocationNamesPath) {
        this.deliverLocationNamesPath = deliverLocationNamesPath;
    }

    public String getDeliverPhone() {
        return deliverPhone;
    }

    public void setDeliverPhone(String deliverPhone) {
        this.deliverPhone = deliverPhone;
    }

    public Integer getDeliverTimes() {
        return deliverTimes;
    }

    public void setDeliverTimes(Integer deliverTimes) {
        this.deliverTimes = deliverTimes;
    }

    public Integer getDeliverWarehouseId() {
        return deliverWarehouseId;
    }

    public void setDeliverWarehouseId(Integer deliverWarehouseId) {
        this.deliverWarehouseId = deliverWarehouseId;
    }

    public String getDeliveryNote() {
        return deliveryNote;
    }

    public void setDeliveryNote(String deliveryNote) {
        this.deliveryNote = deliveryNote;
    }

    public Timestamp getExportWarehouseAt() {
        return exportWarehouseAt;
    }

    public void setExportWarehouseAt(Timestamp exportWarehouseAt) {
        this.exportWarehouseAt = exportWarehouseAt;
    }

//    public Object getFeatures() {
//        return features;
//    }
//
//    public void setFeatures(Object features) {
//        this.features = features;
//    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Timestamp getImportWarehouseAt() {
        return importWarehouseAt;
    }

    public void setImportWarehouseAt(Timestamp importWarehouseAt) {
        this.importWarehouseAt = importWarehouseAt;
    }

    public Boolean getReturn() {
        return isReturn;
    }

    public void setReturn(Boolean aReturn) {
        isReturn = aReturn;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantOrderCode() {
        return merchantOrderCode;
    }

    public void setMerchantOrderCode(String merchantOrderCode) {
        this.merchantOrderCode = merchantOrderCode;
    }

    public String getMerchantPrivateNote() {
        return merchantPrivateNote;
    }

    public void setMerchantPrivateNote(String merchantPrivateNote) {
        this.merchantPrivateNote = merchantPrivateNote;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getPickupContact() {
        return pickupContact;
    }

    public void setPickupContact(String pickupContact) {
        this.pickupContact = pickupContact;
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

    public String getPickupLocationIdsPath() {
        return pickupLocationIdsPath;
    }

    public void setPickupLocationIdsPath(String pickupLocationIdsPath) {
        this.pickupLocationIdsPath = pickupLocationIdsPath;
    }

    public String getPickupLocationNamesPath() {
        return pickupLocationNamesPath;
    }

    public void setPickupLocationNamesPath(String pickupLocationNamesPath) {
        this.pickupLocationNamesPath = pickupLocationNamesPath;
    }

    public String getPickupNote() {
        return pickupNote;
    }

    public void setPickupNote(String pickupNote) {
        this.pickupNote = pickupNote;
    }

    public String getPickupPhone() {
        return pickupPhone;
    }

    public void setPickupPhone(String pickupPhone) {
        this.pickupPhone = pickupPhone;
    }

    public Integer getPickupTimes() {
        return pickupTimes;
    }

    public void setPickupTimes(Integer pickupTimes) {
        this.pickupTimes = pickupTimes;
    }

    public Integer getPickupWarehouseId() {
        return pickupWarehouseId;
    }

    public void setPickupWarehouseId(Integer pickupWarehouseId) {
        this.pickupWarehouseId = pickupWarehouseId;
    }

    public double getRealCod() {
        return realCod;
    }

    public void setRealCod(double realCod) {
        this.realCod = realCod;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

//    public Object getTimeline() {
//        return timeline;
//    }
//
//    public void setTimeline(Object timeline) {
//        this.timeline = timeline;
//    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public double getTotalMerchantFee() {
        return totalMerchantFee;
    }

    public void setTotalMerchantFee(double totalMerchantFee) {
        this.totalMerchantFee = totalMerchantFee;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
