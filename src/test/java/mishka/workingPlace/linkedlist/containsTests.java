package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class containsTests {

    //Проверка, что метод contains не работает в пустом списке.
    @Test
    void testContainsInEmptyList(){
        LinkedList<Integer> list = new LinkedList<>();

        assertFalse(list.contains(1));
    }

    //Проверка, что метод contains не работает в очищенном списке.
    @Test
    void testContainsInClearList(){
        Integer[] i = {1,2,3,4};
        LinkedList<Integer> list = new LinkedList<>(i);
        list.clear();

        assertFalse(list.contains(1));
    }

    //Проверка, что метод contains находит необходимый элемент в списке из одного элемента.
    @Test
    void testContainsInLonelyList(){
        LinkedList<Integer> list = new LinkedList<>(1);

        assertTrue(list.set(0,1));
    }

    //Проверка, что метод contains находит необходимый элемент в списке из нескольких элементов.
    @Test
    void testContainsInNotLonelyList() {
        Integer[] i = {1,2,3,4};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertTrue(list.set(2,3));
    }

}