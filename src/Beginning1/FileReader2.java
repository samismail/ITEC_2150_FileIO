package Beginning1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/beginning1/hamlet.txt"))){
            String line = reader.readLine();
            while ((line = reader.readLine()) != null){
                System.out.println(line);

            }

        }catch(IOException e){
        }
    }
}
