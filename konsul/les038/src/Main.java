/*
Реализовать класс Text, в котором будет единственное поле String value.
(в рамках данной задачи текст не содержит знаков препинания, слова разделены пробелами).
В рамках данной задачи необходимо реализовать возможность с помощью цикла
for(String word : text)
перебирать слова из строки value.
Подсказка: необходимо реализовать свой итератор.
*/

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Text text = new Text("Nick Jack and John");
        for(String str : text){
            System.out.println(str);
        }

        Iterator<String> iterator = text.iterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("N")){
                iterator.remove();
            }
        }
        System.out.println(text);
    }
}