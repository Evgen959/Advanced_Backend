import java.util.List;

public class Persen {
    private String name;
    private List<String> ibans;

    public Persen(String name, List<String> ibans) {
        this.name = name;
        this.ibans = ibans;
    }

    public String getName() {
        return name;
    }

    public List<String> getIbans() {
        return ibans;
    }

    @Override
    public String toString() {
        return "Persen{" +
                "name='" + name + '\'' +
                ", ibans=" + ibans +
                '}';
    }
}
