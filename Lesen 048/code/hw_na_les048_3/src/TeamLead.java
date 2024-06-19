import exception.AllProgrammersAreBusyNowException;
import exception.MyGeneralException;
import exception.TeamLeadUnavailableNowException;

import java.util.ArrayList;
import java.util.List;

public class TeamLead {
    private String name;
    private String status;
    private List<Programmer> programmers;

    public TeamLead(String name, List<Programmer> programmers) {
        this.name = name;
        this.programmers = programmers;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TeamLead{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", programmers=" + programmers +
                '}';
    }

    public String doTask(String taskMsg){
        List<String> list = new ArrayList<>();
        if (status.equals("не доступен")){
            throw new TeamLeadUnavailableNowException("Почему TeamLead не на месте?!");
        }
        for (Programmer programmer: programmers){
            try {
                String result = programmer.doWork(taskMsg);
                System.out.println(programmer + " выполнел задачу");
                return result;
            }catch (MyGeneralException e){
                list.add(programmer.getName() + ": "+e.getMessage() );
            }
        }
        throw new AllProgrammersAreBusyNowException("Нам не хватает программистов!", list);
    }
}
