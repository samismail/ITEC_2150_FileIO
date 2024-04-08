package WeatherAnalysis;

import java.io.*;

public class Weather {

    public static void computeData(String input, String output){
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        try(
                BufferedReader br = new BufferedReader(new FileReader(input));
                BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        ){

            for(int i = 0; i < NUMBER_OF_DAYS; i++){

                double sumTem = 0;
                double sumHum = 0;
                for(int j = 0; j < NUMBER_OF_HOURS; j++){

                    String line = br.readLine();
                    if(line == null){
                        break;
                    }

                    String[] element = line.split(" "); //String[] element = line.split("\\s+");
                    double tem = Double.parseDouble(element[2]);
                    double hum = Double.parseDouble(element[3]);
                    sumTem += tem;
                    sumHum += hum;
                }
                    double aveTem = sumTem / NUMBER_OF_HOURS;
                    double aveHum = sumHum / NUMBER_OF_HOURS;


                    bw.write(String.format("Day %s's: Temperature average is %.2f \n", (i + 1),aveTem));
                    bw.write(String.format("Day %s's: Humidity average is %.2f \n", (i + 1),aveHum));
                }
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
    public static void main(String[] args) {
        computeData("weather.txt","report.txt");

    }
}
