package com.margieblair.resources;

import com.margieblair.model.CatalogItem;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.margieblair.model.Movie;
import com.margieblair.model.Rating;
import com.margieblair.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

//just that one controller needed to be a rest controller!
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
//autowired is a consumer, the more you know, huh
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder webClientBuilder;
    @Autowired
    private DiscoveryClient discoveryClient; //this comes automatically with eureka

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        //get all rated movie ids
        //for each movie id call movie inform service and get details
        //put them all together

        //this actually makes the builder, similar to creating a new rest
        //you just want one instance of the rest template
        //you make a bean which is a singleton, it doesn't need to be reinstantiated every time we use the restTemplate()
        UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId, UserRating.class);

        return ratings.getUserRating().stream().map(rating -> {
        //no flexibility over changing the application name
             Movie movie = restTemplate.getForObject("http://movie-information-service/movies/"+rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(), "Desc", rating.getRating());
        }).collect(Collectors.toList());
    }
}
//            Movie movie = webClientBuilder.build().get().uri("http://localhost:8081/movies/"+rating.getMovieId())
//            .retrieve().bodyToMono(Movie.class).block();
//