package ConcreteStrategies;

import java.util.function.Function;

public class CartesianCoordinateSystem implements CoordinateSystem {
    @Override
    public void displayGraph(Function<Double, Double> function) {
        System.out.println("Displaying a graph in Cartesian coordinates");
    }
}
