public class Circle extends Figure {
    private int radius;

    public Circle(String nameFigure, int radius) {
        super(nameFigure);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()
                + " radius = " + radius
                + " sm";
    }

    public double area() {
        return radius * radius * Math.PI;
    }
}
