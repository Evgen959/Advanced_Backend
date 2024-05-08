public class Car extends Vehicle{

    public Car(String nomber, String make, String model, String year) {
        super(nomber, make, model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "nomber=" + getNomber() +
                ", make=" + getMake() +
                ", model=" + getModel() +
                ", year=" + getYear() +
                '}';
    }

    @Override
    public void drive (){
        System.out.println(getNomber() + " go!");
    }
}
