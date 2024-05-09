public class Truck extends Vehicle{
    private int capacity;

    public Truck(String nomber, String brand, int year, int capacity) {
        super(nomber, brand, year);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                " capacity=" + capacity +
                " tons}";
    }

    public int getCapacity() {
        return capacity;
    }

    public void drive(){
        super.drive();
        System.out.println(getCapacity() + " tons");
    }
}
