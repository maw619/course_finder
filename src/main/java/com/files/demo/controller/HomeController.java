package com.files.demo.controller;
import com.files.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;


@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public String home(){
        homeService.deleteAll();
        homeService.getPaths();
        return "index";
      }

    @GetMapping("/home/firstFolder")
    public String firstFolder(@RequestParam String topic,Model model) throws IOException {
        model.addAttribute("listar", homeService.findByFullPath(topic));
        return "index";
    }

    @GetMapping("/home/secondFolder")
    public String secondFolder(@RequestParam String url, Model model) throws IOException {
        model.addAttribute("listar", homeService.findSubFolder(url));
        String redirect = "index2";
        for(int i = 0; i < homeService.findSubFolder(url).length;i++){
            if(homeService.findSubFolder(url)[i].getAbsolutePath().contains(".mp4")){
                if(homeService.findSubFolder(url)[i].getAbsolutePath().contains(".mp4")){
                    redirect = "videoplayer";
                }
            }
            System.out.println(redirect);
        }
        return redirect;
    }

    @GetMapping("/home/thirdFolder")
    public String thirdFolder(@RequestParam String url, Model model) throws IOException {
        model.addAttribute("listar", homeService.findSubFolder2(url));
        String redirect = "index";
        for (int i = 0; i < homeService.findSubFolder2(url).length; i++) {
            if(homeService.findSubFolder2(url)[i].getAbsolutePath().contains(".mp4") || homeService.findSubFolder2(url)[i].getAbsolutePath().contains(".mkv") || homeService.findSubFolder2(url)[i].getAbsolutePath().contains(".ts")){
                redirect = "videoplayer";
            }
        }
        return redirect;
    }
}












