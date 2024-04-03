package Beginning1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

    public class ReverseRecursion {public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/beginning1/hamlet.txt"))){
            String line = reader.readLine();
            while ((line = reader.readLine()) != null){
                list.add(line);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
        readLineReverseRecursion(list, list.size() - 1);

    }

    public static void readLineReverseRecursion(List<String> lines, int index){
        if(index >= 0){
            System.out.println(lines.get(index));
            readLineReverseRecursion(lines, index - 1);
        }
    }
    }
