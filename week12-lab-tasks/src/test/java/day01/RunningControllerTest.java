package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class RunningControllerTest {

    @Test
    void testSumOfDistance() {
        RunningController runningController= new RunningController();
        runningController.readFromFile(Path.of("src/test/resources/running.csv"));
        assertEquals(7.1, runningController.distanceInAMonth(2021,11));
        assertEquals(41.2, runningController.distanceInAMonth(2021,12));
    }
}