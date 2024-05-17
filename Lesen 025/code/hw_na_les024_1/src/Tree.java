public class Tree extends Plant{

    //spring      summer      autumn      winter
    //15sm        15sm        5sm         5sm         5m
    private static final int GROW_SPRING = 15;
    private static final int GROW_SUMMER = 15;
    private static final int GROW_AUTUMN  = 5;
    private static final int GROW_WINTER = 5;

    private static final int INIT_HEIGHT = 150;
    private static final int MAX_HEIGHT = 500;

    public Tree(String title) {
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
        return MAX_HEIGHT;
    }
}
