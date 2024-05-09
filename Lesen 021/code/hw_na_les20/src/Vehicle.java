public abstract class Vehicle {

    private String nomber;
    private String brand;
    private int year;

    public Vehicle(String nomber, String brand, int year) {
        this.nomber = nomber;
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "nomber='" + nomber + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year;
    }

    public String getNomber() {
        return nomber;
    }

    public void drive() {
        System.out.println(getNomber() + " drive ------");
    }
}
