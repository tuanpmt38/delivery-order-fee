package vn.shippo.deliveryorderfee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeliveryOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String barCode;

    private Integer merchantId;

    private Integer pickupLocationIdsPath;

    private String pickupLocationNamesPath;

    private Integer deliverLocationIdsPath;

    private String deliveLocationNamesPath;

    private String pickupPhone;

    private String contact;

    private String pickupDetailAddress;

    private String pickupFullAddress;

    private Integer state;

    private String merchantPrivateNote;




}
