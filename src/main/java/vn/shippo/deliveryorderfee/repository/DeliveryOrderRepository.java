package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;

@Repository
public interface DeliveryOrderRepository extends PagingAndSortingRepository<DeliveryOrder, Integer> {

    @Query(value = "select * from delivery_order d where d.bar_code = ?1", nativeQuery = true)
    DeliveryOrder findByBarCode(String barCode);
}
