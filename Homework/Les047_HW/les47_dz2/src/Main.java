/* 2 Допустим, у вас в программе есть класс Programmer.
Кроме имени у него есть поле String status; и этот статус
может иметь значение «доступен» «занят» и «не доступен».
Вам необходимо реализовать метод String doWork(String taskMsg)
который в качестве результата, либо возвращает строку stringMsg большими буквами,
либо кидает ProgrammerBusyException (статус “занят”),
либо ProgrammerUnavailableNowException (статус “недоступен”)
в зависимости от текущего состояния программера.

В Main необходимо либо, выводить результат работы либо обработать Exception
и вывести сообщение «Программист занят другой задачей» или «Программист не доступен».*/



public class Main {
    public static void main(String[] args) throws ProgrammerBusyException, ProgrammerUnavailableNowException  {
        Programmer programmer = new Programmer("Jack", "доступен");
        Programmer programmer2 = new Programmer("Jack", "занят");
        Programmer programmer3 = new Programmer("Jack", "не доступен");

        try {

            System.out.println(doWork(programmer.getStatus()));
            // ДОСТУПЕН
            System.out.println(doWork(programmer2.getStatus()));
            // Программист занят другой задачей
            System.out.println(doWork(programmer3.getStatus()));
            // Программист не доступен

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
}