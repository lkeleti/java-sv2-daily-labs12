package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RunningController {
    private List<Running> runnungDatas = new ArrayList<>();

    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.contains("Kilometers;Date")){
                    String[] datas = line.split(";");
                    runnungDatas.add( new Running(Double.parseDouble(datas[0].substring(0,datas[0].indexOf(" km"))), LocalDate.parse(datas[1])));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

    private class Running {
        private double distance;
        private LocalDate date;

        public Running(double distance, LocalDate date) {
            this.distance = distance;
            this.date = date;
        }
    }

    public double distanceInAMonth(int year, int month) {
        double sum = 0.0;
        for (Running running : runnungDatas) {
            if (running.date.getYear() == year && running.date.getMonth().getValue() == month) {
                sum += running.distance;
            }
        }
        return sum;
    }
}
