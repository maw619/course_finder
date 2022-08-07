package com.files.demo.service;

import com.files.demo.dao.Dao;
import com.files.demo.model.MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HomeService {

    String firstPath;
    String secondPath;

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

    public List<MetaData>findByFullPath(String fullPath){
        List<MetaData>listar = dao.findByFullPathContainingIgnoreCase(fullPath);
        return listar;
    }

    public File[]findSubFolder(String firstPath){
        System.out.println("You are inside findSubFolder()");
        File file = new File(firstPath);
        File[]files = file.listFiles();

        if(file.isDirectory()) {
            for(int i = 0; i < files.length;i++) {
                if(files[i].getAbsolutePath().contains(".mp4")) {
                    System.out.println("mp4's FOUND");
                    System.out.println(files[i].getPath());;
                }else {
                    System.out.println("Not an MP4");
                    System.out.println(files[i].getPath());;
                }
            }
        }else {
            System.out.println("Not a directory");
        }
        return files;
    }

    public File[]findSubFolder2(String firstPath){
        System.out.println("You are inside secondSubFolder()");
        File file = new File(firstPath);
        File[]files = file.listFiles();

        if(file.isDirectory()) {
            for(int i = 0; i < files.length;i++) {
                if(files[i].getAbsolutePath().contains(".mp4")) {
                    System.out.println("mp4's FOUND");
                    System.out.println(files[i]);;
                }else {
                    System.out.println("Not an MP4");
                    System.out.println(files[i]);;
                }
            }
        }else {
            System.out.println("Not a directory");
        }
        return files;
    }

    public void getPaths(){
        String pathA = "E:\\Ethical Hacking\\Ethical hack\\";
        String pathB = "E:\\CBT Nuggets\\";
        String pathC = "Z:\\";
        String pathD = "E:\\INE COLLECTION\\";
        String pathE = "E:\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 001-99)";
        String pathF = "E:\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 100-199)";
        String pathG = "E:\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 200-299)";
        String pathH = "E:\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 300-305)";
        String pathI = "E:\\MISC\\Athlean X - AX1 + Bonuses\\Athlean AX 1  [Hacksnation.com]";
        String pathJ = "E:\\MISC\\Athlean X - AX1 + Bonuses\\Athlean Bonuses  [Hacksnation.com]";
        String pathK = "E:\\MISC\\Athlean X - AX1 + Bonuses\\Inferno Shred  [Hacksnation.com]";
        String pathL = "E:\\MISC\\Athlean X - AX1 + Bonuses\\The Original Pro Athlete Workout  [Hacksnation.com]";
        String pathM = "E:\\MISC\\AthleanX.Athlean.Xero.02.19\\Bonuses\\Absolute Xero";
        String pathN = "E:\\MISC\\AthleanX.Athlean.Xero.02.19\\Bonuses\\Athlean Xero X-tinction Abs";
        String pathO = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\APEX LEG WORKOUT";
        String pathP = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\ARM-AGEDDON";
        String pathQ = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\C-4 BURST WORKOUT";
        String pathR = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\UPPER BODY";
        String pathS = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\APEX LEG WORKOUT";
        String pathT = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\ARM WORKOUT";
        String pathU = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\C-4 BURST WORKOUT";
        String pathV = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PULL  BICEPS";
        String pathW = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PUSH  TRICEPS";
        String pathX = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\APEX LEG WORKOUT";
        String pathY = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\ARM WORKOUT";
        String pathZ = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\C-4 BURST WORKOUT";
        String path1A = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\UPPER PULL  BICEPS";
        String path1B = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\UPPER PUSH  TRICEPS";
        String path1C = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\APEX LEG WORKOUT";
        String path1D = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\ARM WORKOUT";
        String path1E = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\C-4 BURST WORKOUT";
        String path1F = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PULL  BICEPS";
        String path1G = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PUSH  TRICEPS";
        String path1H = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\APEX LEG WORKOUT";
        String path1I = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\ARM WORKOUT";
        String path1J = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\C-4 BURST WORKOUT";
        String path1K = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\UPPER PULL  BICEPS";
        String path1L = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\UPPER PUSH  TRICEPS";
        String path1M = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\APEX LEG WORKOUT";
        String path1N = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\ARM WORKOUT";
        String path1O = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\C-4 BURST WORKOUT";
        String path1P = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\UPPER PULL  BICEPS";
        String path1Q = "E:\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\UPPER PUSH  TRICEPS";
        String path1R = "E:\\MISC\\AthleanX.Athlean.Xero.02.19\\Athlean Xero\\3 - Exercises";
        String path1S = "";
        String path1T = "";
        String path1U = "";
        String path1V = "";
        String path1W = "";
        String path1X = "";
        String path1Y = "";
        String path1Z = "";

        add(pathA);
        add(pathB);
        add(pathC);
        add(pathD);
        add(pathE);
        add(pathF);
        add(pathG);
        add(pathH);
        add(pathI);
        add(pathJ);
        add(pathK);
        add(pathL);
        add(pathM);
        add(pathN);
        add(pathO);
        add(pathP);
        add(pathQ);
        add(pathR);
        add(pathS);
        add(pathT);
        add(pathU);
        add(pathV);
        add(pathW);
        add(pathX);
        add(pathY);
        add(pathZ);
        add(path1A);
        add(path1B);
        add(path1C);
        add(path1D);
        add(path1E);
        add(path1F);
        add(path1G);
        add(path1H);
        add(path1I);
        add(path1J);
        add(path1K);
        add(path1L);
        add(path1M);
        add(path1N);
        add(path1O);
        add(path1P);
        add(path1Q);
        add(path1R);
//        add(path1S);
//        add(path1T);
//        add(path1U);
//        add(path1V);
//        add(path1W);
//        add(path1X);
//        add(path1Y);
//        add(path1Z);
    }

    public void deleteAll(){
        dao.deleteAll();
    }
}

