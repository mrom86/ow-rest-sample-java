package com.mro.example.controllers;

import com.mro.example.models.AbilityDetail;
import com.mro.example.models.HeroDetail;
import com.mro.example.models.HeroOverview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mro.example.services.HeroService;

import java.util.List;

@RestController
@RequestMapping("/api/heros")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @RequestMapping
    public HeroOverview listHeros() {
        return heroService.getHeroOverview();
    }

    @RequestMapping("/{id}")
    public HeroDetail getHeroInfo(@PathVariable Integer id) {
        return heroService.getHeroInfo(id);
    }

    @RequestMapping("/{id}/abilities")
    public List<Integer> listHeroAbilities(@PathVariable Integer id) {
        return heroService.getHeroAbilities(id);
    }
}
