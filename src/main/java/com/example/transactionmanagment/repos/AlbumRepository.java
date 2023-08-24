package com.example.transactionmanagment.repos;

import com.example.transactionmanagment.entities.Album;
import com.example.transactionmanagment.entities.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Album> findBySinger(Singer singer);
}
