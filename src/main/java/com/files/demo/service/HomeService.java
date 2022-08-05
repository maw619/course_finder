package com.files.demo.service;

import com.files.demo.dao.Dao;
import com.files.demo.model.MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {


    @Autowired
    private Dao dao;


    public List<MetaData> listMeta (){
        List<MetaData> listar = dao.findAll();
        return listar;
    }

    public void add(String f){
        File file = new File(f);
        File[]files = file.listFiles();
        List<MetaData>listar = new ArrayList<>();
        for(File x: files){
            listar.add(new MetaData(x.getName(),x.getAbsolutePath(),String.valueOf(x.getTotalSpace())));
        }
        dao.saveAll(listar);
    }

    public List<MetaData>listTopic(String topic){
        List<MetaData>listarFiltered =
                listMeta().stream().filter(x -> x.getName().contains(topic)).collect(Collectors.toList());
        List<MetaData>listar = listMeta();
        System.out.println(listar);
        return listarFiltered;
    }

    public void deleteAll(){
        dao.deleteAll();
    }
}

