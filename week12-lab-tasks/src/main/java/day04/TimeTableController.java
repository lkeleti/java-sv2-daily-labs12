package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TimeTableController {
    private List<TimeTable> beosztasok = new ArrayList<>();

    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String name;
            while ((name = br.readLine()) != null) {
                String subject = br.readLine();
                String className = br.readLine();
                int hours = Integer.parseInt(br.readLine());
                beosztasok.add(new TimeTable(name, subject, className, hours));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int getHoursbyName(String name) {
        int hours = 0;
        for (TimeTable timeTable : beosztasok) {
            if (timeTable.getName().equals(name)) {
                hours += timeTable.getHours();
            }
        }
        return hours;
    }

    public static void main(String[] args) {
        TimeTableController timeTableController = new TimeTableController();
        timeTableController.readFromFile(Paths.get("src/main/resources/beosztas.txt"));
        System.out.println(timeTableController.getHoursbyName("Albatrosz Aladin"));
    }

    public List<TimeTable> getBeosztasok() {
        return new ArrayList<>(beosztasok);
    }
}
