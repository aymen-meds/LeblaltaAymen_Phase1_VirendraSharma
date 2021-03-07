package LockedMeAppPackage;

import LockedMeAppPackage.DisplayFiles;

import java.io.IOException;
import java.util.Scanner;

/**
 * Main LockedMeApp
 */
public class LockedMeApp {

    public static final String PATH = "/home/aymen/Bureau/Filepath/";

    public static void main(String[] args)  {


        int input = 0;
        String inputString;
        Scanner inputsScanner = new Scanner(System.in);


        while (input != 3) {

            System.out.println("LockedMe Application");
            System.out.println("Developed by Mohamed Aymen");
            System.out.println("****************************************************");
            System.out.println("Choose one of the options below");
            System.out.println("1- View the list of files");
            System.out.println("2- Manage files");
            System.out.println("3- Exit");
            System.out.println("****************************************************");

            input = inputsScanner.nextInt();

            switch (input) {

                case 1:

                    System.out.println("========= files list =============");
                    DisplayFiles.display(PATH);
                    System.out.println("==================================");
                    break;


                case 2:

                    while (input != 4) {
                        System.out.println("Managing files menu");
                        System.out.println("**********************************************");
                        System.out.println("1- Add new file");
                        System.out.println("2- Delete existing file");
                        System.out.println("3- Search for a specific file");
                        System.out.println("4- Back to the main menu");
                        input = inputsScanner.nextInt();

                        switch (input) {

                            case 1:
                                try{
                                System.out.println("Enter the file name :");
                                inputString = inputsScanner.next();
                                ManageFiles.addFile(inputString);}
                                catch (IOException e){
                                    e.getMessage();
                                }
                                break;

                            case 2:
                                System.out.println("Enter the file name :");
                                inputString = inputsScanner.next();
                                ManageFiles.deleteFile(inputString);
                                break;

                            case 3:
                                System.out.println("Enter the file name :");
                                inputString = inputsScanner.next();
                                System.out.println(ManageFiles.searchFile(inputString));
                                break;

                            default:
                                break;



                        }
                    }
                break;

                default:
                    break;

            }



        }
        System.out.println("exit from LockedMe");
    }
}
