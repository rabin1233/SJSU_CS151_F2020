

import java.io.*;

public class ReadFileInput {
    public static void main(String[] args) {

        try {
            File myFile = new File("/Users/rabingurung/IdeaProjects/Assignments/src/Assignment4/exercise2/quote.txt");
            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);

            String nextLine = br.readLine();
            System.out.println("Given Text is Below: ");
            System.out.println(" ");

            while (nextLine != null) {
                System.out.println(nextLine);
                nextLine = br.readLine();
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
