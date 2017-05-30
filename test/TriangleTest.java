import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test(expected=IllegalArgumentException.class)
    public void testCannotCreateInvalidTriangles() {
        Triangle oneSideTooLongTriangle = new Triangle(3.0,9.0,3.0);
    }

    @Test
    public void testEquilateralTriangle() {
        Triangle scaleneTriangle = new Triangle(3.0,9.0,8.0);
        Triangle equilateralTriangle = new Triangle(3.0,3.0,3.0);

        Assert.assertFalse(scaleneTriangle.isEquilateral());
        Assert.assertTrue(equilateralTriangle.isEquilateral());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle scaleneTriangle = new Triangle(3.0,9.0,8.0);
        Triangle equilateralTriangle = new Triangle(3.0,3.0,3.0);
        Triangle isoscelesTriangle = new Triangle(3.0,3.0,5.0);

        Assert.assertFalse(scaleneTriangle.isIsosceles());
        Assert.assertTrue(isoscelesTriangle.isIsosceles());
        Assert.assertFalse(equilateralTriangle.isIsosceles());
    }
}