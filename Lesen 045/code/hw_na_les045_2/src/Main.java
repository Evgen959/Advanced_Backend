/* 2.
Дан список групп Cohort (String title, List<Student> students).
У каждого студента задан список контактных email-ов:
Student{String name, List<String> emails}
Руководство поставило задачу организовать рассылку email-ов.
Необходимо написать метод, который возвращает список всех емэйлов без повторов.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cohort> cohorts = List.of(new Cohort("cohort_1", List.of(
                        new Student("Jack", List.of("jick@mail.com", "jack12@gmx.de")),
                        new Student("Nick", List.of("nick@gmx.de")),
                        new Student("Ann", List.of("nick@gmx.de", "ann@gmx.de")),
                        new Student("Stan", List.of("stan@mail.com", "stan@gmx.de", "stan@Hotmail.com"))
                )),
                new Cohort("cohort_2", List.of(
                        new Student("Ron", List.of("ron@mail.com")),
                        new Student("Rick", Collections.emptyList()),
                        new Student("Rick", null),
                        new Student("Roman", List.of("roman@gmx.de", "roman@gmail.de"))
                )),
                new Cohort("cohort_1", List.of(
                        new Student("Stan", List.of("stan@mail.com", "stan@gmx.de", "stan@Hotmail.com")))
                )
        );


        List<String> emails = getEmails(cohorts);
        System.out.println(emails);

    }

    public static  List<String> getEmails(List<Cohort> list){
        Set<String> emails = list.stream()
                .filter(c->c.getStudents()!=null && !c.getStudents().isEmpty())
                .flatMap(c -> c.getStudents().stream())
                .filter(s->s.getEmails()!=null && !s.getEmails().isEmpty())
                .flatMap(s -> s.getEmails().stream())
                .collect(Collectors.toSet());
        return new ArrayList<>(emails);
    }
}