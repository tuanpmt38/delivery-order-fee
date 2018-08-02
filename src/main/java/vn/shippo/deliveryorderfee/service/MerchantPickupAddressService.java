package vn.shippo.deliveryorderfee.service;

import vn.shippo.deliveryorderfee.model.MerchantPickupAddress;

import java.util.List;

public interface MerchantPickupAddressService {

    List<MerchantPickupAddress> findAll();
}
