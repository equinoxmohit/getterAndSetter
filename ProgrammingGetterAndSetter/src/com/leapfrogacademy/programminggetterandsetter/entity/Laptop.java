/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrogacademy.programminggetterandsetter.entity;

/**
 *
 * @author Mohit
 */
public class Laptop {
    private String manufacturerName;
    private int laptopCost;
    private double width;
    private double height;
    private String operatingSystem;
    private boolean touchScreen;
    private double weightOfLaptop;

    public Laptop(String manufacturerName, double width, double height, boolean touchScreen, double weightOfLaptop) {
        this.manufacturerName = manufacturerName;
        this.width = width;
        this.height = height;
        this.touchScreen = touchScreen;
        this.weightOfLaptop = weightOfLaptop;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getLaptopCost() {
        return laptopCost;
    }

    public void setLaptopCost(int laptopCost) {
        this.laptopCost = laptopCost;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public double getWeightOfLaptop() {
        return weightOfLaptop;
    }

    public void setWeightOfLaptop(double weightOfLaptop) {
        this.weightOfLaptop = weightOfLaptop;
    }
     
    
    
}
