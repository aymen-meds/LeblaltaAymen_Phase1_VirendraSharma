package LockedMeAppPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisplayFiles {

    public static final String PATH = "";


    /**
     * @param PATH
     * this method is used to display the list of files existing
     * in the path argument
     */
    public static void display(String PATH){

        File filesPath = new File(PATH);
        List<File> filesList = new ArrayList(Arrays.asList(filesPath.listFiles()));
        Collections.sort(filesList);
        for (File file: filesList) {
            if (file.isFile()) {
                System.out.println("File : "+file.getName());
            }
            else {if (file.isDirectory()){
                System.out.println("Directory : "+file.getName());
            }
            }
        }

    }







}
