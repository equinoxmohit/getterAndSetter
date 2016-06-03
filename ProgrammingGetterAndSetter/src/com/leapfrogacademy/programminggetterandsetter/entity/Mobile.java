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
public class Mobile {
    private String manufacturerName;
    private int mobileCost;
    private double width;
    private double height;
    private int numberOfSim;
    private boolean touchScreen;
    private int internalStorageCapacity;
    private int externalStorageCapacity;
    private double weightOfMobile;

    public Mobile(String manufacturerName, double width, double height, int numberOfSim, boolean touchScreen, int internalStorageCapacity, double weightOfMobile) {
        this.manufacturerName = manufacturerName;
        this.width = width;
        this.height = height;
        this.numberOfSim = numberOfSim;
        this.touchScreen = touchScreen;
        this.internalStorageCapacity = internalStorageCapacity;
        this.weightOfMobile = weightOfMobile;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getMobileCost() {
        return mobileCost;
    }

    public void setMobileCost(int mobileCost) {
        this.mobileCost = mobileCost;
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

    public int getNumberOfSim() {
        return numberOfSim;
    }

    public void setNumberOfSim(int numberOfSim) {
        this.numberOfSim = numberOfSim;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public int getInternalStorageCapacity() {
        return internalStorageCapacity;
    }

    public void setInternalStorageCapacity(int internalStorageCapacity) {
        this.internalStorageCapacity = internalStorageCapacity;
    }

    public int getExternalStorageCapacity() {
        return externalStorageCapacity;
    }

    public void setExternalStorageCapacity(int externalStorageCapacity) {
        this.externalStorageCapacity = externalStorageCapacity;
    }

    public double getWeightOfMobile() {
        return weightOfMobile;
    }

    public void setWeightOfMobile(double weightOfMobile) {
        this.weightOfMobile = weightOfMobile;
    }
    
    
    
}
