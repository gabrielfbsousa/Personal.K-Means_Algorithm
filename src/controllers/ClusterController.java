/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.Cluster;
import model.IrisCentroid;
import model.YeastGeneCentroid;

/**
 *
 * @author gabriel
 */
public class ClusterController{

    private ArrayList<Cluster> clusters;

    public ClusterController() {
        clusters = new ArrayList();
    }

    public void addClusterToList(Cluster cluster) {        
        clusters.add(cluster);
    }

    public ArrayList<Cluster> getClusters() {
        return clusters;
    }   
    
    public void assignValuesToClusters(String address, String type) throws FileNotFoundException, IOException {
        if (type.equals("Iris")) {
            assignValuesToIrisClusters(address);
        }

        if (type.equals("YeastGene")) {
            assignValuesToYeastGeneClusters(address);
        }
    }

    public void assignValuesToIrisClusters(String address) throws FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream(address);
        BufferedReader bfReader = null;
        String line = null;
        bfReader = new BufferedReader(new InputStreamReader(inputStream));

        int iterator = 0; //

        while ((line = bfReader.readLine()) != null) {
            IrisCentroid centroid = new IrisCentroid();

            String[] attributes = line.split(",");

            Double attributeOne = Double.parseDouble(attributes[0].trim());
            centroid.setAttributeOne(attributeOne);

            Double attributeTwo = Double.parseDouble(attributes[1].trim());
            centroid.setAttributeTwo(attributeTwo);

            Double attributeThree = Double.parseDouble(attributes[2].trim());
            centroid.setAttributeThree(attributeThree);

            Double attributeFour = Double.parseDouble(attributes[3].trim());
            centroid.setAttributeFour(attributeFour);

            clusters.get(iterator).setCentroid(centroid);
            iterator++;
        }

        bfReader.close();
        inputStream.close();
    }

     public void assignValuesToYeastGeneClusters(String address) throws FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream(address);
        BufferedReader bfReader = null;
        String line = null;
        bfReader = new BufferedReader(new InputStreamReader(inputStream));

        int iterator = 0; //

        while ((line = bfReader.readLine()) != null) {
            YeastGeneCentroid centroid = new YeastGeneCentroid();

            String[] attributes = line.split(",");

            Double attributeOne = Double.parseDouble(attributes[0].trim());
            centroid.setAttributeOne(attributeOne);

            Double attributeTwo = Double.parseDouble(attributes[1].trim());
            centroid.setAttributeTwo(attributeTwo);

            Double attributeThree = Double.parseDouble(attributes[2].trim());
            centroid.setAttributeThree(attributeThree);

            Double attributeFour = Double.parseDouble(attributes[3].trim());
            centroid.setAttributeFour(attributeFour);
            
            Double attributeFive = Double.parseDouble(attributes[4].trim());
            centroid.setAttributeFive(attributeFive);
            
            Double attributeSix = Double.parseDouble(attributes[5].trim());
            centroid.setAttributeSix(attributeSix);
            
            Double attributeSeven = Double.parseDouble(attributes[6].trim());
            centroid.setAttributeSeven(attributeSeven);

            clusters.get(iterator).setCentroid(centroid);
            iterator++;
        }

        bfReader.close();
        inputStream.close();
    }

}
