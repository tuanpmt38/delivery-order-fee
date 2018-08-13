package vn.shippo.deliveryorderfee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.shippo.deliveryorderfee.model.TransactionHistories;
import vn.shippo.deliveryorderfee.repository.TransactionHistoriesRepository;
import vn.shippo.deliveryorderfee.service.TransactionHistoriesService;

@Controller
@RequestMapping("/api")
public class TransactionHistoriesController {

    private TransactionHistoriesService transactionHistoriesService;
    @Autowired
    private TransactionHistoriesRepository transactionHistoriesRepository;

    @Autowired
    public TransactionHistoriesController(TransactionHistoriesService transactionHistoriesService){
        this.transactionHistoriesService = transactionHistoriesService;
    }

//    @RequestMapping(value = "/CustomerTransactions", method = RequestMethod.GET)
//    public ResponseEntity<List<TransactionHistories>> getCustomerTransactions(){
//
//        List<TransactionHistories> transectionHistories = transectionHistoriesService.findAll();
//        if(transectionHistories.isEmpty()){
//            return new ResponseEntity<List<TransactionHistories>>( HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<TransactionHistories>>(transectionHistories, HttpStatus.OK);
//    }

    @RequestMapping(value = "/customertransactions", method = RequestMethod.GET)
    public ResponseEntity<Page<TransactionHistories>> getCustomerTransactions(Pageable pageable){

        Page<TransactionHistories> transactionHistories = transactionHistoriesService.findAll(pageable);
        System.out.printf("list transaction:"+ transactionHistories);

        return new ResponseEntity<Page<TransactionHistories>>(transactionHistories, HttpStatus.OK);
    }

}
