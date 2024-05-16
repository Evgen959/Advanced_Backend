import java.util.Random;

public abstract class Plant {
    private static int counter = 0;
    private int id;
    private String title;
    private int height = 0;
    private static int season = 0;
    private Random random = new Random();

    public Plant(String title, int height) {
        id = ++ counter;
        this.title = title; // береться из класса Дерево
        this.height = height; // береться из класса Дерево
    }

    public int getSeason() {
        return season;
    }

    public void changeSeason(){
        if (season < 3){
            season ++;
        } else {
            season = 0;
        }
        grow();
    }

    public static String getSeasonTitle(){
        switch (season){
            case 0: return "spring";
            case 1: return "summer";
            case 2: return "autumn";
            case 3: return "winter";
            default: return "";
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract int getMaxGrowBySeason();
    public abstract int getMaxHeight();
    public void grow(){
        height+= getRndGrowBySeason();
        if (height>getMaxHeight()){
            height = getMaxHeight();
        }
    }

    public int getRndGrowBySeason(){
        return random.nextInt(getMaxGrowBySeason()+1);
    }

    @Override
    public String toString() {
        return "Plant "
                + id +
                " " + title +
                "(" + height +
                ")";// + "       " + getSeasonTitle();
    }
}
