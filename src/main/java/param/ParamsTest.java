package param;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamsTest {
    private String expected, actual;

    public ParamsTest(String first, String second) {
        this.expected = first;
        this.actual = second;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object array[][] = {{"ash", "ash"}, {"ashi", "ashi"}, {"dog", "tommy"}};
        return Arrays.asList(array);
    }
    @Test
    public void test() {
        System.out.println("Expected: " + expected + " " + "Actual: "+ actual);
    }

    @Ignore
    @Test(expected = NullPointerException.class)
    public void another() {
        System.out.println("Another Test" + "Expected: " + expected + " " + "Actual: "+ actual);

    }

}
