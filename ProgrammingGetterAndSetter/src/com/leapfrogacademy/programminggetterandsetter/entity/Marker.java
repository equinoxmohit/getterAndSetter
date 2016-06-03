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
public class Marker {
    private int numberOfMarker;
    private int costOfMarker;
    private String color;
    private double height;
    private double width;
    private boolean reusable;
    private boolean erasable;

   
    
    

    public int getNumberOfMarker() {
        return numberOfMarker;
    }

    public void setNumberOfMarker(int numberOfMarker) {
        this.numberOfMarker = numberOfMarker;
    }

    public int getCostOfMarker() {
        return costOfMarker;
    }

    public void setCostOfMarker(int costOfMarker) {
        this.costOfMarker = costOfMarker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isReusable() {
        return reusable;
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

    public boolean isErasable() {
        return erasable;
    }

    public void setErasable(boolean erasable) {
        this.erasable = erasable;
    }
    
    
}
