public class Circle extends Shape {

    private double radius;
    private double area;
    private boolean isCalculated=false;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea(){
        if (!isCalculated){
            area = Math.PI*radius*radius;
            isCalculated=true;
        }
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " + super.toString() +
                '}';
    }
}
