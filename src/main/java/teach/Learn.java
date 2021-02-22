package teach;

import java.util.List;

public class Learn {
    public static void main(String[] args) {
        if (add( 1, 2) == 3) {
            System.out.println("Test Passed");
        } else {
            System.err.println();
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }


}
