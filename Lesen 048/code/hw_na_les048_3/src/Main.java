/*  2 Допустим, у вас в программе есть класс Programmer.
Кроме имени у него есть поле String status; и этот статус
может иметь значение «доступен» «занят» и «не доступен».
Вам необходимо реализовать метод String doWork(String taskMsg)
который в качестве результата, либо возвращает строку stringMsg большими буквами,
либо кидает ProgrammerBusyException (статус “занят”),
либо ProgrammerUnavailableNowException (статус “недоступен”)
в зависимости от текущего состояния программера.
В Main необходимо либо, выводить результат работы либо обработать Exception
и вывести сообщение «Программист занят другой задачей» или «Программист не доступен».

    3. **	Давайте дополним задачу 2. Допустим, у вас в программе есть TeamLead,
который  тоже может быть «доступен» и «не доступен», что определяется текущим значением поля status.
Еще у него есть поле List<Programmer> team, которое содержит список программистов.
Реализовать метод String doTask(String taskMsg), который пытается «поручить» задачу
первому доступному программисту ( вызвав у него doWork(String taskMsg) и вернут результат,
либо кидает exception.TeamLeadUnavailableNowException (TeamLead не доступен)
либо exception.AllProgrammersAreBusyNowException (не нашлось доступных программистов).
В зависимости от результата, вызывающий main выводить результат работы
или сообщение «Нам не хватает программистов!» или «Почему TeamLead не на месте». */


import exception.AllProgrammersAreBusyNowException;
import exception.MyGeneralException;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("p1");
        Programmer p2 = new Programmer("p2");
        Programmer p3 = new Programmer("p3");
        Programmer p4 = new Programmer("p4");
        Programmer p5 = new Programmer("p5");
        p1.setStatus("не доступен");
        p2.setStatus("занят");
        p3.setStatus("не доступен");
        p4.setStatus("занят");
        p5.setStatus("занят");

        TeamLead teamLead = new TeamLead("Tl", List.of(p1,p2,p3,p4,p5));
        teamLead.setStatus("доступен");
        /*Programmer{name='p1', status='доступен'} выполнел задачу
        HELLO JAVA*/
        /*Нам не хватает программистов!
        [p1: Программист не доступен, p2: Программист занят другой задачей,
        p3: Программист не доступен, p4: Программист занят другой задачей,
        p5: Программист занят другой задачей]*/

        try {
            String result = teamLead.doTask("hello java");
            System.out.println(result);
        } catch (AllProgrammersAreBusyNowException e){
            System.out.println(e.getMessage());
            System.out.println(e.getInfo());
        }catch (MyGeneralException e){
            System.out.println(e.getMessage());
        }
    }
}