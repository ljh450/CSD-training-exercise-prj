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

    @Test
    public void test_1_1_1(){

        Triangle triangle = new Triangle(1,1,1);
        // assert
        Assert.assertTrue(triangle.isAvailable());
    }

    @Test
    public void test_0_0_1(){

        Triangle triangle = new Triangle(0,0,1);
        // assert
        Assert.assertFalse(triangle.isAvailable());
    }

    @Test
    public void test_0_1_1(){

        Triangle triangle = new Triangle(0,1,1);
        // assert
        Assert.assertFalse(triangle.isAvailable());
    }

    @Test
    public void test_0_1_0(){

        Triangle triangle = new Triangle(0,1,0);
        // assert
        Assert.assertFalse(triangle.isAvailable());
    }

    @Test
    public void test_1_0_0(){

        Triangle triangle = new Triangle(1,0,0);
        // assert
        Assert.assertFalse(triangle.isAvailable());
    }

    @Test
    public void test_2_2_2(){

        Triangle triangle = new Triangle(2,2,2);
        // assert
        Assert.assertTrue(triangle.isAvailable());
    }

    @Test
    public void test_F2_2_2(){

        Triangle triangle = new Triangle(-2,2,2);
        // assert
        Assert.assertFalse(triangle.isAvailable());
    }


}
