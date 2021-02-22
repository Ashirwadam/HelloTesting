package teach;

import hello.App;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ClientInfoStatus;
import java.util.List;

import static org.junit.Assert.*;


public class LearnTest {
    Normal normal;

    @Before
    public void setUp() throws Exception {
        normal = new Normal();
    }


    @Test
    public void adfsdfdf() {
//        assertEquals(Learn.add(1, 2), 3);
        assertEquals(3, Learn.add(1, 2));
    }

    @Test
    public void testNormal() {
        List<Integer> helper = normal.helper();
        if (helper.size() != 1) {
            fail();
        }
        assertEquals(helper.size(), 1);
    }

//    @Test
//    public void another() {
//        assertTrue(true);
//
//    }
//
//    @Test
//    public void anotherTest() {
//        assertFalse(false);
//
//    }

}