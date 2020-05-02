/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ICentroid;
import interfaces.IObject;
import model.IrisCentroid;
import model.YeastGeneCentroid;
import model.YeastGeneObject;
import model.IrisObject;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author GabrielFerreira
 */
public class EuclidianDistance {
    public double calculateForIris(IObject object, ICentroid centroid){
        return sqrt ( pow(object.getAttributeOne() - centroid.getAttributeOne(), 2) + 
                pow(object.getAttributeTwo() - centroid.getAttributeTwo(), 2) +
                 pow(object.getAttributeThree() - centroid.getAttributeThree(), 2) +
                 pow(object.getAttributeFour() - centroid.getAttributeFour(), 2));
    }
    
    public double calculateForYeasteGene(YeastGeneObject object, YeastGeneCentroid centroid){
        return sqrt ( pow(object.getAttributeOne() - centroid.getAttributeOne(), 2) + 
                pow(object.getAttributeTwo() - centroid.getAttributeTwo(), 2) +
                 pow(object.getAttributeThree() - centroid.getAttributeThree(), 2) +
                 pow(object.getAttributeFour() - centroid.getAttributeFour(), 2) +
                pow(object.getAttributeFive() - centroid.getAttributeFive(), 2) +
                pow(object.getAttributeSix() - centroid.getAttributeSix(), 2) +
                pow(object.getAttributeSeven() - centroid.getAttributeSeven(), 2));
    }
}
