import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by matias on 5/30/17.
 */
public class Triangle {

    private final List<Double> edges;

    public Triangle(double a, double b, double c) {
        this.edges = Arrays.asList(a, b, c);
        Collections.sort(this.edges);

        if (!this.isValidTriangle()) {
            throw new IllegalArgumentException("The triangle inequality must hold for your sides.");
        }
    }

    private boolean isValidTriangle() {
        /*
         The triangle inequality states that the sum of the lengths
         of any two sides of a triangle must be greater than or
         equal to the length of the third side.
          */

        Double firstSide = this.edges.get(0);
        Double secondSide = this.edges.get(1);
        Double thirdSide = this.edges.get(2);

        return firstSide + secondSide > thirdSide;
    }

    public boolean isEquilateral() {
        return getNumberOfDistinctSides() == 1;
    }

    private long getNumberOfDistinctSides() {
        return this.edges.stream().distinct().count();
    }

    public boolean isIsosceles() {
        return getNumberOfDistinctSides() == 2;
    }
}
