import java.util.ArrayList;
import java.util.List;

public class Garden {
    private static List<Plant> plants = new ArrayList<>();

    public static void changeSeason() {
        for (Plant p: plants){
            p.changeSeason();
        }
    }

    public void add(Plant plant){
        plants.add(plant);
    }

    public String tuString(){
        return Plant.getSeasonTitle() +"\n"+ plants.toString();
    }

    public String toString() {
        return tuString();
    }

}
