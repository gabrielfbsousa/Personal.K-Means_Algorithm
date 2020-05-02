/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import interfaces.IObject;
import model.IrisObject;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.YeastGeneObject;

/**
 *
 * @author GabrielFerreira
 */
public class ObjectController{

    private ArrayList<IObject> objects;

    public ObjectController() {
        objects = new ArrayList();
    }

    public void addObjectToList(IObject object) {
        objects.add(object);
    }

    public ArrayList<IObject> getObjects() {
        return objects;
    }
    
    public void assignValuesToObjects(String address, String type) throws FileNotFoundException, IOException {
        if(type.equals("Iris")){
        assignValuesToIrisObjects(address);
        }
        
        if(type.equals("YeastGene")){
        assignValuesToYeastGeneObjects(address);
        }
    }

    public void assignValuesToIrisObjects(String address) throws FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream(address);
        BufferedReader bfReader = null;
        String line = null;
        bfReader = new BufferedReader(new InputStreamReader(inputStream));

        int iterator = 0; // Quem irá variar os Clusters da lista

        while ((line = bfReader.readLine()) != null) {
            IrisObject object = new IrisObject(iterator+1);
            String[] attributes = line.split(",");

            Double attributeOne = Double.parseDouble(attributes[0].trim());
            object.setAttributeOne(attributeOne);

            Double attributeTwo = Double.parseDouble(attributes[1].trim());
            object.setAttributeTwo(attributeTwo);

            Double attributeThree = Double.parseDouble(attributes[2].trim());
            object.setAttributeThree(attributeThree);

            Double attributeFour = Double.parseDouble(attributes[3].trim());
            object.setAttributeFour(attributeFour);

            addObjectToList(object);
            iterator++;
        }

        bfReader.close();
        inputStream.close();
    }

    public void assignValuesToYeastGeneObjects(String address) throws FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream(address);
        BufferedReader bfReader = null;
        String line = null;
        bfReader = new BufferedReader(new InputStreamReader(inputStream));

        int iterator = 0; // Quem irá variar os Clusters da lista

        while ((line = bfReader.readLine()) != null) {
            YeastGeneObject object = new YeastGeneObject(iterator+1);
            String[] attributes = line.split(",");

            Double attributeOne = Double.parseDouble(attributes[0].trim());
            object.setAttributeOne(attributeOne);

            Double attributeTwo = Double.parseDouble(attributes[1].trim());
            object.setAttributeTwo(attributeTwo);

            Double attributeThree = Double.parseDouble(attributes[2].trim());
            object.setAttributeThree(attributeThree);

            Double attributeFour = Double.parseDouble(attributes[3].trim());
            object.setAttributeFour(attributeFour);
            
            Double attributeFive = Double.parseDouble(attributes[4].trim());
            object.setAttributeFive(attributeFive);
            
            Double attributeSix = Double.parseDouble(attributes[5].trim());
            object.setAttributeSix(attributeSix);
            
            Double attributeSeven = Double.parseDouble(attributes[6].trim());
            object.setAttributeSeven(attributeSeven);

            addObjectToList(object);
            iterator++;
        }

        bfReader.close();
        inputStream.close();
    }
    
}
