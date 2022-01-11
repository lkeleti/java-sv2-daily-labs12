package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void lnkoTest() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(21, mathAlgorithms.lnko(1071,462));
        assertEquals(333, mathAlgorithms.lnko(999,666));
    }


}