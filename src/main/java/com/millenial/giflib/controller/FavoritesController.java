package com.millenial.giflib.controller;

import com.millenial.giflib.data.GifRepository;
import com.millenial.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoritesController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String favourites(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getFavoriteGifs();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
