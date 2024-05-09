public class Bus extends Vehicle{

    private int capacity;

    public Bus(String nomber, String brand, int year, int capacity) {
        super(nomber, brand, year);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                " capacity=" + capacity +
                " people}";
    }

    public int getCapacity() {
        return capacity;
    }

    public void drive () {

        System.out.println(getNomber() + "drive -------    with " + getCapacity() + " peple");
    }
}
