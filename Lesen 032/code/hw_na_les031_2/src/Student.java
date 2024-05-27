import java.util.ArrayList;
import java.util.List;

public class Student {
    private static final int MAX_QUANTITY_GRADES = 10;
    private static final int MAX_GRADE = 10;
    private static final int MIN_GRADE = 1;
    private String name;
    private List<Integer> grades = new ArrayList<>();
    private int sumOfGrades =0;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int ...grade) {
        this.name = name;
        addGrade(grade);
    }

    public void addGrade(int grade){
        if (grades.size() < MAX_QUANTITY_GRADES && grade >= MIN_GRADE && grade <= MAX_GRADE){
            grades.add(grade);
            sumOfGrades = sumOfGrades + grade;
        }
    }

    public void addGrade(int ...grade){
        for (int i = 0; i < grade.length; i++) {
            addGrade(grade[i]);
        }
    }

    public Integer getShortfall(){
        return MAX_QUANTITY_GRADES * MAX_GRADE - sumOfGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", sumOfGrades=" + sumOfGrades +
                ", getShortfall=" + getShortfall() +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public int getSumOfGrades() {
        return sumOfGrades;
    }
}
