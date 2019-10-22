package com.millenial.giflib.controller;


import com.millenial.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/") // No need for @ResponseBody
    public String listGifs() {
        return "home"; // name of the file without format (.html)
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", LocalDate.of(2015,2,13), "Vasilijs Malisevs", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

    @RequestMapping("/html")
    @ResponseBody
    public String htmlTry() {
        return "<h1> Hello</h1>";
    }
}
