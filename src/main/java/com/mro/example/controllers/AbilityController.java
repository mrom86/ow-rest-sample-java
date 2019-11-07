package com.mro.example.controllers;

import com.mro.example.models.AbilityDetail;
import com.mro.example.models.AbilityOverview;
import com.mro.example.services.AbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {

    @Autowired
    private AbilityService abilityService;

    @RequestMapping
    public AbilityOverview listAbilities() {
        return abilityService.getAbilityOverview();
    }

    @RequestMapping("/{id}")
    public AbilityDetail getAbilityInfo(@PathVariable Integer id) {
        return abilityService.getAbilityInfo(id);
    }
}
