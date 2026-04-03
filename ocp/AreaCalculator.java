package ocp;

import java.util.List;

// OCP Fix: closed for modification, open for extension via polymorphism
public class AreaCalculator {
    public double totalArea(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::area).sum();
    }
}
