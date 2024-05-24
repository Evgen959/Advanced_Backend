import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void maxNumber() {
        // 1. готовим исходные данные
        // 2. запускаем тестируемый метод
        // 3. сравниваем результат с ожиданием
        List<Integer> integers = List.of(1, 5, 3, 1);
        Integer expectedResult = 5;

        Integer actualResult = Main.maxNumber(integers);
        Assertions.assertEquals(expectedResult, actualResult);


    }

    @Test
    void maxNumber_ifListWithNegativeNumbers(){
        List<Integer> list = List.of(-1, -7, -4, -6);
        Integer expectedResult = -1;

        Integer actualResult = Main.maxNumber(list);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void maxNumber_ifEmptyList_thenReturnNull(){
        List<Integer> list = new ArrayList<>();
        //Integer expectedResult = null;

        Integer actualResult = Main.maxNumber(list);
        Assertions.assertNull(actualResult);
    }
}