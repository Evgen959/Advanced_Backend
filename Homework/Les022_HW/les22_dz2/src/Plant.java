public class Plant {
    private int id;
    private static int counter =100;
    private String name;
    private int height;

    public Plant(String name, int height) {
        this.height = height;
        this.name = name;
        counter ++;
        this.id = counter;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name:" + name + ", " +
                "height:" + height;
    }

    private int heightPlantSpring (int height){
        height = (int)(Math.random()*(height+maxHeightInSpring-height+1) + height);
        return height;
    }

    private int heightPlantSummer (int height){
        height = (int)(Math.random()*(height+maxHeightInSummer-height+1) + height);
        return height;
    }

    private int heightPlantAutumn (int height){
        height = (int)(Math.random()*(height+maxHeightInAutumn-height+1) + height);
        return height;
    }

    private int heightPlantWinter (int height){
        height = (int)(Math.random()*(height+maxHeightInWinter-height+1) + height);
        return height;
    }
}
