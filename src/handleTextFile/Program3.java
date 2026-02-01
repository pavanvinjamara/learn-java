package src.handleTextFile;

import java.io.*;

public class Program3 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/handleTextFile/sample.txt");

        if(!file.exists())
            file.createNewFile();

        System.out.println(file);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        StringBuilder existingText = new StringBuilder();
        while ((line = br.readLine()) != null){
            existingText.append(line).append("\n");
        }
        String newText = "Ram Raj";
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        existingText.append(newText);
        System.out.println(existingText);
        bw.write(existingText.toString());

//        fr.close();
//        fw.close();
//        br.close();
        bw.close();


    }
}
