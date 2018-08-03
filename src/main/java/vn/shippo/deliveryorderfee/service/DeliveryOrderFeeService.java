package vn.shippo.deliveryorderfee.service;

import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;

import java.util.List;
import java.util.Optional;

public interface DeliveryOrderFeeService {

    List<DeliveryOrderFee> findAll();

    Optional<DeliveryOrderFee> findById(Integer id);

    void save(DeliveryOrderFee deliveryOrderFee);

    void delete (Integer id);

    DeliveryOrderFee findByName(String name);

    boolean isDeliveryOrderExist(DeliveryOrderFee deliveryOrderFee);
}
