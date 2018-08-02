package vn.shippo.deliveryorderfee.service;

import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;

import java.util.List;

public interface DeliveryOrderFeeService {

    List<DeliveryOrderFee> getAll();

    void save(DeliveryOrderFee deliveryOrderFee);
}
