/* 3. **	Давайте дополним задачу 2. Допустим, у вас в программе есть TeamLead,
который  тоже может быть «доступен» и «не доступен», что определяется текущим значением поля status.
Еще у него есть поле List<Programmer> team, которое содержит список программистов.
Реализовать метод String doTask(String taskMsg), который пытается «поручить» задачу
первому доступному программисту ( вызвав у него doWork(String taskMsg) и вернут результат,
либо кидает TeamLeadUnavailableNowException (TeamLead не доступен)
либо AllProgrammersAreBusyNowException (не нашлось доступных пронраммистов).
В зависимости от результата, вызывающий main выводить результат работы
или сообщение «Нам не хватает программистов!» или «Почему TeamLead не на месте». */



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}