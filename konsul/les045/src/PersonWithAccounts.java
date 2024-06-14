import java.util.List;

public class PersonWithAccounts {
    private String name;
    private int age;
    private List<String> accounts;

    public PersonWithAccounts(String name, int age, List<String> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "PersonWithAccounts{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                '}';
    }
}
