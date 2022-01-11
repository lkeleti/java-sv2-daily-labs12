package day02;

public class MathAlgorithms {

    public int lnko(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return lnko(b, a % b);
        }
    }
}