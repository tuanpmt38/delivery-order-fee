package deliveryorderfees.repository;


import deliveryorderfees.model.DeliveryOrderFee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryOrderFeeRepository extends PagingAndSortingRepository<DeliveryOrderFee, Integer> {

}
