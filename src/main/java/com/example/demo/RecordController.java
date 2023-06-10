package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin("*")
@RestController
public class RecordController {
    @Autowired
    private RecService recService;

    @GetMapping("/records")
    public List<Records> getRecords(){
        return recService.readAll();
    }

    @GetMapping("/records/search")
    public List<Records> searchRecords(@RequestParam String name) {
        return recService.searchByName(name);
    }


    }



