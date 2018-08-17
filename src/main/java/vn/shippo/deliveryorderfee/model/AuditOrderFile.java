package vn.shippo.deliveryorderfee.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the audit_order_file database table.
 *
 */
@Entity
@Table(name="audit_order_file")
@NamedQuery(name="AuditOrderFile.findAll", query="SELECT a FROM AuditOrderFile a")
public class AuditOrderFile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private Integer barcode;

    private String code;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="file_name")
    private String fileName;

    @Column(name="message")
    private String message;

    @Column(name="metadata")
    @JsonProperty
    private String metadata;

    @Column(name="order_id")
    private Integer orderId;

    @Column(name="status")
    private String status;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="version")
    private Integer version;

    public AuditOrderFile() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBarcode() {
        return this.barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
