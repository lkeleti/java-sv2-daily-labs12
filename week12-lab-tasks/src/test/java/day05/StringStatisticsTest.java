package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void testCountChar() {
        StringStatistics ss = new StringStatistics();
        assertEquals(3, ss.countCharaters("automata").get('a'));
        assertEquals(null, ss.countCharaters("automata").get('b'));
    }

    @Test
    void testCountCharEmpty() {
        StringStatistics ss = new StringStatistics();
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> ss.countCharaters(null)
        );
        assertEquals(ex.getMessage(), "Text can not be empty!");
    }
}