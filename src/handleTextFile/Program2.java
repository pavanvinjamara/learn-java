package src.handleTextFile;

import java.io.*;

public class Program2 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/handleTextFile/sample.txt");

        if(!file.exists())
            file.createNewFile();

//        ---------- FileOutputStream -----------------------------
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(72); // we need to pass asccii code so we can get that letter
//      It takes one asccii for one time  to make name you should call that many times
        fos.write(69);
        fos.write(76);
        fos.write(76);
        fos.write(79);

//        using string pass to text file
        String s = "Hello Ram";

        for(char ch:s.toCharArray()){
            fos.write((int)ch);
        }


        fos.flush();// It will flush the old text shows our text
        fos.close();

//      -------------------- FileWriter -----------------------------
        FileWriter fw = new FileWriter(file);

        fw.write(s);
//        we can pass fw.write(s.toCharArray());

        fw.flush();
        fw.close();

//       ------------------- BufferedWriter -------------------------------------
        FileWriter fw1 = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw1);
//       In above line we need pass FileWrite || OutputStreamWriter object
        bw.write(s);
        bw.flush();
        bw.close();

//        We don't have any method to update
//        To do that we First Reader the file and Do change or adding text
//        and update the file using writer

    }
}
