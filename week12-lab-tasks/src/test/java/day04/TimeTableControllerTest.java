package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TimeTableControllerTest {
    TimeTableController timeTableController;

    @Test
    void readFromFileTest() {
        timeTableController = new TimeTableController();
        timeTableController.readFromFile(Paths.get("src/main/resources/beosztas.txt"));
        assertEquals(329, timeTableController.getBeosztasok().size());
    }

    @Test
    void readFromBadFileTest() {
        timeTableController = new TimeTableController();
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()->timeTableController.readFromFile(Paths.get("src/main/resources/beosztas_.txt"))
        );
        assertEquals("Can not read file", ise.getMessage());
    }

    @Test
    void getHoursbyNameTest() {
        timeTableController = new TimeTableController();
        timeTableController.readFromFile(Paths.get("src/main/resources/beosztas.txt"));
        assertEquals(24, timeTableController.getHoursbyName("Albatrosz Aladin"));
    }
}