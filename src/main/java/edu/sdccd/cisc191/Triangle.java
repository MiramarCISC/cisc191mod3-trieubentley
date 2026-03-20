package edu.sdccd.cisc191;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All sides must be positive.");
        }
        // Triangle inequality check
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Sides do not form a valid triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Heron's formula
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangle)) return false;
        Triangle other = (Triangle) obj;
        return Double.compare(this.a, other.a) == 0
                && Double.compare(this.b, other.b) == 0
                && Double.compare(this.c, other.c) == 0
                && this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getName(), a, b, c);
    }
}