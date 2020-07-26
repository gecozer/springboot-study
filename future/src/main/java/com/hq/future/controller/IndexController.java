package com.hq.future.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index2")
    public String index2(){
        return "index2";
    }

    @RequestMapping("/music")
    public String music(){
        return "music";
    }

    @RequestMapping("/movie")
    public String movie(){
        return "movie";
    }

    @RequestMapping("/album")
    public String album(){
        return "album";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/details")
    public String details(){
        return "details";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
