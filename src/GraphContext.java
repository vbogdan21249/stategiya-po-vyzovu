import ConcreteStrategies.CoordinateSystem;

import java.util.function.Function;

public class GraphContext {
    private CoordinateSystem coordinateSystem;

    public GraphContext(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public void setCoordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public void display(Function<Double, Double> function) {
        coordinateSystem.displayGraph(function);
    }
}
