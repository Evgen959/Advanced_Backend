import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    public static void print(List<Shape> shapes) {
        for ( Shape shape : shapes){
            System.out.println(shape);
        }
    }
    public static Shape getLargestShape(List<Shape> shapes){
        if (shapes==null || shapes.isEmpty()){
            return null;
        }
        Shape largestShape = shapes.get(0);
        for (Shape shape: shapes){
            if(shape.calcArea()>largestShape.calcArea()){
                largestShape=shape;
            }
        }
        return largestShape;
    }

    public static List<Shape> getShapesLargeThat(List<Shape> shapes, double area){
        List<Shape> result = new ArrayList<>();
        for (Shape shape:shapes){
            if(shape.calcArea()>area){
                result.add(shape);
            }
        }
        return result;
    }
}
