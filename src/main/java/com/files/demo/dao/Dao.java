package com.files.demo.dao;


import com.files.demo.model.MetaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Dao extends JpaRepository<MetaData, Integer> {

    List<MetaData> findByFullPathContainingIgnoreCase(String fullPath);
}
