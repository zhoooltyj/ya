package six;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by polosatik on 17.10.17.
 */
public class MathUtilTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Called once before");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Called once after");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }


    @Test
    public void testSum() throws Exception {
        int result = MathUtil.sum(3,4);

        Assert.assertEquals(7, result);
    }

    @Test
    public void TestDivide() throws Exception {
        int result = MathUtil.divide(8,4);
        Assert.assertEquals(2, result);
    }

    @Test (expected = ArithmeticException.class) //отрицательный сценарий, программа должна падать с таким-то эксепшном
    public void TestDivideByZero() throws Exception {
        MathUtil.divide(4,0);
    }
}