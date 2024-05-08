public class Truck extends Vehicle{
    private double capacity;
    public Truck(String nomber, String make, String model, String year, int i) {
        super(nomber, make, model, year);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "nomber=" + getNomber() +
                ", make=" + getMake() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public void drive (){
        System.out.println(getNomber() + " go! " + " amount of passengers: " + capacity + "t");
    }
}
