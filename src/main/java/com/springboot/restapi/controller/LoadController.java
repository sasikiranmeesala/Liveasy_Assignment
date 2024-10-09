package com.springboot.restapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.entity.LoadClass;
import com.springboot.restapi.service.ServiceImplimentation;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    private ServiceImplimentation serviceImplimentation;
    
   
    @PostMapping("/save")
    public ResponseEntity<String> saveload(@RequestBody LoadClass loadclass) {
        LoadClass saved = serviceImplimentation.saveload(loadclass);
        return ResponseEntity.status(HttpStatus.CREATED).body("Load details added successfully");
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<LoadClass> updateload(@PathVariable("id")long id, @RequestBody LoadClass loadclass) {
    	serviceImplimentation.loadid(id);		
        LoadClass updated = serviceImplimentation.update(loadclass);
        return  ResponseEntity.ok(updated);
    }
    
    
    @GetMapping("/shipperids")
    public ResponseEntity<List<String>> getAllShipperIds() {
        List<String> shipperIds = serviceImplimentation.shipperid();
        return ResponseEntity.ok(shipperIds);
    }
    
   
    @GetMapping("/loadall")
    public ResponseEntity<List<LoadClass>> getAllLoads() {
        List<LoadClass> allLoads = serviceImplimentation.loadall();
        return ResponseEntity.ok(allLoads);
    }
    
   
    @GetMapping("/{id}")
    public ResponseEntity<LoadClass> loadid(@PathVariable("id") long id) {
        LoadClass load = serviceImplimentation.loadid(id);
        if (load != null) {
            return ResponseEntity.ok(load);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    
   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleted(@PathVariable("id") long id) {
        serviceImplimentation.delete(id);
        return  ResponseEntity.status(HttpStatus.CREATED).body("Load details deleted successfully");  
    }
}
