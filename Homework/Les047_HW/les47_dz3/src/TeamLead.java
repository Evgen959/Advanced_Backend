import java.util.List;

public class TeamLead {
    private String name;
    private String status;
    private List<Programmer> team;

    public TeamLead(String name, String status, List<Programmer> team) {
        this.name = name;
        this.status = status;
        this.team = team;
    }

    @Override
    public String toString() {
        return "TeamLead{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", team=" + team +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public List<Programmer> getTeam() {
        return team;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
