package com.files.demo.controller;
import com.files.demo.service.HomeService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;


@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/home")
    public String home(){
        homeService.deleteAll();
        homeService.getPaths();
        return "index";
      }

    @GetMapping("/home/firstFolder")
    public String firstFolder(@RequestParam String topic, @NotNull Model model) throws IOException {
        model.addAttribute("listar", homeService.findByFullPath(topic));
        return "index";
    }

    @GetMapping("/home/secondFolder")
    public String secondFolder(@RequestParam String url, @NotNull Model model) throws IOException {
        model.addAttribute("listar1", homeService.findSubFolder(url));
        String redirect = "index2";
        for (int i = 0; i < homeService.findSubFolder(url).length; i++) {
            if(homeService.findSubFolder(url)[i].getAbsolutePath().contains(".mp4")){
                model.addAttribute("listar1", homeService.findSubFolder(url));
                redirect = "videoplayer";
            }
        }
        return redirect;
    }

    @GetMapping("/home/thirdFolder")
    public String thirdFolder(@RequestParam String url, @NotNull Model model) throws IOException {
        model.addAttribute("listar1", homeService.findSubFolder(url));
        String redirect = "index3";
        for (int i = 0; i < homeService.findSubFolder(url).length; i++) {
            if(homeService.findSubFolder(url)[i].getAbsolutePath().contains(".mp4")){
                model.addAttribute("listar1", homeService.findSubFolder(url));
                redirect = "videoplayer";
            }
        }
        return redirect;
    }

}












