package src.handleFileInJava;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {
    public static void main(String[] args) throws IOException {
//        To access file  we need t create object using File
//        provide the path name in the constructor
//        We have to types of path
//         * Absolute path  -> full path or entire location
//         * Relative path  -> using dot | slash(\) | (/)  we can do
//        slash also called separator
//          Ex: - full path =  File f = new File("home/zygal/IdeaProjects/learn-java/src/handleFileInJava");
        File f = new File("./resume.txt"); // relative path
        System.out.println(f.mkdirs());
        System.out.println(f.createNewFile()); // creating the file
//        in above print if file is not present it creates the file and print the true value
//        if file  is already present in folder then it will not create and returns false

//        System.out.println(f.delete()); // To delete the file

        System.out.println(f.exists()); // To check file is exist or not
        System.out.println(f.isHidden()); // To check file is hidden or not
//      we have multiple method to make read, write, delete etc.
//      To check methods type f. you can see the methods available to change the file
//     To make more than one folder use f.mkdir()
        System.out.println(Arrays.toString(f.list())); // gives files & folders in folder
        System.out.println(Arrays.toString(f.listFiles())); // gives files & folders in folder with full path.

    }
}
