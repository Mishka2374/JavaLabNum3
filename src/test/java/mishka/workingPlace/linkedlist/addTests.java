package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addTests {

    //Проверка, что метод add корректно добавляет элемент в пустой список.
    @Test
    void testAddInEmptyList(){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);

        assertEquals(1,list.size());
        assertTrue(list.contains(1));
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод add корректно добавляет элемент в непустой список.
    @Test
    void testAddInNotEmptyList(){
        Integer [] a = {1,2,3,4,5,6,7};
        LinkedList<Integer> list = new LinkedList<>(a);

        int size = list.size();

        list.add(8);

        assertEquals(size + 1, list.size());
        assertTrue(list.contains(8));
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод add корректно добавляет элемент в список существующих элементов после заданного индекса
    @Test
    void testAddWithIndexInNotEmptyList(){
        Integer [] a = {1,2,3,4,5,6,7};
        LinkedList<Integer> list = new LinkedList<>(a);

        int size = list.size();

        list.add(3,8);

        assertEquals(size + 1, list.size());
        assertTrue(list.contains(8));
        assertFalse(list.isEmpty());
    }

    //Проверка на ошибку о нарушении границ списка при удалении данных из списка
    @Test
    void testAddWithIndexOutOfBoundsException() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(10, 1);
        });
    }

    //Проверка на пустой введённый элемент в список
    @Test
    void testAddWithNullPointerException() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertThrows(NullPointerException.class, () -> {
            list.add(0, null);
        });
    }

}