package mishka.workingPlace.arraylist;

import mishka.workingPlace.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addTests {
    //Проверка, что метод add корректно добавляет элемент в пустой список.
    @Test
    void testAddInEmptyList(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        assertEquals(1,list.size());
        assertTrue(list.contains(1));
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод add корректно добавляет элемент в непустой список.
    @Test
    void testAddInNotEmptyList(){
        Integer [] a = {1,2,3,4,5,6,7};
        ArrayList<Integer> list = new ArrayList<>(a);

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
        ArrayList<Integer> list = new ArrayList<>(a);

        int size = list.size();

        list.add(3,8);

        assertEquals(size + 1, list.size());
        assertTrue(list.contains(8));
        assertFalse(list.isEmpty());
    }

    //Проверка на ошибку о нарушении границ списка при удалении данных из списка
    @Test
    void testAddWithIndexOutOfBoundsException() {
        Integer[] a = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(a);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(10, 1);
        });
    }


}