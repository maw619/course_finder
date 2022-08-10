package com.files.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "metadata")
public class MetaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "full_path")
    private String fullPath;
    @Column(name = "size")
    private String size;

    public MetaData() {

    }

    public MetaData(String name, String fullPath, String size) {
        this.name = name;
        this.fullPath = fullPath;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullPath='" + fullPath + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
