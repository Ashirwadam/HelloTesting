package hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Changed" );
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void thrower() {
        throw new NullPointerException();
    }
}
