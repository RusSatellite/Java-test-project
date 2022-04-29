
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void test0() {
        System.out.println("Test n = 0");
        assertEquals(RandomString.generateRandomString(0), "");
    }

    @Test
    public void test1() {
        System.out.println("Test length");
        assertEquals(RandomString.generateRandomString(100).length(), 100);
    }

}
