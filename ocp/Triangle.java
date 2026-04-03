package ocp;

// OCP Fix: new shape added with ZERO changes to AreaCalculator
public class Triangle extends Shape {
    private final double base, height;
    public Triangle(double base, double height) {
        this.base = base; this.height = height;
    }

    @Override
    public double area() { return 0.5 * base * height; }
}
