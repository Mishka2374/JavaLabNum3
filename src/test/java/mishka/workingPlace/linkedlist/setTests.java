package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class setTests {
    //Проверка, что метод set не работает в пустом списке.
    @Test
    void testSetInOutOfBoundsException() {
        LinkedList<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 1);
        });
    }

    //Проверка, что метод set не работает в очищенном списке.
    @Test
    void testSetInClearList(){
        Integer[] i = {1,2,3,4};
        LinkedList<Integer> list = new LinkedList<>(i);
        list.clear();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 1);
        });
    }

    //Проверка, что метод set заменяет необходимый элемент в списке из одного элемента.
    @Test
    void testSetInLonelyList(){
        LinkedList<Integer> list = new LinkedList<>(1);

        assertTrue(list.set(0,1));
    }

    //Проверка, что метод set заменяет необходимый элемент в списке из нескольких элементов.
    @Test
    void testSetInNotLonelyList() {
        Integer[] i = {1,2,3,4};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertTrue(list.set(2,3));
    }

}