/* Реализовать 3 класса геометрических фигур: круг, квадрат и прямоугольник.
Круг определяется радиусом, квадрат и прямоугольник своими сторонами.
В каждом классе должен быть метод расчета площади фигуры.
    1. В main создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List
    2. Написать метод, который находит фигуру с самой большой площадью
    3. Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle("Circle 1", 8));
        figures.add(new Circle("Circle 2", 13));
        figures.add(new Square("Square 1", 4));
        figures.add(new Square("Square 2", 7));
        figures.add(new Rectangle("Rectangle 1", 5, 3));
        figures.add(new Rectangle("Rectangle 2", 2, 10));

        System.out.println(figures);

        for (int i = 0; i < figures.size(); i++) {
            System.out.println("'" + figures.get(i).getNameFigure() + "' " + "S = " + figures.get(i).area() + " sm²");
        }

        System.out.println("----- sumFigures ------");
        int sumFigures = 0;
        for (int i = 0; i < figures.size(); i++) {
            sumFigures += figures.get(i).area();
        }

        System.out.println(sumFigures);

        figureMaxArea(figures);


    }
    private static String figureMaxArea ( List figures) {
        String nameFigure = "";
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).area() < figures.get(i ++).area()) {
                
            }
            nameFigure = 

        }

        return nameFigure;
    }

}