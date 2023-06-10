package com.example.ekz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ekz.services.RDMserv;
import com.example.ekz.model.RdmModel;

import javax.xml.crypto.Data;

@RestController
@RequestMapping("/rdm")
public class Rdm {

    @Autowired
    RDMserv RDMService;

    @PostMapping("")
    public ResponseEntity<?> insert(@RequestBody RdmModel rdm) {
    int a= 5;
    int b = 15;

    int c = b - a;
    int r = (int) ((Math.random()*((c)+1))+a);
    Data.add(new RdmModel(rdm.id, rdm.rdm));
    RDMService.save(r);
    return new ResponseEntity<>(HttpStatus.OK);
    }
}
