package text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "src/data/data.txt";
        StringBuilder sb;
        /*try (BufferedReader br =  new BufferedReader(new FileReader(fileName))){
            sb = new StringBuilder();
            while (br.ready()) {
                String line = br.readLine();
                sb.append(line);
            }
         */
        try (FileReader fr = new FileReader(fileName)){
            System.out.println("Encoding: "+fr.getEncoding());
            sb = new StringBuilder();
            int i ;
            while ((i=fr.read())!=-1)
                sb.append((char)i);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}
