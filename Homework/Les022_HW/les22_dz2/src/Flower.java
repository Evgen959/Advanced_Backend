public class Flower extends Plant {
    private int height;
    private int maxHeightInSpring = 7;
    private int maxHeightInSummer = 10;
    private int maxHeightInAutumn = 0;
    private int maxHeightInWinter = 0;

    public Flower(String name, int height) {
        super(name, height);
        //this.height = heightPlantSpring(height);
    }

    /*@Override
    public String toString() {
        return "\n" + super.toString() + ", " +
                "height=" + height;
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
    }*/
}
