package com.example.transactionmanagment.service;

import com.example.transactionmanagment.entities.Singer;
import com.example.transactionmanagment.repos.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.google.common.collect.Lists;
import java.util.List;

@Service
@Transactional
public class SingerServiceImpl implements SingerService {

    private final SingerRepository singerRepository;

    @Autowired
    public SingerServiceImpl(SingerRepository singerRepository) {
        this.singerRepository = singerRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Singer> findAll() {
        return Lists.newArrayList(singerRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Singer findById(Long id) {
        return singerRepository.findById(id).get();
    }

    @Override
    public Singer save(Singer singer) {
        return singerRepository.save(singer);
    }

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public long countAll() {
        return singerRepository.countAllSingers();
    }
}
