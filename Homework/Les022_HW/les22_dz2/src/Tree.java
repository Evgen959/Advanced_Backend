public class Tree extends Plant {
    private int heightStart = 150;
    private int maxHeightInSpring = 15;
    private int maxHeightInSummer = 15;
    private int maxHeightInAutumn = 5;
    private int maxHeightInWinter = 5;

    public Tree(String name, int height) {
        super(name, height);
        heightPlantSpring(getHeightStart());
        //this.height = height;
    }

    public int getHeightStart() {
        return heightStart;
    }

    public int getMaxHeightInSpring() {
        return maxHeightInSpring;
    }

    public int getMaxHeightInSummer() {
        return maxHeightInSummer;
    }

    public int getMaxHeightInAutumn() {
        return maxHeightInAutumn;
    }

    public int getMaxHeightInWinter() {
        return maxHeightInWinter;
    }

     /*@Override
    public String toString() {
        return "\n" + super.toString() + ", " +
                "height:" + height;
    }*/

    /*private int heightPlantSpring (int height){
        height = (int)(Math.random()*(height+maxHeightInSpring-height+1) + height);
        return height;
    }*/

    /*private int heightPlantSummer (int height){
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
