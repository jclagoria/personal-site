package com.lagoria.imdbservice.title.model;

public class WikipediaData {

    private String imDbId;
    private String Title;
    private String FullTitle;
    private String Type;
    private String Year;
    private String Language;
    private String TitleInLanguage;
    private String Url;
    private WikipediaDataPlot PlotShort;
    private WikipediaDataPlot PlotFull;
    private String ErrorMessage;

    public String getImDbId() {
        return imDbId;
    }

    public void setImDbId(String imDbId) {
        this.imDbId = imDbId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFullTitle() {
        return FullTitle;
    }

    public void setFullTitle(String fullTitle) {
        FullTitle = fullTitle;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getTitleInLanguage() {
        return TitleInLanguage;
    }

    public void setTitleInLanguage(String titleInLanguage) {
        TitleInLanguage = titleInLanguage;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public WikipediaDataPlot getPlotShort() {
        return PlotShort;
    }

    public void setPlotShort(WikipediaDataPlot plotShort) {
        PlotShort = plotShort;
    }

    public WikipediaDataPlot getPlotFull() {
        return PlotFull;
    }

    public void setPlotFull(WikipediaDataPlot plotFull) {
        PlotFull = plotFull;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
