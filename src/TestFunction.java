import static org.junit.Assert.*;
import org.junit.Test;


public class TestFunction
{
    @Test
    public void testSum()
    {
       assertEquals(5, Main._sum(2,3));


    }
    @Test
    public void testMult()
    {
        assertEquals(5, Main._multiply(2,3));
    }


}
