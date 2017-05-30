import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    Triangle scaleneTriangle, equilateralTriangle, isoscelesTriangle;

    @Before
    public void initialize() {
        scaleneTriangle = new Triangle(3.0,9.0,8.0);
        equilateralTriangle = new Triangle(3.0,3.0,3.0);
        isoscelesTriangle = new Triangle(3.0,3.0,5.0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCannotCreateInvalidTriangles() {
        Triangle oneSideTooLongTriangle = new Triangle(3.0,9.0,3.0);
    }

    @Test
    public void testEquilateralTriangle() {
        Assert.assertFalse(scaleneTriangle.isEquilateral());
        Assert.assertFalse(isoscelesTriangle.isEquilateral());
        Assert.assertTrue(equilateralTriangle.isEquilateral());
    }

    @Test
    public void testIsoscelesTriangle() {
        Assert.assertFalse(scaleneTriangle.isIsosceles());
        Assert.assertTrue(isoscelesTriangle.isIsosceles());
        Assert.assertFalse(equilateralTriangle.isIsosceles());
    }
}