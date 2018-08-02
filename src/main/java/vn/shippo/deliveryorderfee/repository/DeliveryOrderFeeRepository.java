package vn.shippo.deliveryorderfee.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;

public interface DeliveryOrderFeeRepository extends PagingAndSortingRepository<DeliveryOrderFee, Integer> {

}
