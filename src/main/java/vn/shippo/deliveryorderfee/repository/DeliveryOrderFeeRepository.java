package vn.shippo.deliveryorderfee.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;

@Repository
public interface DeliveryOrderFeeRepository extends PagingAndSortingRepository<DeliveryOrderFee, Integer> {

}
