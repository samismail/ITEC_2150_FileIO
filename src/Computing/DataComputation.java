package Computing;

import java.io.*;

class Statistics{
    double sum;
    double lowest;
    double highest;
    double average;

    public Statistics(double sum, double lowest, double highest, double average) {
        this.sum = sum;
        this.lowest = lowest;
        this.highest = highest;
        this.average = average;
    }
}

public class DataComputation {

    public static void main(String[] args) {

        Statistics stats = descriptiveStat("src/Computing/data.txt");
        String output = String.format("///Output\\\\\\ \nSum: %f\nAverage: %.2f\nHighest:%.1f\nLowest: %.1f ", stats.sum,stats.average,stats.highest,stats.lowest);
        writeFile("src/Computing/outputdata.txt",output);
        display(output);
    }

    public static Statistics descriptiveStat(String fileName){
        double sum = 0;
        double lowest = 0;
        double highest = 0;
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line ;
            if((line = br.readLine()) != null){
                String[] dataList = line.split(",");
                for(String number: dataList){
                    double num = Double.parseDouble(number.trim());
                    sum += num;
                    count++;
                    if(num < lowest){
                        lowest =  num;
                    }

                    if(num > highest){
                        highest = num;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        double average  = sum / count;
        return new Statistics(sum, lowest, highest, average);
    }


    public static void writeFile(String outputFileName, String content){

        try(FileWriter fw = new FileWriter(outputFileName);
            BufferedWriter bw = new BufferedWriter(fw);)
        {
            bw.write(content);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void display(String content){
        System.out.println(content);
    }
}
