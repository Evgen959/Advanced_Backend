public class Truck {
    String model;
    String manufacturer;
    String color;
    int year;
    int maxWeight;
    int maxFuel;
    String owner;

    int currentWeight = 0;
    int currentFuel = 0;

    public Truck(String model,
                 String manufacturer,
                 int year,
                 String color,
                 int maxWeight,
                 int maxFuel,
                 String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    void load(int weight) {
        if (weight > getRemainingCapacity()) {
            System.out.println("This is too heavy for me! Can't continue");
            printRemainingCapacity();
            return;
        }
        currentWeight += weight;
        System.out.println("Loading " + weight + " kg.......");
        System.out.println("Loaded " + weight + " kg");
        printRemainingCapacity();
    }

    public void unload(int unloadingWeight) {
        if (unloadingWeight > currentWeight) {
            System.out.println("Not enough cargo!");
            printRemainingCargo();
            return;
        }

        if (unloadingWeight < 0) {
            System.out.println("Can't unload negative weight");
            return;
        }

        currentWeight -= unloadingWeight;
        System.out.println("Unloading " + unloadingWeight + " kg...");
        System.out.println("Unloaded " + unloadingWeight + " kg.");

    }


    void printRemainingCargo() {
        System.out.println("Remaining cargo weight is " + currentWeight + " kg");
    }

    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enough fuel, can't drive");
            return;
        }

        if (currentWeight == 0) {
            System.out.println("Please load the truck before driving!");
            return;
        }

        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Year, driving!");
    }

    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah");
    }

    public void setCurrentFuel(int currentFuel) {
        if (currentFuel > maxFuel) {
            this.currentFuel = maxFuel;
        }
        this.currentFuel = currentFuel;
    }

    public String getOwner() {
        return "The owner is " + owner;
    }

    void printRemainingCapacity() {
        System.out.println("Remaining capacity is " + getRemainingCapacity() + " kg");
    }

    int getRemainingCapacity() {
        return maxWeight - currentWeight;
    }

}
