import java.util.Scanner;

/**
 * Created by uComp1337me on 4/24/2017.
 */

public class CountriesMainApp {
    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome to the Countries Maintenance Application! \nChoose from the following:");
        //Initializing scanner
        Scanner scan = new Scanner(System.in);

        //Start of repeating do/while loop which will repeat the prompt based on user input, setting the boolean to true
        boolean doAgain = true;

        //
        do {System.out.println("\n1. See the list of countries \n2. Add a country \n3. Exit");
            int userChoice = scan.nextInt();

            //This is where the method reads the CountriesTextFile class
            if (userChoice == 1) {
                System.out.println("The countries are: ");
                CountriesTextFile.readFromFile();
            //This is were the method writes to Country.txt through CountriesTextFile class
            } else if (userChoice == 2) {
                Scanner scan2 = new Scanner(System.in);
                CountriesTextFile.writeToFile(scan2);
            } else if (userChoice == 3) {
                System.out.println("Thank you for participating!");
                doAgain = false;
            } else {
                System.out.println("This is not a valid input");
            }

        } while (doAgain);
    }
}
