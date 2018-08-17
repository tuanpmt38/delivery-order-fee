package vn.shippo.deliveryorderfee.service;

import vn.shippo.deliveryorderfee.model.Merchant;

import java.util.List;
import java.util.Optional;

public interface MerchantService {

    void save(Merchant merchant);

    Optional<Merchant> findById (Integer id);

    List<Merchant> findAll();
}
