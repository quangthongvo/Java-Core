package generic;

import java.util.LinkedList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {

        // ?
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Circle(1));
        shapes.add(new Square(1));

        // ? extends T
        List<Shape> newShape = new LinkedList<>();
        newShape.add(new Circle(1));
        newShape.add(new Square(1));
        printArea(newShape);

        // ? super T
    }
    public static void printSize(List<?> shape){
        System.out.println(shape.size());
    }
    public static void printArea(List<Shape> shapes){
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                System.out.println("Circle : " + shape.area());
            }else {
                System.out.println("Square : " + shape.area());
            }
        }
    }


}
