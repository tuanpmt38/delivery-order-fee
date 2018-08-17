package vn.shippo.deliveryorderfee.service;

import vn.shippo.deliveryorderfee.model.DeliveryOrder;

import java.util.List;
import java.util.Optional;

public interface DeliveryOrderService {

    Optional<DeliveryOrder> findById(Integer id);

    DeliveryOrder findByBarcode(String barcode);

    Iterable<DeliveryOrder> findAll();

}
