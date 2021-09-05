package com.com.visitors.api;

import com.com.visitors.domain.Visitor;
import com.com.visitors.service.VisitorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/visitor")
public class VisitorController {

    Logger log = LoggerFactory.getLogger(VisitorController.class);


    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Visitor>> getAllVisitors(){
        List<Visitor> visitors= visitorService.getAllVisitors();
        log.debug("Visitors : "+visitors);
        return new ResponseEntity<>(visitors,HttpStatus.OK);
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<Visitor> findVisitorById(@PathVariable("id") Long id){
        Visitor visitor= visitorService.findVisitorById(id);
        return new ResponseEntity<>(visitor,HttpStatus.OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Visitor> addVisitor(@RequestParam Visitor visitor){
        Visitor visitor1 =visitorService.addVisitor(visitor);
        return new ResponseEntity<>(visitor1, HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Visitor> updateVisitor(@RequestParam Visitor visitor){
        Visitor visitor1= visitorService.updateVisitor(visitor);
        return new ResponseEntity<>(visitor1,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVisitor(@PathVariable("id") Long id){
        visitorService.deleteVisitor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
