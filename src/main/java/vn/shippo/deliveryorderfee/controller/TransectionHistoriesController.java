package vn.shippo.deliveryorderfee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.shippo.deliveryorderfee.model.TransactionHistories;
import vn.shippo.deliveryorderfee.repository.TransectionHistoriesRepository;
import vn.shippo.deliveryorderfee.service.TransectionHistoriesService;

import java.util.List;

@Controller
@RequestMapping("/api")
public class TransectionHistoriesController {

    private TransectionHistoriesService transectionHistoriesService;
    @Autowired
    private TransectionHistoriesRepository transectionHistoriesRepository;

    @Autowired
    public TransectionHistoriesController(TransectionHistoriesService transectionHistoriesService){
        this.transectionHistoriesService = transectionHistoriesService;
    }

    @RequestMapping(value = "/CustomerTransactions", method = RequestMethod.GET)
    public ResponseEntity<List<TransactionHistories>> getCustomerTransactions(){

        List<TransactionHistories> transectionHistories = transectionHistoriesService.findAll();
        if(transectionHistories.isEmpty()){
            return new ResponseEntity<List<TransactionHistories>>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<TransactionHistories>>(transectionHistories, HttpStatus.OK);
    }

}
