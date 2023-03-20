package com.webapp.backend.controller;


import com.webapp.backend.model.Engineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataController {

    List<Engineer> listOfEngineers = new ArrayList<>();

    @GetMapping("/getEngineers")
    List<Engineer> getData(){
        Engineer engineer = new Engineer("1","Mani","level 4", "Software Engineer");
        listOfEngineers.add(engineer);
        return listOfEngineers;
    }

    @GetMapping("/getStatus")
    String returnStatus(String status){
       status = "INPROGRESS";
       return status;
    }
}
