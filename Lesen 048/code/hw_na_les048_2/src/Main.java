/* 2 Допустим, у вас в программе есть класс Programmer.
Кроме имени у него есть поле String status; и этот статус
может иметь значение «доступен» «занят» и «не доступен».
Вам необходимо реализовать метод String doWork(String taskMsg)
который в качестве результата, либо возвращает строку stringMsg большими буквами,
либо кидает exception.ProgrammerBusyException (статус “занят”),
либо exception.ProgrammerUnavailableNowException (статус “недоступен”)
в зависимости от текущего состояния программера.

В Main необходимо либо, выводить результат работы либо обработать Exception
и вывести сообщение «Программист занят другой задачей» или «Программист не доступен».*/

import exception.MyGeneralException;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Sergey");
        programmer.setStatus("занят");
        //Программист занят другой задачей
        try {
            String result = programmer.doWork("hello java");
            System.out.println(result);
        }catch (MyGeneralException e){
            System.out.println(e.getMessage());
        }
    }
}