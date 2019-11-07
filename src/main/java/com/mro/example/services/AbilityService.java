package com.mro.example.services;

import com.mro.example.models.AbilityDetail;
import com.mro.example.models.AbilityOverview;
import org.springframework.stereotype.Component;

@Component
public class AbilityService extends AbstractRestService {

    public AbilityOverview getAbilityOverview() {
        return get("https://overwatch-api.net/api/v1/ability/", AbilityOverview.class).getBody();
    }

    public AbilityDetail getAbilityInfo(int id) {
        return get("https://overwatch-api.net/api/v1/ability/" + id, AbilityDetail.class).getBody();
    }
}
