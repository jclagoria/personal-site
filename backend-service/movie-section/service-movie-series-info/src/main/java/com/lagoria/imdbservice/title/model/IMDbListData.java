package com.lagoria.imdbservice.title.model;

import java.util.List;

public class IMDbListData {

    private String title;
    private String by;
    private String created;
    private String updated;
    private String description;
    private List<IMDbListDataDetail> items;
    private String errorMessage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<IMDbListDataDetail> getItems() {
        return items;
    }

    public void setItems(List<IMDbListDataDetail> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
