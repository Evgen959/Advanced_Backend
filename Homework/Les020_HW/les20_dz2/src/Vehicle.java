public class Vehicle {
    private String nomber;
    private String make;
    private String model;
    private String year;

    public Vehicle(String nomber, String make, String model, String year) {
        this.nomber = nomber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getNomber() {
        return nomber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void drive (){}

}
