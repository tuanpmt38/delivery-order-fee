package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;

@Repository
public interface DeliveryOrderRepository extends PagingAndSortingRepository<DeliveryOrder, Integer> {

    @Query(value = "select * from delivery_order d where d.barcode = ?1", nativeQuery = true)
    DeliveryOrder findByBarcode(String barcode);

    @Query(value = "select * from delivery_order d where d.barcode = ?1 and d.order_state = ?2 and d.pickup_contact = ?3", nativeQuery = true)
    DeliveryOrder findByBarcodeAndOrderStateAndPickupContact(String barcode, String orderState, String pickupContact);
}
