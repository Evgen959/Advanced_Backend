/*3
Предположим у вас есть List пользователей вашего сайта User(String nickname, String email)
Ваша задача написать метод, который проверит,
может ли быть зарегистрирован User с заданным email или с заданным nickname.
Естественно, и email и nickname должны быть уникальны.*/

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static Set<String> set = null;

    public static void main(String[] args) {

    }

    public static void initSet(List<User> list){
        set = new HashSet<>();
        for (User user: list){
            set.add(user.getNickname());
            set.add(user.getEmail());
        }
        set.add("");
    }

    public static boolean isUserOk(User userToCheck){
        if (set.contains(userToCheck.getEmail()) || set.contains(userToCheck.getNickname())){
            return false;
        } else {
            return true;
        }
    }
}