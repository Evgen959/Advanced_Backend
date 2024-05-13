/*
Реализовать 3 класса геометрических фигур: круг, квадрат и прямоугольник. Круг определяется радиусом,
квадрат и прямоугольник своими сторонами. В каждом классе должен быть метод расчета площади фигуры.

В main создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List

Написать метод, который находит фигуру с самой большой площадью

Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение


 */


import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Circle(7.5));
        shapes.add(new Square(10));
        shapes.add(new Square(1.5));
        shapes.add(new Rectangle(5,7));
        shapes.add(new Rectangle(8,3));

        ShapeUtil.print(shapes);
        System.out.println("-------------------------------");
        Shape largestShape= ShapeUtil.getLargestShape(shapes);
        System.out.println("The largest shape is " + largestShape + " with area: " + largestShape.calcArea());

        System.out.println("-------------------------------------------");
        System.out.println(ShapeUtil.getShapesLargeThat(shapes,90));
    }
}