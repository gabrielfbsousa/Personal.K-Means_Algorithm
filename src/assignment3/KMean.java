/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import model.CsvFileWriter;
import controllers.ClusterController;
import model.EuclidianDistance;
import controllers.ObjectController;
import interfaces.ICentroid;
import interfaces.IObject;
import model.IrisCentroid;
import model.IrisObject;
import java.util.ArrayList;
import model.Cluster;
import model.YeastGeneCentroid;
import model.YeastGeneObject;

/**
 *
 * @author GabrielFerreira
 */
public class KMean {

    private ClusterController clusterController;
    private ObjectController objectController;

    public KMean(ObjectController objectController, ClusterController clusterController) {
        this.clusterController = clusterController;
        this.objectController = objectController;
    }

    //Passo 1 do trabalho
    public void initialize(String type) {
        if (type.equals("Iris")) {
            runIris(objectController.getObjects(), clusterController.getClusters(), type);
        }

        if (type.equals("YeastGene")) {
            runYeastGene(objectController.getObjects(), clusterController.getClusters(), type);
        }
    }

    public void runIris(ArrayList<IObject> objects, ArrayList<Cluster> clusters, String type) {
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < objects.size(); i++) {
                IrisObject object = (IrisObject) objects.get(i); //Para cada objeto
                EuclidianDistance distance = new EuclidianDistance();

                //Calcular distância até cada um dos 3 centróides
                double distanceToOne = distance.calculateForIris(object, (IrisCentroid) clusters.get(0).getCentroid());
                double distanceToTwo = distance.calculateForIris(object, (IrisCentroid) clusters.get(1).getCentroid());
                double distanceToThree = distance.calculateForIris(object, (IrisCentroid) clusters.get(2).getCentroid());

                //Atribuir esse objeto à lista do Cluster daquele centróide
                if (distanceToOne < distanceToTwo && distanceToOne < distanceToThree) {
                    clusters.get(0).addObjectToList(object);
                    clusters.get(1).removeObjectFromList(object);
                    clusters.get(2).removeObjectFromList(object);

                    clusters.get(0).recalculateCentroid("Iris");
                }

                if (distanceToTwo < distanceToOne && distanceToTwo < distanceToThree) {
                    clusters.get(1).addObjectToList(object);
                    clusters.get(0).removeObjectFromList(object);
                    clusters.get(2).removeObjectFromList(object);

                    clusters.get(1).recalculateCentroid("Iris");
                }

                if (distanceToThree < distanceToOne && distanceToThree < distanceToTwo) {
                    clusters.get(2).addObjectToList(object);
                    clusters.get(0).removeObjectFromList(object);
                    clusters.get(1).removeObjectFromList(object);

                    clusters.get(2).recalculateCentroid("Iris");
                }

            }

        }
        printResults(clusters, type);
    }

    public void runYeastGene(ArrayList<IObject> objects, ArrayList<Cluster> clusters, String type) {
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < objects.size(); i++) {
                YeastGeneObject object = (YeastGeneObject) objects.get(i); //Para cada objeto
                EuclidianDistance distance = new EuclidianDistance();

                double distanceToOne = distance.calculateForYeasteGene(object, (YeastGeneCentroid) clusters.get(0).getCentroid());
                double distanceToTwo = distance.calculateForYeasteGene(object, (YeastGeneCentroid) clusters.get(1).getCentroid());
                double distanceToThree = distance.calculateForYeasteGene(object, (YeastGeneCentroid) clusters.get(2).getCentroid());
                double distanceToFour = distance.calculateForYeasteGene(object, (YeastGeneCentroid) clusters.get(3).getCentroid());
                double distanceToFive = distance.calculateForYeasteGene(object, (YeastGeneCentroid) clusters.get(4).getCentroid());
                double distanceToSix = distance.calculateForYeasteGene(object, (YeastGeneCentroid) clusters.get(5).getCentroid());

                //Atribuir esse objeto à lista do Cluster daquele centróide
                if (distanceToOne < distanceToTwo && distanceToOne < distanceToThree && distanceToOne < distanceToFour
                        && distanceToOne < distanceToFive && distanceToOne < distanceToSix) {
                    clusters.get(0).addObjectToList(object);
                    clusters.get(1).removeObjectFromList(object);
                    clusters.get(2).removeObjectFromList(object);
                    clusters.get(3).removeObjectFromList(object);
                    clusters.get(4).removeObjectFromList(object);
                    clusters.get(5).removeObjectFromList(object);

                    clusters.get(0).recalculateCentroid("YeastGene");
                }

                if (distanceToTwo < distanceToOne && distanceToTwo < distanceToThree && distanceToTwo < distanceToFour
                        && distanceToTwo < distanceToFive && distanceToTwo < distanceToSix) {
                    clusters.get(1).addObjectToList(object);
                    clusters.get(0).removeObjectFromList(object);
                    clusters.get(2).removeObjectFromList(object);
                    clusters.get(3).removeObjectFromList(object);
                    clusters.get(4).removeObjectFromList(object);
                    clusters.get(5).removeObjectFromList(object);

                    clusters.get(1).recalculateCentroid("YeastGene");
                }

                if (distanceToThree < distanceToOne && distanceToThree < distanceToTwo && distanceToThree < distanceToFour
                        && distanceToThree < distanceToFive && distanceToThree < distanceToSix) {
                    clusters.get(2).addObjectToList(object);
                    clusters.get(0).removeObjectFromList(object);
                    clusters.get(1).removeObjectFromList(object);
                    clusters.get(3).removeObjectFromList(object);
                    clusters.get(4).removeObjectFromList(object);
                    clusters.get(5).removeObjectFromList(object);

                    clusters.get(2).recalculateCentroid("YeastGene");
                }

                if (distanceToFour < distanceToOne && distanceToFour < distanceToTwo && distanceToFour < distanceToThree
                        && distanceToFour < distanceToFive && distanceToFour < distanceToSix) {
                    clusters.get(3).addObjectToList(object);
                    clusters.get(0).removeObjectFromList(object);
                    clusters.get(1).removeObjectFromList(object);
                    clusters.get(2).removeObjectFromList(object);
                    clusters.get(4).removeObjectFromList(object);
                    clusters.get(5).removeObjectFromList(object);

                    clusters.get(3).recalculateCentroid("YeastGene");
                }

                if (distanceToFive < distanceToOne && distanceToFive < distanceToTwo && distanceToFive < distanceToThree
                        && distanceToFive < distanceToFour && distanceToFive < distanceToSix) {
                    clusters.get(4).addObjectToList(object);
                    clusters.get(0).removeObjectFromList(object);
                    clusters.get(1).removeObjectFromList(object);
                    clusters.get(2).removeObjectFromList(object);
                    clusters.get(3).removeObjectFromList(object);
                    clusters.get(5).removeObjectFromList(object);

                    clusters.get(4).recalculateCentroid("YeastGene");
                }

                if (distanceToSix < distanceToOne && distanceToSix < distanceToTwo && distanceToSix < distanceToThree
                        && distanceToSix < distanceToFour && distanceToSix < distanceToFive) {
                    clusters.get(5).addObjectToList(object);
                    clusters.get(0).removeObjectFromList(object);
                    clusters.get(1).removeObjectFromList(object);
                    clusters.get(2).removeObjectFromList(object);
                    clusters.get(3).removeObjectFromList(object);
                    clusters.get(4).removeObjectFromList(object);

                    clusters.get(5).recalculateCentroid("YeastGene");
                }
            }

        }      
        printResults(clusters, type);
    }

    public void printResults(ArrayList<Cluster> clusters, String type) {
        
        System.out.println("========= Centroids from "+type+" ==================");
        
        for (int i = 0; i < clusters.size(); i++) {
                ICentroid centroid = clusters.get(i).getCentroid();
                System.out.println("Cluster " + (i + 1));
                centroid.printValues();
        }

        if (type.equals("Iris")) {
            

            for (int i = 0; i < clusters.size(); i++) {           

                System.out.println("=============== Objects from the Iris Cluster " + (i + 1) + "=======================");

                IrisCentroid centroid = (IrisCentroid) clusters.get(i).getCentroid();
                ArrayList<IrisObject> list = new ArrayList();

                CsvFileWriter csvWriter = new CsvFileWriter();
                csvWriter.setIrisCentroid(centroid);

                for (int j = 0; j < clusters.get(i).getObjectsAssigned().size(); j++) {
                    System.out.println("Cluster " + (i + 1) + ", Object " + clusters.get(i).getObjectsAssigned().get(j).getNumberOfThisObject());
                    list.add((IrisObject) clusters.get(i).getObjectsAssigned().get(j));
                }

                csvWriter.writeIrisCsvFile("IrisCluster " + (i + 1) + ".csv", centroid, list);
            }

            System.out.println("========= End of Iris Anaylisis ==================");
        }

        if (type.equals("YeastGene")) {

            for (int i = 0; i < clusters.size(); i++) {
                

                System.out.println("=============== Objects from the YeastGen Cluster " + (i + 1) + "=======================");

                YeastGeneCentroid centroid = (YeastGeneCentroid) clusters.get(i).getCentroid();
                ArrayList<YeastGeneObject> list = new ArrayList();

                CsvFileWriter csvWriter = new CsvFileWriter();
                csvWriter.setYeastCentroid(centroid);

                for (int j = 0; j < clusters.get(i).getObjectsAssigned().size(); j++) {
                    System.out.println("Cluster " + (i + 1) + ", Object " + clusters.get(i).getObjectsAssigned().get(j).getNumberOfThisObject());

                    list.add((YeastGeneObject) clusters.get(i).getObjectsAssigned().get(j));
                }

                csvWriter.writeYeastGeneCsvFile("YestGeneCluster " + (i + 1) + ".csv", centroid, list);
            }

            System.out.println("========= End of YeastGen Anaylisis ==================");
        }

    }

}
