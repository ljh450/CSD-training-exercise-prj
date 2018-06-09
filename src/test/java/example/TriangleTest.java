package example;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void test_0_0_0(){

        Triangle triangle = new Triangle(0,0,0);
        // assert
        Assert.assertFalse(triangle.isAvailable());
    }

}
