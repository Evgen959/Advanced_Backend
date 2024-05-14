public abstract class Plant {
    private int id;
    private static int counter =100;
    private String name;
    //private int height;

    public Plant(String name) {
        this.name = name;
        counter ++;
        this.id = counter;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name:" + name + ", " +
                "height:" + getHeight();
    }

    public abstract int getHeight();

    public abstract int getMaxHeightInSpring();

    private int heightPlantSpring (int height){
        height = (int)(Math.random()*(getHeight()+getMaxHeightInSpring()-getHeight()+1) + getHeight());
        return height;
    }

   /* private int heightPlantSummer (int height){
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






























