package ConcreteStrategies;

import java.util.function.Function;

public interface CoordinateSystem {
    void displayGraph(Function<Double, Double> function);
}
