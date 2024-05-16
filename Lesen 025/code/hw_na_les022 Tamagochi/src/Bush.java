public class Bush extends Plant{

    //              spring      summer      autumn      winter
    //40cm            10sm        10sm        3sm         0           1.5m
    private static final int GROW_SPRING = 10;
    private static final int GROW_SUMMER = 10;
    private static final int GROW_AUTUMN = 3;
    private static final int GROW_WINTER = 0;

    private static final int INIT_HEIGHT = 40;
    private static final int MAX_HEIGHT = 150;

    public Bush(String title) {
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
