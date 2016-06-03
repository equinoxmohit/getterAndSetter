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
public class Room {
    private String color;
    private double width;
    private double height;
    private int numberOfItems;
    private int maximumCapacityOfPeople;
    private int numberOfExit;
    private int numberOfLights;
    private int numberOfExtensions;

   
    public Room(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getMaximumCapacityOfPeople() {
        return maximumCapacityOfPeople;
    }

    public void setMaximumCapacityOfPeople(int maximumCapacityOfPeople) {
        this.maximumCapacityOfPeople = maximumCapacityOfPeople;
    }

    public int getNumberOfExit() {
        return numberOfExit;
    }

    public void setNumberOfExit(int numberOfExit) {
        this.numberOfExit = numberOfExit;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public int getNumberOfExtensions() {
        return numberOfExtensions;
    }

    public void setNumberOfExtensions(int numberOfExtensions) {
        this.numberOfExtensions = numberOfExtensions;
    }
    
    

    
    
    
}
