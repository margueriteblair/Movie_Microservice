package com.margieblair.models;

import main.java.com.margieblair.models.Rating;
import java.util.List;

public class UserRating {
    private List<Rating> userRating;

    public List<main.java.com.margieblair.models.Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
