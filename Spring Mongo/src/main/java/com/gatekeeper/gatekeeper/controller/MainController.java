package com.gatekeeper.gatekeeper.controller;

import com.gatekeeper.gatekeeper.document.SocietyConfig;
import com.gatekeeper.gatekeeper.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(allowCredentials = "*", allowedHeaders = "*", methods = {RequestMethod.GET})
@RestController
public class MainController {

    @Autowired
    private MongoDBService dbservice;

    @PostMapping("/register-society")
    public String registerSociety(@RequestBody SocietyConfig data){
        String res = dbservice.registerNewSociety(data);
        return res;
    }

//    @PostMapping("/get-society-id")
//    public String getSocietyId(@RequestBody SocietyConfig data){
//        System.out.println("Got Request");
//        String res = dbservice.getSocietyId(data.getName());
//        return res;
//    }
}
