import exception.ProgrammerBusyException;
import exception.ProgrammerUnavailableNowException;

public class Programmer {
    private String name;
    private String status;

    public Programmer(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String doWork(String taskMsg) throws ProgrammerBusyException, ProgrammerUnavailableNowException {
        if (status.equals("занят")){
            throw new ProgrammerBusyException("Программист занят другой задачей");
        }
        if (status.equals("не доступен")){
            throw new ProgrammerUnavailableNowException("Программист не доступен");
        }
        return taskMsg.toUpperCase();
    }
}
