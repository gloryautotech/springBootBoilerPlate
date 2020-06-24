package com.gatekeeper.gatekeeper.service;
import com.gatekeeper.gatekeeper.document.SocietyConfig;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Service
@Getter
public class MongoDBService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public String registerNewSociety(SocietyConfig data){
        try{
            SocietyConfig s = new SocietyConfig();
            s.setName("raj");
            SocietyConfig data1 = mongoTemplate.insert(s,"SocietyConfig");
            return data1.getId().toString();
        } catch(Exception e){
            return "Failed";
        }
    }


}

/*
mongo command to create an admin user

use gateKeeper
db.createUser(
  {
    user: "Admin",
    pwd:  "Admin123,   // or cleartext password
    roles: [ { role: "readWrite", db: "gateKeeper" },
             { role: "read", db: "reporting" } ]
  }
)
*/