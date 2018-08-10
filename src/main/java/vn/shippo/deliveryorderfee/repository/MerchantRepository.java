package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.Merchant;

@Repository
public interface MerchantRepository extends PagingAndSortingRepository<Merchant, Integer> {
}
