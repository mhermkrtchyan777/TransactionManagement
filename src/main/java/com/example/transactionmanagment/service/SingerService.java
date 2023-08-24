package com.example.transactionmanagment.service;

import com.example.transactionmanagment.entities.Singer;

import java.util.List;

public interface SingerService {
    List<Singer> findAll();

    Singer findById(Long id);

    Singer save(Singer singer);

    long countAll();
}
