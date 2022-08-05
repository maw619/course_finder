package com.files.demo.dao;


import com.files.demo.model.MetaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<MetaData, Integer> {
}
