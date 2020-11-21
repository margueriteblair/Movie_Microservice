package com.margieblair.resources;

import com.margieblair.model.CatalogItem;
import org.springframework.web.bind.annotation.RestController;
//just that one controller needed to be a rest controller!
@RestController
public class MovieCatalogResource {

    public List<CatalogItem> getCatalog(String userId) {

    }
}
