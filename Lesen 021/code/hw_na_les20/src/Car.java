public final class Car extends Vehicle{

    public Car(String nomber, String brand, int year) {
        super(nomber, brand, year);
    }

    @Override
    public String toString() {
        return "Car{"+ super.toString() + "}";
    }
}
