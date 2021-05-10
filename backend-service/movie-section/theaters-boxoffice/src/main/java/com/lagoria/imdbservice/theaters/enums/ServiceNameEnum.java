package com.lagoria.imdbservice.theaters.enums;

public enum ServiceNameEnum {

    IN_THEATERS("InTheaters"),
    COMING_SOON("ComingSoon"),
    BOX_OFFICE("BoxOffice"),
    BOX_OFFICE_ALL_TIME("BoxOfficeAllTime");

    private String serviceName;

    ServiceNameEnum(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
