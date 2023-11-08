package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sizeTests {

    //Проверка, что метод size выводит корректный размер пустого списка
    @Test
    void testSizeInEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();

        assertEquals(0, list.size());
    }

    //Проверка, что метод size выводит корректный размер очищенного списка
    @Test
    void testSizeInClearList() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        list.clear();

        assertEquals(0, list.size());
    }

    //Проверка, что метод size выводит корректный размер списка после добавления элемента
    @Test
    void testSizeAfterPushBack() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        int size = list.size();

        assertEquals(size, list.size());

        list.add(6);

        assertEquals(size+1 , list.size());
    }

    //Проверка, что метод size выводит корректный размер списка после удаления элемента
    @Test
    void testSizeAfterRemove() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        int size = list.size();

        list.remove(1);

        assertEquals(size - 1, list.size());
    }

}