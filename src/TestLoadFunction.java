import org.junit.Test;

public class TestLoadFunction {

    @Test(timeout = 10000)
    public void loadSum()
    {
        for(int i = 0;i < 100000; ++i)
        {
            Main._sum(2,3);
        }

    } @Test(timeout = 10000)
    public void loadMultiply()
    {
        for(int i = 0;i < 100000; ++i)
        {
            Main._multiply(2,3);
        }

    }
}
