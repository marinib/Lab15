import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by uComp1337me on 4/24/2017.
 */
public class CountriesTextFile {


    public static void readFromFile() {

        Path filePath = Paths.get("files/Countries.txt");
        File textFile = filePath.toFile();
        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(Scanner s) {
        System.out.println("Please enter a country you want to add: ");
        String countryName = s.nextLine();

        Country country = new Country(countryName);
        Path testPath = Paths.get("files/Countries.txt");
        File testFiles = testPath.toFile();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));
            out.println(country);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}