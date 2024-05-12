public class Rectangle extends Figure{
    private int sideA;
    private int sideB;

    public Rectangle(String nameFigure, int sideA, int sideB) {
        super(nameFigure);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return  super.toString()
                + " sideA = " + sideA
                + " sm"
                + " sideB = " + sideB
                + " sm";
    }

    public double area() {
        return sideA * sideB;
    }


}
