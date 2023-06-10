package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecServiceImplementation implements RecService{
    @Autowired
    private final RecordsRepositry recRepo;
    @Autowired
    public RecServiceImplementation(RecordsRepositry recordsRepository) {
        this.recRepo = recordsRepository;
    }
    @Override
    public List<Records> readAll() {
         return recRepo.findAll();
    }

    @Override
    public List<Records> searchByName(String name) {
        return recRepo.searchRecords(name);
    }




}
