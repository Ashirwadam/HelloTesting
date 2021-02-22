package hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;


public class AppTest 
{



    @Test
    public void testAdd() {
        App obj = new App();
        if (App.add(1, 2) == 3) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        assertEquals(obj.add(1, 2), 3);


    }

}
