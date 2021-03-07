package LockedMeAppPackage.Tests;

import LockedMeAppPackage.ManageFiles;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static LockedMeAppPackage.LockedMeApp.PATH;
import static org.junit.jupiter.api.Assertions.*;

class ManageFilesTest {
    File filesPath = new File(PATH);

    @Test
    void addFile() throws IOException {

        ManageFiles.addFile("AAA");
        List<File> filesList = new ArrayList(Arrays.asList(filesPath.listFiles()));
        ArrayList<String> absoluteFileNames = new ArrayList<String>();
        for (File file:filesList) {
           absoluteFileNames.add(file.getName());
        }
        assertTrue(absoluteFileNames.contains("AAA"));
    }

    @Test
    void deleteFile() {
        ManageFiles.deleteFile("AAA");
        List<File> filesList = new ArrayList(Arrays.asList(filesPath.listFiles()));
        ArrayList<String> absoluteFileNames = new ArrayList<String>();
        for (File file:filesList) {
            absoluteFileNames.add(file.getName());
        }
        assertFalse(absoluteFileNames.contains("AAA"));
    }

    @Test
    void searchFile() {
        List<File> filesList = new ArrayList(Arrays.asList(filesPath.listFiles()));
        ArrayList<String> absoluteFileNames = new ArrayList<String>();
        for (File file:filesList) {
            absoluteFileNames.add(file.getName());
        }
        assertTrue(absoluteFileNames.contains("file1"), String.valueOf(true));

    }

}