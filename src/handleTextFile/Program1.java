package src.handleTextFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/handleTextFile/sample.txt");
        System.out.println(file.exists());
        if(!file.exists())
            file.createNewFile();


//     ---------------------- FileInputStream --------------------
//      When we want to take a file as a input to read or write we use FileInputStream

//        In Java we have two things Streams and Readers
//        In this both we have again two things
//        Input and output we have both in this to streams and readers
//        InputStreams and OutputStreams
//        when we want to read file we use inputStreams
//        when we want to write file we use outputStreams
//        InputStream means getting data from stream and for OutputStream wise verse.
        FileInputStream fis = new FileInputStream(file);

        // this method id used to read character by character, and it gives a single character in ASCII value.
//       To convert to char use (char) in front of the  fis.read() it gives character
//        if it reaches the end of the file it gives -1.
//        System.out.println((char)fis.read());
        // using while loop we can get all text from the file
        int asccii;
        while((asccii = fis.read() )!= -1 ){
            System.out.print((char)asccii);
        }

//        we must close after completing of our task.
//        For security purpose, if we not close this chance of memory leaks.
        fis.close(); // to close the stream we use this method

//    ----------------- Scanner Method -------------------------------
        Scanner sc = new Scanner(file);

    }
}
