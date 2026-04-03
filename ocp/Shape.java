package ocp;

// OCP Fix: abstract base — AreaCalculator never needs to change for new shapes
public abstract class Shape {
    public abstract double area();
}
