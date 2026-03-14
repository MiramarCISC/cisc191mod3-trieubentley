package edu.sdccd.cisc191;

public abstract class Shape implements Measurable, Comparable<Shape> {
    String name;

    Shape(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Shape name cannot be null or empty.");
        }
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Shape other) {
        return this.name.compareTo(other.name);
    }

    public String describe() {
        return String.format("%s[name=%s, area=%.2f, perimeter=%.2f]",
                getClass().getSimpleName(), name, area(), perimeter());
    }

    @Override
    public String toString() {
        return describe();
    }
}