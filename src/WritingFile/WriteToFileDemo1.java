package WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo1 {
    public static void main(String[] args) {
        String data = "To be or not to be, \nthat is the question. \nFrom Hamlet.";
        try(FileWriter fw = new FileWriter("dataoutput.txt")) {
            fw.write(data);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
