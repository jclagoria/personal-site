package com.lagoria.imdbservice.title.model;

public class UserRatingDataDetail {

    private String Rating;
    private String Percent;
    private String Votes;

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getPercent() {
        return Percent;
    }

    public void setPercent(String percent) {
        Percent = percent;
    }

    public String getVotes() {
        return Votes;
    }

    public void setVotes(String votes) {
        Votes = votes;
    }
}
