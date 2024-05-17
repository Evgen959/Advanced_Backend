public class Flower extends Plant{

    //spring      summer      autumn      winter
    // 7sm         10sm        0           0
    private static final int GROW_SPRING = 7;
    private static final int GROW_SUMMER = 10;
    private static final int GROW_AUTUMN  = 0;
    private static final int GROW_WINTER = 0;

    private static final int INIT_HEIGHT = 0;
    //private static final int MAX_HEIGHT = -1;

    public Flower(String title) {
        super(title, INIT_HEIGHT);
    }

    @Override
    public int getMaxGrowBySeason() {
        switch (getSeasonTitle()){
            case "spring": return GROW_SPRING;
            case "summer": return GROW_SUMMER;
            case "autumn": return GROW_AUTUMN;
            case "winter": return GROW_WINTER;
            default: return 0;
        }
    }

    @Override
    public int getMaxHeight() {
        return 0;
    }

    @Override
    public void grow(){
        setHeight(getHeight() + getRndGrowBySeason());
        if(getSeasonTitle().equals("winter")){
            setHeight(0);
        }
    }


}
