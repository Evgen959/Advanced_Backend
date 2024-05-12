public class Rectangle extends Shape {

    private double sideA;
    private double sideB;
    private double area;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        area = sideA*sideB;
    }

    @Override
    public double calcArea(){
        return area;
    }

    @Override
    public String toString() {
        if (sideA==sideB){
            return "Square{" +
                    "side=" + sideA + " " + super.toString() +
                    '}';
        } else {
            return "Rectangle{" +
                    "sideA=" + sideA +
                    ", sideB=" + sideB + " " + super.toString() +
                    '}';
        }
    }
}
