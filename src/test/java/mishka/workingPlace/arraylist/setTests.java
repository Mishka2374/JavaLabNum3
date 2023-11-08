package mishka.workingPlace.arraylist;

import mishka.workingPlace.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class setTests {

    //Проверка, что метод set не работает в пустом списке.
    @Test
    void testSetInOutOfBoundsException() {
        ArrayList<Integer> list = new ArrayList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 1);
        });
    }

    //Проверка, что метод set не работает в очищенном списке.
    @Test
    void testSetInClearList(){
        Integer[] i = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>(i);
        list.clear();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 1);
        });
    }

    //Проверка, что метод set заменяет необходимый элемент в списке из одного элемента.
    @Test
    void testSetInLonelyList(){
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(1);

        assertTrue(list.set(0,1));
    }

    //Проверка, что метод set заменяет необходимый элемент в списке из нескольких элементов.
    @Test
    void testSetInNotLonelyList() {
        Integer[] i = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>(i);

        assertTrue(list.set(2,3));
    }

}