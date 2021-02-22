package hello;

import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ParamsTest {
    private String expected, actual, third;


    public ParamsTest(String first, String second, String third) {
        this.expected = first;
        this.actual = second;
        this.third = third;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object array[][] = {{"ash", "ash", "ashir"},
                {"ashi", "ashi", "ashirwadam"},
                {"dog", "tommy", "harry"}};
        return Arrays.asList(array);
    }

    @Test
    public void tester() {
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);
        System.out.println("Third: " + third);
    }

}
