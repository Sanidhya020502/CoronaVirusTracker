package com.sanidhya.coronavirustracker.models;

public class LocationStats {
    
    private String state;
    private String country;
    private int latestTotalCases;
    private int DiffFromPrevDay;

    public int getDiffFromPrevDay() {
        return this.DiffFromPrevDay;
    }

    public void setDiffFromPrevDay(int DiffFromPrevDay) {
        this.DiffFromPrevDay = DiffFromPrevDay;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return this.latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }


    @Override
    public String toString() {
        return "{" +
            " state='" + getState() + "'" +
            ", country='" + getCountry() + "'" +
            ", latestTotalCases='" + getLatestTotalCases() + "'" +
            ", DiffFromPrevDay='" + getDiffFromPrevDay() + "'" +
            "}";
    }

    


}
