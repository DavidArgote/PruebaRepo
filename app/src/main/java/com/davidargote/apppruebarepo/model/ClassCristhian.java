package com.davidargote.apppruebarepo.model;

public class ClassCristhian {
    private String crisName;
    private String crisCountry;

    public ClassCristhian() {
    }

    public ClassCristhian(String crisName, String crisCountry) {
        this.crisName = crisName;
        this.crisCountry = crisCountry;
    }

    public String getCrisName() {
        return crisName;
    }

    public void setCrisName(String crisName) {
        this.crisName = crisName;
    }

    public String getCrisCountry() {
        return crisCountry;
    }

    public void setCrisCountry(String crisCountry) {
        this.crisCountry = crisCountry;
    }
}
