import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test(expected=IllegalArgumentException.class)
    public void testCannotCreateInvalidTriangles() {
        Triangle oneSideTooLongTriangle = new Triangle(3.0,9.0,3.0);
    }
}