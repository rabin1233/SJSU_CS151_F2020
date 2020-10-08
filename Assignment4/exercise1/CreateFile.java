
import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        //creating file and location and adjust accordingly
        File myFile = new File("/Users/rabingurung/IdeaProjects/Assignments/src/Assignment4/exercise1/command_line_input.txt");
        try{
            FileWriter fw = new FileWriter(myFile);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Type Your Text Below: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String nextLine = br.readLine();

            while (nextLine != null) {
                if (nextLine.equals("@q")) {
                    break;
                } else {
                    bw.write(nextLine); //write the current line
                    bw.newLine(); //create new line

                    nextLine = br.readLine(); //reading the next line
                }
            }
            br.close();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }


    }



}

