package src.exceptionHandlingPart2;

import java.io.*;

public class Program1 {
    static void main(String[] args)  throws Exception {
        File file = new File("./src/handleTextFile/sample.txt");

        if(!file.exists())
            file.createNewFile();

        System.out.println(file);

        try(  FileReader fr = new FileReader(file);
              BufferedReader br = new BufferedReader(fr);
              FileWriter fw = new FileWriter(file);
              BufferedWriter bw = new BufferedWriter(fw)
        ){
            String line;
            StringBuilder existingText = new StringBuilder();
            while ((line = br.readLine()) != null){
                existingText.append(line).append("\n");
            }
            String newText = "Ram Raj";

            existingText.append(newText);
            System.out.println(existingText);
            bw.write(existingText.toString());
        }
//        Handling like this make confuses us so, we can handle like this also
//        catch(Exception ex){
//            ex.getStackTrace();
//        }
        catch (FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch (IOException | ArrayIndexOutOfBoundsException e2){ // multiple exception single variable
            e2.printStackTrace();
        }
        catch (ArithmeticException e3){
            e3.printStackTrace();
        }
// using above code we can handle separate to avoid confusion.

 try{
     int[] arr ={1,2};
//     System.out.println(arr[2] / 0);
//     If we use System.exit(0);
//     It destroys the thread because od that below this line no code will be executed.

 }catch (Exception e1){
     System.out.println("catch");
 }
 finally {
     System.out.println("finally");
 }

//        fr.close();
//        fw.close();
//        br.close();
//        bw.close();
    }
}
