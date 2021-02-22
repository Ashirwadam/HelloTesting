import org.junit.Test;
import teach.EBBill;

import static org.junit.Assert.*;


public class EBBillTest

{

    EBBill obj;

    @Test

    public void checkBillAmount()

    {

        obj=new EBBill(45);

        assertEquals(117,obj.calculateBillAmount(),0.01);

        obj=new EBBill(55);

        assertEquals(146.25,obj.calculateBillAmount(),0.01);

        obj=new EBBill(110);

        assertEquals(345.1,obj.calculateBillAmount(),0.01);

        obj=new EBBill(220);

        assertEquals(973.5,obj.calculateBillAmount(),0.01);

        obj=new EBBill(1100);

        assertEquals(8018.5,obj.calculateBillAmount(),0.01);

        obj=new EBBill(5500);

        assertEquals(0.0,obj.calculateBillAmount(),0.01);

        obj=new EBBill(50000);

        assertEquals(0.0,obj.calculateBillAmount(),0.01);

    }

}