public class Square extends Figure{
    private int sideA;


    public Square(String nameFigure, int sideA) {
        super(nameFigure);
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return  super.toString()
                + " sideA = " + sideA
                + " sm";
    }

    public double area() {
        return sideA * sideA;
    }


}
