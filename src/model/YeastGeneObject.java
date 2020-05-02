/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.IObject;

/**
 *
 * @author gabriel
 */
public class YeastGeneObject implements IObject{
    private double attributeOne;
    private double attributeTwo;
    private double attributeThree;
    private double attributeFour;
    private double attributeFive;
    private double attributeSix;
    private double attributeSeven;
    private double numberOfThisObject;

    public YeastGeneObject(double numberOfThisObject) {
        this.numberOfThisObject = numberOfThisObject;
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

    public double getNumberOfThisObject() {
        return numberOfThisObject;
    }

    public void setNumberOfThisObject(double numberOfThisObject) {
        this.numberOfThisObject = numberOfThisObject;
    }
    
    
}
