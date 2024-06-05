/*3
Предположим у вас есть List пользователей вашего сайта User(String nickname, String email)
Ваша задача написать метод, который проверит,
может ли быть зарегистрирован User с заданным email или с заданным nickname.
Естественно, и email и nickname должны быть уникальны.*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>(
                List.of()
        );
        System.out.println("Hello world!");
    }
}