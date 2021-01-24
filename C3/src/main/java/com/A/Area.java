package com.A;

public class Area {
    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                "lat='" + lat + '\'' +
                ", Long='" + Long + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", recovered='" + recovered + '\'' +
                ", deaths='" + deaths + '\'' +
                ", updated='" + updated + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


    private String name;
    private String lat;
    private String Long;
    private String confirmed;
    private String recovered;
    private String deaths;
    private String updated;
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLong() {
        return Long;
    }

    public void setLong(String aLong) {
        Long = aLong;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

}
