/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ICentroid;

/**
 *
 * @author gabriel
 */
public class YeastGeneCentroid implements ICentroid{

    private double attributeOne;
    private double attributeTwo;
    private double attributeThree;
    private double attributeFour;
    private double attributeFive;
    private double attributeSix;
    private double attributeSeven;

    public YeastGeneCentroid(double attributeOne, double attributeTwo, double attributeThree, double attributeFour, double attributeFive, double attributeSix, double attributeSeven) {
        this.attributeOne = attributeOne;
        this.attributeTwo = attributeTwo;
        this.attributeThree = attributeThree;
        this.attributeFour = attributeFour;
        this.attributeFive = attributeFive;
        this.attributeSix = attributeSix;
        this.attributeSeven = attributeSeven;
    }

    public YeastGeneCentroid() {
    }

    
    public void printValues() {
        System.out.println("Attribute 1: " + getAttributeOne() + "\n"
                + "Attribute 2: " + getAttributeTwo() + "\n"
                + "Attribute 3: " + getAttributeThree() + "\n"
                + "Attribute 4: " + getAttributeFour() + "\n"
                + "Attribute 5: " + getAttributeFive() + "\n"
                + "Attribute 6: " + getAttributeSix() + "\n"
                + "Attribute 7: " + getAttributeSeven() + "\n");
    }

    public double getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(double attributeOne) {
        this.attributeOne = attributeOne;
    }

    public double getAttributeTwo() {
        return attributeTwo;
    }

    public void setAttributeTwo(double attributeTwo) {
        this.attributeTwo = attributeTwo;
    }

    public double getAttributeThree() {
        return attributeThree;
    }

    public void setAttributeThree(double attributeThree) {
        this.attributeThree = attributeThree;
    }

    public double getAttributeFour() {
        return attributeFour;
    }

    public void setAttributeFour(double attributeFour) {
        this.attributeFour = attributeFour;
    }

    public double getAttributeFive() {
        return attributeFive;
    }

    public void setAttributeFive(double attributeFive) {
        this.attributeFive = attributeFive;
    }

    public double getAttributeSix() {
        return attributeSix;
    }

    public void setAttributeSix(double attributeSix) {
        this.attributeSix = attributeSix;
    }

    public double getAttributeSeven() {
        return attributeSeven;
    }

    public void setAttributeSeven(double attributeSeven) {
        this.attributeSeven = attributeSeven;
    }

}
