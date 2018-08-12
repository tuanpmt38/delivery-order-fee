package vn.shippo.deliveryorderfee.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.shippo.deliveryorderfee.model.MerchantPickupAddress;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public interface MerchantPickupAddressService {

    Page<MerchantPickupAddress> findAll(Pageable pageable);

    List<MerchantPickupAddress> findAll();

    Optional<MerchantPickupAddress> findById(Integer id);

    void save(MerchantPickupAddress merchantPickupAddress);

    void delete (Integer id);

}
