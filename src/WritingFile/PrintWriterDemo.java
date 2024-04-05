package WritingFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter(new FileWriter("something"))) {
            pw.printf("It rained %d times %s" 2, "last week")
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
