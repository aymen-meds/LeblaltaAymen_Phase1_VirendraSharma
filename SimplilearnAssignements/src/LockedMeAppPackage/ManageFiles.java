package LockedMeAppPackage;

import LockedMeAppPackage.LockedMeApp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this class contains utility methods such add, remove, or searching a file
 */
public class ManageFiles {

    /**
     * @param fileName
     * @throws IOException
     */
    public static void addFile(String fileName) throws IOException {


            File file = new File((LockedMeApp.PATH).concat(fileName));

            if (file.createNewFile()) {
                System.out.println("File " + file.getName() +" created !");
            }
            else {
                if (file.exists()){
                    System.out.println("File"+ file.getName() + " does exist !");
                }
                else{
                    throw new IOException("IO ERROR");
                }
            }

    }

    /**
     * @param fileName
     * this method is used to delete a file
     * specified with the name of the file
     */
    public static void deleteFile(String fileName){

        File file = new File(LockedMeApp.PATH + fileName);
        if (searchFile(fileName)){
            if (file.delete()){
                System.out.println("File "+ file.getName() +" is deleted !");
            }

        }else{
            System.out.println("File doesn't exist !");
        }

    }

    /**
     * @param fileName
     * @return
     * this method returns true if the filename
     * specified exists or false if it doesn't
     */
    public static boolean searchFile(String fileName){

        File filesPath = new File(LockedMeApp.PATH);
        List<File> filesList = new ArrayList(Arrays.asList(filesPath.listFiles()));
        for (File file: filesList) {
            if ((file.getName()).equals(fileName)){
                return true;
            }
        }
        return false;

    }



}
