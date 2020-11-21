package com.margieblair.resources;

import com.margieblair.model.CatalogItem;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//just that one controller needed to be a rest controller!
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
    }
}
