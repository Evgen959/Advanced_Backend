public class Bus extends Vehicle{
    private double quantity;
    public Bus(String nomber, String make, String model, String year, int i) {
        super(nomber, make, model, year);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "nomber=" + getNomber() +
                ", make=" + getMake() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public void drive (){
        System.out.println(getNomber() + " go! " + " number of passengers: " + quantity);
    }
}
