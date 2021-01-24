package com.A;

public class Country {
    private String country;
    private String    population;
    private String    sq_km_area;
    private String  life_expectancy;
    private String    elevation_in_meters;
    private String continent;
    private String abbreviation;
    private String location;
    private String iso;
    private String capital_city;
    private String confirmed;
    private String recovered;
    private String deaths;
    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", population='" + population + '\'' +
                ", sq_km_area='" + sq_km_area + '\'' +
                ", life_expectancy='" + life_expectancy + '\'' +
                ", elevation_in_meters='" + elevation_in_meters + '\'' +
                ", continent='" + continent + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", location='" + location + '\'' +
                ", iso='" + iso + '\'' +
                ", capital_city='" + capital_city + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", recovered='" + recovered + '\'' +
                ", deaths='" + deaths + '\'' +
                '}';
    }

    public void SetCountry(String country) {
        this.country = country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getPopulation() {
        return population;
    }

    public String getSq_km_area() {
        return sq_km_area;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public String getElevation_in_meters() {
        return elevation_in_meters;
    }

    public String getContinent() {
        return continent;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getLocation() {
        return location;
    }

    public String getIso() {
        return iso;
    }

    public String getCapital_city() {
        return capital_city;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public String getRecovered() {
        return recovered;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setSq_km_area(String sq_km_area) {
        this.sq_km_area = sq_km_area;
    }

    public void setLife_expectancy(String life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public void setElevation_in_meters(String elevation_in_meters) {
        this.elevation_in_meters = elevation_in_meters;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public void setCapital_city(String capital_city) {
        this.capital_city = capital_city;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }




}
