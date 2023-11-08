package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeTests {

    //Проверка, что remove удаляет необходимое значение
    @Test
    void testRemoveTrueValue(){
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);
        int size = list.size();

        list.remove(3); //удалили значение 4

        assertFalse(list.contains(4));
        assertEquals(size - 1, list.size());
    }

    //Проверка, что remove корректно удаляет первый элемент
    @Test
    void testRemoveFirstValue(){
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);
        int size = list.size();

        list.remove(0);

        assertEquals(size - 1, list.size());
        assertFalse(list.contains(1));
    }

    //Проверка, что remove корректно удаляет последний элемент.
    @Test
    void testRemoveLastValue(){
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);
        int size = list.size();

        list.remove(size-1);

        assertEquals(size - 1, list.size());
        assertFalse(list.contains(5));
    }

    //Проверка на ошибку о нарушении границ списка при удалении данных из списка
    @Test
    void testRemoveInOutOfBoundsException() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(10, 1);
        });
    }

}