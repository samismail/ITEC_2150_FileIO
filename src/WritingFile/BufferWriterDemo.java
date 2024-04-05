package WritingFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        String data = "To be or not to be, \nthat is the question. \nFrom Hamlet.";
        try(BufferedWriter fw = new BufferedWriter(new FileWriter("dataoutput.txt"))) {
            fw.write(data);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
