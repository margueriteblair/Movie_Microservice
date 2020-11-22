package com.margieblair.resources;

import com.margieblair.model.CatalogItem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.margieblair.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//just that one controller needed to be a rest controller!
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        //get all rated movie ids
        //for each movie id call movie infor service and get details
        //put them all together
        List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("4567", 3));

        return ratings.stream().map(rating -> new CatalogItem("Transformers", "test", 4)).collect(Collectors.toList());
//        return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
    }
}
