package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.IrisCentroid;
import model.IrisObject;
import model.YeastGeneCentroid;
import model.YeastGeneObject;

/**
 * @author ashraf
 *
 */
public class CsvFileWriter {

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private IrisCentroid irisCentroid;
    private YeastGeneCentroid yeastCentroid;

    //CSV file header
    private static String FILE_HEADER = "number of object,attribute 1,attribute 2, attribute 3, attribute 4";

    public void setIrisCentroid(IrisCentroid centroid) {
        this.irisCentroid = centroid;
    }

    public YeastGeneCentroid getYeastCentroid() {
        return yeastCentroid;
    }

    public void setYeastCentroid(YeastGeneCentroid yeastCentroid) {
        this.yeastCentroid = yeastCentroid;
    }

    public IrisCentroid getIrisCentroid() {
        return irisCentroid;
    }

    public void writeIrisCsvFile(String fileName, IrisCentroid centroid, ArrayList<IrisObject> objects) {

        FILE_HEADER = "number of object, attribute 1, attribute 2, attribute 3, attribute 4";

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

                        //Adicionando Centroid
            fileWriter.append("Centroid");
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeOne()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeTwo()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeThree()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeFour()));
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            for (IrisObject object : objects) {
                fileWriter.append(String.valueOf(object.getNumberOfThisObject()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeOne()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeTwo()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeThree()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeFour()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }

    public void writeYeastGeneCsvFile(String fileName, YeastGeneCentroid centroid, ArrayList<YeastGeneObject> objects) {
        FILE_HEADER = "number of object,attribute 1,attribute 2, attribute 3, attribute 4, attribute 5, attribute 6, attribute 7";

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

                        //Adicionando Centroid
            fileWriter.append("Centroid");
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeOne()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeTwo()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeThree()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeFour()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeFive()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeSix()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(centroid.getAttributeSeven()));
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            for (YeastGeneObject object : objects) {
                fileWriter.append(String.valueOf(object.getNumberOfThisObject()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeOne()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeTwo()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeThree()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeFour()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeFive()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeSix()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(object.getAttributeSeven()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}
