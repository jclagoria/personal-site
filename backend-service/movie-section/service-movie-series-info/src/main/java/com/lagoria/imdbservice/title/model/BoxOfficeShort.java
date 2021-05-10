package com.lagoria.imdbservice.title.model;

public class BoxOfficeShort {

    private String budget;
    private String openingWeekendUSA;
    private String crossUSA;
    private String cumulativeWorldwideGross;

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getOpeningWeekendUSA() {
        return openingWeekendUSA;
    }

    public void setOpeningWeekendUSA(String openingWeekendUSA) {
        this.openingWeekendUSA = openingWeekendUSA;
    }

    public String getCrossUSA() {
        return crossUSA;
    }

    public void setCrossUSA(String crossUSA) {
        this.crossUSA = crossUSA;
    }

    public String getCumulativeWorldwideGross() {
        return cumulativeWorldwideGross;
    }

    public void setCumulativeWorldwideGross(String cumulativeWorldwideGross) {
        this.cumulativeWorldwideGross = cumulativeWorldwideGross;
    }
}
