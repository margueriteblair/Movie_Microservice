package com.margieblair.model;

import com.margieblair.model.Rating;
import org.apache.catalina.User;

import java.util.List;

public class UserRating {
    private List<Rating> userRating;

    public UserRating() {

    }

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
