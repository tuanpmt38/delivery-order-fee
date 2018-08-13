package vn.shippo.deliveryorderfee.service;

import vn.shippo.deliveryorderfee.model.DeliveryOrder;

public interface DeliveryOrderService {

    DeliveryOrder findByBarCode(String barCode);

}
