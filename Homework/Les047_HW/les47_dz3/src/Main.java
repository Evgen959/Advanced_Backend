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
либо кидает TeamLeadUnavailableNowException (TeamLead не доступен)
либо AllProgrammersAreBusyNowException (не нашлось доступных программистов).
В зависимости от результата, вызывающий main выводить результат работы
или сообщение «Нам не хватает программистов!» или «Почему TeamLead не на месте». */


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Programmer> programmers = List.of(
                new Programmer("Jack", "занят"),
                new Programmer("Ann", "не доступен"),
                new Programmer("Lena", "занят"),
                new Programmer("Mick", "доступен"),
                new Programmer("Bob", "доступен")
        );

        TeamLead teamLead = new TeamLead("Bil", "доступен", programmers);

        try {

            System.out.println(doTask("поручить задачу"));


        }catch (ProgrammerBusyException e){
            System.out.println("Программист занят другой задачей");
        }catch (ProgrammerUnavailableNowException e){
            System.out.println("Программист не доступен");
        }
    }

    public static String doWork(String taskMsg) throws ProgrammerBusyException, ProgrammerUnavailableNowException{
        if (taskMsg == "занят"){
            throw new ProgrammerBusyException();
        }
        if (taskMsg == "не доступен"){
            throw new ProgrammerUnavailableNowException();
        }
        return taskMsg.toUpperCase();
    }

    public static String doTask(String taskMsg){

        return null;
    }
}