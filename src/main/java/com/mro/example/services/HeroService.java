package com.mro.example.services;

import com.mro.example.models.AbilityDetail;
import com.mro.example.models.HeroAbilities;
import com.mro.example.models.HeroDetail;
import com.mro.example.models.HeroOverview;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HeroService extends AbstractRestService {

    public HeroOverview getHeroOverview() {
        return get("https://overwatch-api.net/api/v1/hero/", HeroOverview.class).getBody();
    }

    public HeroDetail getHeroInfo(int id) {
        return get("https://overwatch-api.net/api/v1/hero/" + id, HeroDetail.class).getBody();
    }

    public List<Integer> getHeroAbilities(int id) {
        ResponseEntity<HeroAbilities> response = get("https://overwatch-api.net/api/v1/hero/" + id, HeroAbilities.class);

        if(response.getStatusCode() == HttpStatus.OK
                && response.getBody() != null
                && response.getBody().getAbilities() != null) {
            return response.getBody().getAbilities().stream().map(AbilityDetail::getId).collect(Collectors.toList());
        } else {
            // TODO should be 4xx instead
            return Collections.emptyList();
        }
    }
}
