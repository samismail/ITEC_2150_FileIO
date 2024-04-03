package Beginning1;
import java.io.File;
import java.util.Scanner;
import  java.io.FileNotFoundException;
public class FileReaderExample {
    public static void main(String[] args) {
        try{
            File file = new File("src/Beginning1/hamlet.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
    } catch (FileNotFoundException e){
            System.out.println(e);
        }
}
}