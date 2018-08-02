package deliveryorderfees.service;

import deliveryorderfees.model.DeliveryOrderFee;

import java.util.List;
import java.util.Optional;

public interface DeliveryOrderFeeService {

    List<DeliveryOrderFee> findAll();

    Optional<DeliveryOrderFee> findById(Integer id);

    DeliveryOrderFee save(DeliveryOrderFee deliveryOrderFee);

}
