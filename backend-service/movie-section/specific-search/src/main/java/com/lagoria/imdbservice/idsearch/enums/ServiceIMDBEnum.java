package com.lagoria.imdbservice.idsearch.enums;

public enum ServiceIMDBEnum {

    NAME("Name"),
    COMPANY("Company"),
    KEYWORD("Keyword");

    private String serviceName;

    ServiceIMDBEnum(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
