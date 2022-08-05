package com.files.demo.controller;

import com.files.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public String home(){
        homeService.deleteAll();
        String pathA = "E:\\Ethical Hacking\\Ethical hack";
        String pathB = "E:\\CBT Nuggets";
        String pathC = "Z:\\";
        String pathD = "E:\\INE COLLECTION";
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

        homeService.add(pathA);
        homeService.add(pathB);
        homeService.add(pathC);
        homeService.add(pathD);
//        homeService.add(pathE);
//        homeService.add(pathF);
//        homeService.add(pathG);
//        homeService.add(pathH);
//        homeService.add(pathI);
//        homeService.add(pathJ);
//        homeService.add(pathK);
//        homeService.add(pathL);
//        homeService.add(pathM);
//        homeService.add(pathN);
//        homeService.add(pathO);
//        homeService.add(pathP);
//        homeService.add(pathQ);
//        homeService.add(pathR);
//        homeService.add(pathS);
//        homeService.add(pathT);
//        homeService.add(pathU);
//        homeService.add(pathV);
//        homeService.add(pathW);
//        homeService.add(pathX);
//        homeService.add(pathY);
//        homeService.add(pathZ);
//        homeService.add(path1A);
//        homeService.add(path1B);
//        homeService.add(path1C);
//        homeService.add(path1D);
//        homeService.add(path1E);
//        homeService.add(path1F);
//        homeService.add(path1G);
//        homeService.add(path1H);
//        homeService.add(path1I);
//        homeService.add(path1J);
//        homeService.add(path1K);
//        homeService.add(path1L);
//        homeService.add(path1M);
//        homeService.add(path1N);
//        homeService.add(path1O);
//        homeService.add(path1P);
//        homeService.add(path1Q);
//        homeService.add(path1R);
//        homeService.add(path1S);
//        homeService.add(path1T);
//        homeService.add(path1U);
//        homeService.add(path1V);
//        homeService.add(path1W);
//        homeService.add(path1X);
//        homeService.add(path1Y);
//        homeService.add(path1Z);



        return "index";
      }

    @GetMapping("/home/top")
    public String changeTopic(@RequestParam String topic,Model model){
        model.addAttribute("listar", homeService.listTopic(topic));
        //System.out.println(homeService.listTopic(topic) + "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return "index";
    }
}
