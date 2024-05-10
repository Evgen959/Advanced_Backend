public abstract class Figure {
    private String nameFigure;

    public Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    @Override
    public String toString() {
        return "nameFigure = " + nameFigure + ",";
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public abstract double area();


}
