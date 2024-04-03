package Beginning1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReverseRetrieve {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/beginning1/hamlet.txt"))){
            String line = reader.readLine();
            while ((line = reader.readLine()) != null){
                list.add(line);
            }


        }catch (IOException e){
            e.printStackTrace();
        }


        for (int i = list.size() -1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
