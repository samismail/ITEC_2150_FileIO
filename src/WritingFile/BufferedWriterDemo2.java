package WritingFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo2 {
    public static void main(String[] args) {
        String[] lines = {"POEM1","POEM2","POEM3"};
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("poem.txt"))){

            for(String eachLine: lines){
                bw.write(eachLine);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
