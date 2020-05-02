/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ICentroid;
import interfaces.IObject;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Cluster{

    private ArrayList<IObject> objectsAssigned;
    private ICentroid centroid;

    public Cluster() {
        this.objectsAssigned = new ArrayList();
    }

    public void addObjectToList(IObject object) {
        if (!objectsAssigned.contains(object)) {
            objectsAssigned.add(object);
        }
    }

    public void removeObjectFromList(IObject object) {
        if (objectsAssigned.contains(object)) {
            objectsAssigned.remove(object);
        }
    }

    public ArrayList<IObject> getObjectsAssigned() {
        return objectsAssigned;
    }
    
    

    public ICentroid getCentroid() {
        return centroid;
    }

    public void setCentroid(ICentroid centroid) {
        this.centroid = centroid;
    }

    public void recalculateCentroid(String type) {
        if (type.equals("Iris")) {
            recalculateIrisCentroid();
        }

        if (type.equals("YeastGene")) {
            recalculateYeastGeneCentroid();
        }
    }

    public void recalculateIrisCentroid() {
        IrisCentroid newCentroid = (IrisCentroid) this.getCentroid();

        double accumulatorAttributeOne = 0;
        double accumulatorAttributeTwo = 0;
        double accumulatorAttributeThree = 0;
        double accumulatorAttributeFour = 0;

        for (int i = 0; i < objectsAssigned.size(); i++) {
            IrisObject object = (IrisObject) objectsAssigned.get(i);
            accumulatorAttributeOne = accumulatorAttributeOne + object.getAttributeOne();
            accumulatorAttributeTwo = accumulatorAttributeTwo + object.getAttributeTwo();
            accumulatorAttributeThree = accumulatorAttributeThree + object.getAttributeThree();
            accumulatorAttributeFour = accumulatorAttributeFour + object.getAttributeFour();
        }

        //tirando a média
        accumulatorAttributeOne = accumulatorAttributeOne / objectsAssigned.size();
        accumulatorAttributeTwo = accumulatorAttributeTwo / objectsAssigned.size();
        accumulatorAttributeThree = accumulatorAttributeThree / objectsAssigned.size();
        accumulatorAttributeFour = accumulatorAttributeFour / objectsAssigned.size();

        newCentroid.setAttributeOne(accumulatorAttributeOne);
        newCentroid.setAttributeTwo(accumulatorAttributeTwo);
        newCentroid.setAttributeThree(accumulatorAttributeThree);
        newCentroid.setAttributeFour(accumulatorAttributeFour);

    }

    public void recalculateYeastGeneCentroid() {

        YeastGeneCentroid newCentroid = (YeastGeneCentroid) this.getCentroid();

        double accumulatorAttributeOne = 0;
        double accumulatorAttributeTwo = 0;
        double accumulatorAttributeThree = 0;
        double accumulatorAttributeFour = 0;
        double accumulatorAttributeFive = 0;
        double accumulatorAttributeSix = 0;
        double accumulatorAttributeSeven = 0;

        for (int i = 0; i < objectsAssigned.size(); i++) {
            YeastGeneObject object = (YeastGeneObject) objectsAssigned.get(i);
            accumulatorAttributeOne = accumulatorAttributeOne + object.getAttributeOne();
            accumulatorAttributeTwo = accumulatorAttributeTwo + object.getAttributeTwo();
            accumulatorAttributeThree = accumulatorAttributeThree + object.getAttributeThree();
            accumulatorAttributeFour = accumulatorAttributeFour + object.getAttributeFour();
            accumulatorAttributeFive = accumulatorAttributeFive + object.getAttributeFive();
            accumulatorAttributeSix = accumulatorAttributeSix + object.getAttributeSix();
            accumulatorAttributeSeven = accumulatorAttributeSeven + object.getAttributeSeven();
        }

        //tirando a média
        accumulatorAttributeOne = accumulatorAttributeOne / objectsAssigned.size();
        accumulatorAttributeTwo = accumulatorAttributeTwo / objectsAssigned.size();
        accumulatorAttributeThree = accumulatorAttributeThree / objectsAssigned.size();
        accumulatorAttributeFour = accumulatorAttributeFour / objectsAssigned.size();
        accumulatorAttributeFive = accumulatorAttributeFive / objectsAssigned.size();
        accumulatorAttributeSix = accumulatorAttributeSix / objectsAssigned.size();
        accumulatorAttributeSeven = accumulatorAttributeSeven / objectsAssigned.size();

        newCentroid.setAttributeOne(accumulatorAttributeOne);
        newCentroid.setAttributeTwo(accumulatorAttributeTwo);
        newCentroid.setAttributeThree(accumulatorAttributeThree);
        newCentroid.setAttributeFour(accumulatorAttributeFour);
        newCentroid.setAttributeFive(accumulatorAttributeFive);
        newCentroid.setAttributeSix(accumulatorAttributeSix);
        newCentroid.setAttributeSeven(accumulatorAttributeSeven);

    }

}
