package vn.shippo.deliveryorderfee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Builder
@AllArgsConstructor

@Entity
@Table(name = "merchant_pickup_address")
public class MerchantPickupAddress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="is_deleted")
    private Integer isDeleted;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="merchant_id")
    private Integer merchantId;

    @Column(name="detail_address")
    private String detailAddress;

    @Column(name="contact_name")
    private String contactName;

    @Column(name="contact_phone")
    private String contactPhone;

    @Column(name="full_address")
    private String fullAddress;

    @Column(name="location_ids_path")
    private Integer locationIdsPath;

    @Column(name="location_names_path")
    private String locationNamesPath;

    private Integer version;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

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

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Integer getLocationIdsPath() {
        return locationIdsPath;
    }

    public void setLocationIdsPath(Integer locationIdsPath) {
        this.locationIdsPath = locationIdsPath;
    }

    public String getLocationNamesPath() {
        return locationNamesPath;
    }

    public void setLocationNamesPath(String locationNamesPath) {
        this.locationNamesPath = locationNamesPath;
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
