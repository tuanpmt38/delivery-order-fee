package vn.shippo.deliveryorderfee.repository;


import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryOrderFeeRepository extends PagingAndSortingRepository<DeliveryOrderFee, Integer> {

}
