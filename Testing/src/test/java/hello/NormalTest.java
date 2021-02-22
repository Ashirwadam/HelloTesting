package hello;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import static org.junit.Assert.*;

public class NormalTest {
    private static Normal normal;
    @BeforeClass
    public static void before() {
        System.out.println("Hello");
        normal = new Normal();
    }
    @Test
    public  void subtractor() {

        assertEquals(normal.subtractor(2, 1), 1);
        System.out.println("From subtractor method");
    }



    @Test
    public  void another() {
        System.out.println("From another method");
    }
}