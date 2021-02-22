package hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Unit test for simple App.
 */
//@RunWith(Parameterized.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    private String input, output;
//
//    public AppTest(String input, String output) {
//        this.input = input;
//        this.output = output;
//    }

//    @Parameterized.Parameters
//    public static Collection<Object[]> data() {
//        Object array[][] = {{"ash", "ash"}, {"ashi", "ashi"}};
//        return Arrays.asList(array);
//    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );

    }

    @Test
    public void add() {
        assertEquals(App.add(1, 2), 3);
    }

    @Test(expected = NullPointerException.class)
    public void thrower() {
        App.thrower();
    }

    @Test
    public void testAdd() {
    }
}


