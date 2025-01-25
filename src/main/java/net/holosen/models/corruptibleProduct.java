package net.holosen.models;

public class corruptibleProduct extends Product{
    private Integer mintemperature;
    private Integer maxtemperature;

    public Integer getMintemperature() {
        return mintemperature;
    }

    public void setMintemperature(Integer mintemperature) {
        this.mintemperature = mintemperature;
    }

    public Integer getMaxtemperature() {
        return maxtemperature;
    }

    public void setMaxtemperature(Integer maxtemperature) {
        this.maxtemperature = maxtemperature;
    }
}
