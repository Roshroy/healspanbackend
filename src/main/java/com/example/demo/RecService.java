package com.example.demo;

import java.util.List;

public interface RecService {
    List<Records> readAll();
    List<Records> searchByName(String name);

}
