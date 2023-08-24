package com.example.transactionmanagment.repos;

import com.example.transactionmanagment.entities.Singer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SingerRepository extends CrudRepository<Singer, Long> {
    @Query("select count(s) from Singer s")
    Long countAllSingers();
}
