package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.MerchantPickupAddress;

import java.util.List;

@Repository
public interface MerchantPickupAddressRepository extends PagingAndSortingRepository<MerchantPickupAddress, Integer> {

    @Query(value = "select * from merchant_pickup_address m where m.pickup_contact_name = ?1 " +
            "and m.pickup_contact_phone = ?2",nativeQuery = true)
    MerchantPickupAddress findAllByPickupContactNameAndPickupContactPhone(String pickupContactName, String pickupContactPhone);
}
