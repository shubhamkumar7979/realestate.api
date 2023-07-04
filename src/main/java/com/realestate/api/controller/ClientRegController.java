package com.realestate.api.controller;

import com.realestate.api.entity.ClientReg;
import com.realestate.api.service.ClientRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientReg")
public class ClientRegController {

    @Autowired
    private ClientRegService clientRegService;

    //http://localhost:8080/api/clientReg
    @PostMapping()
    public ResponseEntity<ClientReg> postClientRegId(@RequestBody ClientReg clientReg) {
        ClientReg reg = clientRegService.postClientId(clientReg);
        return new ResponseEntity<>(reg, HttpStatus.CREATED);
    }

    //http://localhost:8080/api/clientReg/id
    @GetMapping("/{id}")
    public ResponseEntity<ClientReg> showOneId(@PathVariable ("id") long id){
       ClientReg reg =  clientRegService.postOneId(id);
    return new ResponseEntity<>(reg, HttpStatus.OK);
    }

    //http://localhost:8080/api/clientReg
    @GetMapping
    public List<ClientReg> showAllId() {
        return clientRegService.showAllId();
    }

    //http://localhost:8080/api/clientReg/id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") long id) {
        ClientReg reg = clientRegService.deleteById(id);
        return new ResponseEntity<>("your id is deleted", HttpStatus.OK);
    }

    //http://localhost:8080/api/clientReg/id
    @PutMapping("/{id}")
    public ResponseEntity<ClientReg> updateById(@PathVariable("id") long id,
                                                @RequestBody ClientReg clientReg){
        ClientReg reg = clientRegService.updateById(clientReg, id);
    return new ResponseEntity<>(reg, HttpStatus.OK);

    }



    }
