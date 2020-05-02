/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ICentroid;

/**
 *
 * @author GabrielFerreira
 */
public class IrisCentroid implements ICentroid{
    private double attributeOne;
    private double attributeTwo;
    private double attributeThree;
    private double attributeFour;

    public IrisCentroid() {
    }

    public IrisCentroid(double attributeOne, double attributeTwo, double attributeThree, double attributeFour) {
        this.attributeOne = attributeOne;
        this.attributeTwo = attributeTwo;
        this.attributeThree = attributeThree;
        this.attributeFour = attributeFour;
    }
    
    @Override
    public void printValues(){
        System.out.println("Attribute 1: "+ getAttributeOne()+"\n"
                + "Attribute 2: " + getAttributeTwo()+ "\n"
                + "Attribute 3: "+ getAttributeThree()+ "\n"
                + "Attribute 4: "+ getAttributeFour() +"\n");
    }
    

    @Override
    public double getAttributeOne() {
        return attributeOne;
    }

    @Override
    public void setAttributeOne(double attributeOne) {
        this.attributeOne = attributeOne;
    }

    @Override
    public double getAttributeTwo() {
        return attributeTwo;
    }

    @Override
    public void setAttributeTwo(double attributeTwo) {
        this.attributeTwo = attributeTwo;
    }

    @Override
    public double getAttributeThree() {
        return attributeThree;
    }

    @Override
    public void setAttributeThree(double attributeThree) {
        this.attributeThree = attributeThree;
    }

    @Override
    public double getAttributeFour() {
        return attributeFour;
    }

    @Override
    public void setAttributeFour(double attributeFour) {
        this.attributeFour = attributeFour;
    }
}
