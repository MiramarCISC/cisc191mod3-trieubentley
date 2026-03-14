package edu.sdccd.cisc191;

import java.util.*;

public class Main {
    public static void main(String[] args){

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("A",2));
        shapes.add(new Rectangle("B",3,4));
        shapes.add(new Triangle("C",3,4,5));

        for(Shape s:shapes){
            System.out.println(s.describe());
        }

        shapes.sort(Comparator.comparingDouble(Shape::area));
        System.out.println("Sorted by area:");
        shapes.forEach(System.out::println);
    }
}
