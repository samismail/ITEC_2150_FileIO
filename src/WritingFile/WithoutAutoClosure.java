package WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WithoutAutoClosure {
    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("src/FileIODem1/WritingFile/myFile.txt");
            fw.write("Line 1: Today is Monday and we will have a great time.");
            fw.write("Are you going to see Solar Ecipse today? ");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
