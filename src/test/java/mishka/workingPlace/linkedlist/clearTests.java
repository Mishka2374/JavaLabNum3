package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class clearTests {

    //Проверка, что метод clear работает корректно с пустым списком
    @Test
    void testClearInEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();
        int size = list.size();

        list.clear();

        assertEquals(size, list.size());
    }

    //Проверка, что метод clear работает корректно с непустым списком
    @Test
    void testClearInNotEmptyList() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        int size = list.size();

        list.clear();

        assertEquals(size - 5, list.size());
        assertEquals(0,list.size());
    }

}