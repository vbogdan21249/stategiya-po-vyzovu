import ConcreteStrategies.CartesianCoordinateSystem;
import ConcreteStrategies.PolarCoordinateSystem;

import java.util.function.Function;


public class Main {

    public static void main(String[] args) {
        GraphContext graph = new GraphContext(new CartesianCoordinateSystem());

        Function<Double, Double> function = x -> x * x;

        graph.display(function);

        graph.setCoordinateSystem(new PolarCoordinateSystem());

        graph.display(function);
    }
}