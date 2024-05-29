import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    // 1 test добавляется ли в лист значение
    // 2 test при добавлении одного значения меняется коректно сумма
    // 3 test добавляются ли последующие значения оценок
    // 4 test коректно ли сумма при добавлении значений оценок
    // 5 test не добавляются не коректные оценки (<0 > 10 )
    // 6 test больше 10 оценок нельзя добавить

    public void addGrade(int ...grade){
        for (int i = 0; i < grade.length; i++) {
            addGrade(grade[i]);
        }
    }
    // 1 test список коректдно добавляется
    // 2 test

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sumOfGrades == student.sumOfGrades && Objects.equals(name, student.name) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades, sumOfGrades);
    }
}
