public class Bush extends Plant {
    private int height = 40;
    private int maxHeightInSpring = 10;
    private int maxHeightInSummer = 10;
    private int maxHeightInAutumn = 3;
    private int maxHeightInWinter = 0;

    public Bush(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + ", " +
                "height=" + height;
    }

   /* private int heightPlantSpring (int height){
        height = (int)(Math.random()*(height+maxHeightInSpring-height+1) + height);
        return height;
    }*/

    private int heightPlantSummer (int height){
        height = (int)(Math.random()*(height+maxHeightInSummer-height+1) + height);
        return height;
    }

    private int heightPlantAutumn (int height){
        height = (int)(Math.random()*(height+maxHeightInAutumn-height+1) + height);
        return height;
    }

    private int heightPlantWinter (int height){
        height = (int)(Math.random()*(height+ maxHeightInWinter-height+1) + height);
        return height;
    }
}
