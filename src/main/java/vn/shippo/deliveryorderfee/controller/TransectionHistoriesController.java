package vn.shippo.deliveryorderfee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.shippo.deliveryorderfee.model.TransectionHistories;
import vn.shippo.deliveryorderfee.service.TransectionHistoriesService;

import java.util.List;

@Controller
@RequestMapping("/transection/histories")
public class TransectionHistoriesController {

    private TransectionHistoriesService transectionHistoriesService;

    @Autowired
    public TransectionHistoriesController(TransectionHistoriesService transectionHistoriesService){
        this.transectionHistoriesService = transectionHistoriesService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<TransectionHistories>> listAll(){
        List<TransectionHistories> transectionHistories = transectionHistoriesService.findAll();
        if(transectionHistories.isEmpty()){
            return new ResponseEntity<List<TransectionHistories>>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<TransectionHistories>>(transectionHistories, HttpStatus.OK);
    }
}