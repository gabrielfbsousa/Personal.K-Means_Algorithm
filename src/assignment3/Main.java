/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import controllers.ClusterController;
import controllers.ObjectController;
import java.io.IOException;
import model.Cluster;

/**
 *
 * @author GabrielFerreira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        ClusterController clusterController = new ClusterController();
        String type = "Iris";

        //===============================================Step 3
        for (int i = 0; i < 3; i++) {
            Cluster cluster = new Cluster();
            clusterController.addClusterToList(cluster);
        }
        clusterController.assignValuesToClusters("./src/res/Iris_Initial_Centroids.csv", type);

        ObjectController objectController = new ObjectController();
        objectController.assignValuesToObjects("./src/res/Iris.csv", type);

        KMean kmean = new KMean(objectController, clusterController);
        kmean.initialize(type);
        
        
        //================================================Step 5
        clusterController = new ClusterController();
        type = "YeastGene";
        
        
        for (int j = 0; j < 6; j++){
            Cluster cluster = new Cluster();
            clusterController.addClusterToList(cluster);
        }
        clusterController.assignValuesToClusters("./src/res/YeastGene_Initial_Centroids.csv", type);
        
        objectController = new ObjectController();
        objectController.assignValuesToObjects("./src/res/YeastGene.csv", type);

        kmean = new KMean(objectController, clusterController);
        kmean.initialize(type);
          
    }

}
