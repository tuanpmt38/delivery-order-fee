package vn.shippo.deliveryorderfee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.shippo.deliveryorderfee.model.TransactionHistories;
import vn.shippo.deliveryorderfee.repository.TransactionHistoriesRepository;
import vn.shippo.deliveryorderfee.service.TransactionHistoriesService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class TransactionHistoriesController {

    private TransactionHistoriesService transactionHistoriesService;
    @Autowired
    private TransactionHistoriesRepository transactionHistoriesRepository;

    @Autowired
    public TransactionHistoriesController(TransactionHistoriesService transactionHistoriesService){
        this.transactionHistoriesService = transactionHistoriesService;
    }

    @RequestMapping(value = "/customer_transactions/", method = RequestMethod.GET)
    public ResponseEntity<List<TransactionHistories>> getAllCustomerTransactions(){

        List<TransactionHistories> transactionHistories = transactionHistoriesService.findAll();
        if(transactionHistories.isEmpty()){
            return new ResponseEntity<List<TransactionHistories>>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<TransactionHistories>>(transactionHistories, HttpStatus.OK);
    }

    @RequestMapping(value = "/transactions", method = RequestMethod.GET)
    public ResponseEntity<List<TransactionHistories>> getCustomerTransaction(
            @RequestParam("barcode") String barcode, @RequestParam("transtype") String transType){
        List<TransactionHistories> transactionHistories = transactionHistoriesService.findByBarcodeAndTransType(barcode, transType);
        if(transactionHistories.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(transactionHistories, HttpStatus.OK);
    }
}
