package com.files.demo.service;

import com.files.demo.dao.Dao;
import com.files.demo.model.MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {


    @Autowired
    private Dao dao;


    public HomeService(Dao dao) {
        this.dao = dao;
    }

    public Dao getDao() {
        return dao;
    }

    public List<MetaData> listMeta (){
        List<MetaData> listar = dao.findAll();
        return listar;
    }

    public void add(String f){

        File file = new File(f);
        File[]files = file.listFiles();
        List<MetaData>listar = new ArrayList<>();
        if(files == null){
            System.out.println("Files are null bruh");
        }else{
            for (int i = 0; i < files.length; i++) {
                listar.add(new MetaData(files[i].getName(),files[i].getAbsolutePath(),String.valueOf(files[i].getTotalSpace())));
                dao.save(listar.get(i));
            }
        }
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

    public List<String> findAbsoluteExtension(String f){
        System.out.println("You are inside findAbsoluteExtension");
        File file = new File(f);
        File[]files = file.listFiles();
        List<String>strPaths = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            strPaths.add(Paths.get(files[i].getAbsoluteFile().toString()).toUri().toString());
            System.out.println(Paths.get(files[i].getAbsoluteFile().toString()).toUri().toString());
        }
        return strPaths;
    }


    public void getPaths(){
        String pathA = "\\\\192.168.1.100\\z";
        String pathB = "\\\\192.168.1.100\\e\\CBT Nuggets";
        String pathC = "\\\\192.168.1.100\\e\\Ethical Hacking";
        String pathD = "\\\\192.168.1.100\\e\\INE COLLECTION";
        String pathE = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 001-99)";
        String pathF = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 100-199)";
        String pathG = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 200-299)";
        String pathH = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - AX-2 (Extreme) Jeff Cavaliere\\Workouts (Videos 300-305)";
        String pathI = "\\\\192.168.1.100\\e\\MISC\\Athlean X - AX1 + Bonuses\\Athlean AX 1  [Hacksnation.com]";
        String pathJ = "\\\\192.168.1.100\\e\\MISC\\Athlean X - AX1 + Bonuses\\Athlean Bonuses  [Hacksnation.com]";
        String pathK = "\\\\192.168.1.100\\e\\MISC\\Athlean X - AX1 + Bonuses\\Inferno Shred  [Hacksnation.com]";
        String pathL = "\\\\192.168.1.100\\e\\MISC\\Athlean X - AX1 + Bonuses\\The Original Pro Athlete Workout  [Hacksnation.com]";
        String pathM = "\\\\192.168.1.100\\e\\MISC\\AthleanX.Athlean.Xero.02.19\\Bonuses\\Absolute Xero";
        String pathN = "\\\\192.168.1.100\\e\\MISC\\AthleanX.Athlean.Xero.02.19\\Bonuses\\Athlean Xero X-tinction Abs";
        String pathO = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\APEX LEG WORKOUT";
        String pathP = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\ARM-AGEDDON";
        String pathQ = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\C-4 BURST WORKOUT";
        String pathR = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #6 - ULTIMATE ARMS - CHALLENGE  TESTING\\UPPER BODY";
        String pathS = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\APEX LEG WORKOUT";
        String pathT = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\ARM WORKOUT";
        String pathU = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\C-4 BURST WORKOUT";
        String pathV = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PULL  BICEPS";
        String pathW = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #5 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PUSH  TRICEPS";
        String pathX = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\APEX LEG WORKOUT";
        String pathY = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\ARM WORKOUT";
        String pathZ = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\C-4 BURST WORKOUT";
        String path1A = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\UPPER PULL  BICEPS";
        String path1B = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #4 - ULTIMATE ARMS - THRESHOLD AMPLIFICATION\\UPPER PUSH  TRICEPS";
        String path1C = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\APEX LEG WORKOUT";
        String path1D = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\ARM WORKOUT";
        String path1E = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\C-4 BURST WORKOUT";
        String path1F = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PULL  BICEPS";
        String path1G = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #3 - ULTIMATE ARMS - LEVEL III OVERLOAD\\UPPER PUSH  TRICEPS";
        String path1H = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\APEX LEG WORKOUT";
        String path1I = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\ARM WORKOUT";
        String path1J = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\C-4 BURST WORKOUT";
        String path1K = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\UPPER PULL  BICEPS";
        String path1L = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #2 - ULTIMATE ARMS - SUPRAMAXIMAL CONTRACTION\\UPPER PUSH  TRICEPS";
        String path1M = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\APEX LEG WORKOUT";
        String path1N = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\ARM WORKOUT";
        String path1O = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\C-4 BURST WORKOUT";
        String path1P = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\UPPER PULL  BICEPS";
        String path1Q = "\\\\192.168.1.100\\e\\MISC\\Athlean-X - Ultimate Arms - Jeff Cavaliere\\WEEK #1 - ULTIMATE ARMS - ACTIVATION  RANGE FINDER\\UPPER PUSH  TRICEPS";
        String path1R = "\\\\192.168.1.100\\e\\MISC\\AthleanX.Athlean.Xero.02.19\\Athlean Xero\\3 - Exercises";


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



    }

    public void deleteAll(){
        dao.deleteAll();
    }
}

