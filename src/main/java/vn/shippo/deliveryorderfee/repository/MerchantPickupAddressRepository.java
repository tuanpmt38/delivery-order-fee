package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.MerchantPickupAddress;

@Repository
public interface MerchantPickupAddressRepository extends PagingAndSortingRepository<MerchantPickupAddress, Integer> {

}
