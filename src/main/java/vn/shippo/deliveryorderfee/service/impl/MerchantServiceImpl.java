package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.shippo.deliveryorderfee.model.Merchant;
import vn.shippo.deliveryorderfee.repository.MerchantRepository;
import vn.shippo.deliveryorderfee.service.MerchantService;

import java.util.List;
import java.util.Optional;

@Service
public class MerchantServiceImpl implements MerchantService {

    private MerchantRepository merchantRepository;

    @Autowired
    public MerchantServiceImpl(MerchantRepository merchantRepository){
        this.merchantRepository = merchantRepository;
    }
    @Override
    public void save(Merchant merchant) {
        merchantRepository.save(merchant);
    }

    @Override
    public Optional<Merchant> findById(Integer id) {
        return merchantRepository.findById(id);
    }

    @Override
    public List<Merchant> findAll() {
        return (List<Merchant>) merchantRepository.findAll();
    }
}
