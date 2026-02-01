package src.handleTextFile;

import java.io.*;
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
//        we can do like also   Scanner sc = new Scanner(new FileInputStream(file));
//        if we do above line we need to close file input stream also.
//    for word, we use hasNext and next for sentence or line we use hasNextLine and nextLine
        while(sc.hasNext()){
            System.out.println(sc.next());
        }

        sc.close();

//  -------------  FileReader  -----------------------
        FileReader fr = new FileReader(file);
//        This works same as File Input Streams
        int asccii2;
        while((asccii2 = fr.read()) != -1){
            System.out.print((char)fr.read());
        }

        fr.close();

//        ---------- BufferReader ----------------------
//         we need pass FileReader in the constructor Or InputStreamReader
        FileReader fr2 = new FileReader(file);
        BufferedReader br = new BufferedReader(fr2);
//        It can read character by character || line by line

//        br.read() gives char by char
        int asccii3;
        while((asccii3 = br.read()) != -1){
            System.out.print((char)asccii3);
        }
//        System.out.println(br.readLine() + "--");
//        To read line by line br.readLine()
//        In this it read line by line if it reaches end it gives null value.
//            String line = new String();
//            while((line = br.readLine()) != null){
//                System.out.println(line + "---");
//            }
//        close both file reader and buffer reader
        fr2.close();
        br.close();

    }
}
