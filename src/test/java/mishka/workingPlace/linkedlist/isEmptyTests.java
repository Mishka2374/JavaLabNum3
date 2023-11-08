package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEmptyTests {

    //Проверка, что isEmpty работает в пустом списке
    @Test
    void testIsEmptyInEmptyList(){
        LinkedList<Integer> list = new LinkedList<>();

        assertTrue(list.isEmpty());
    }

    //Проверка, что isEmpty работает в непустом списке из одного элемента
    @Test
    void testIsEmptyInLonelyList(){
        LinkedList<Integer> list = new LinkedList<>(1);

        assertFalse(list.isEmpty());
    }

    //Проверка, что isEmpty работает в непустом списке из нескольких элементов
    @Test
    void testIsEmptyInNotLonelyList(){
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertFalse(list.isEmpty());
    }

    //Проверка, что isEmpty работает после удаления всех элементов
    @Test
    void testIsEmptyAfterRemovingAllElements() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        list.clear();

        assertTrue(list.isEmpty());
    }

}