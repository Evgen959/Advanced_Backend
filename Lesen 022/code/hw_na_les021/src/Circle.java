public class Circle extends Shape {
    private double radius;
    private double area;
    private boolean isCalculated = false;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        // return radius * radius * Math.PI;
        if (!isCalculated){
            area = radius * radius * Math.PI;
            isCalculated = true;
        }
        return area;
    }
    @Override
    public String toString() {
        return "Circle{"
                + " radius = " + radius + " " + super.toString()
                + '}';
    }
}
