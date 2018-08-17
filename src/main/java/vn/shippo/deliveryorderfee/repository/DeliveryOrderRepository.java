package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;

import java.util.List;

@Repository
public interface DeliveryOrderRepository extends PagingAndSortingRepository<DeliveryOrder, Integer>, JpaSpecificationExecutor<DeliveryOrder> {

    @Query(value = "select * from delivery_order d where d.barcode = ?1", nativeQuery = true)
    DeliveryOrder findByBarcode(String barcode);

    @Query(value = "select * from delivery_order d where (?1 or null) and(?2 or null) and(?3 or null)", nativeQuery = true)
    DeliveryOrder findByWhatever(String barcode, String orderState, String pickupContact);

}
