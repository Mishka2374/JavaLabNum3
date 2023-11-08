package mishka.workingPlace.arraylist;

import mishka.workingPlace.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getTests {
    //Проверка, что метод get выводит IndexOutOfBoundsException в пустом списке.
    @Test
    void testGetInEmptyList(){
        ArrayList<Integer> list = new ArrayList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(5);
        });
    }

    //Проверка, что метод get выводит IndexOutOfBoundsException в очищенном списке.
    @Test
    void testGetInClearList(){
        Integer[] a = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>(a);
        list.clear();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(5);
        });
    }

    //Проверка, что метод get находит необходимый элемент в списке из одного элемента.
    @Test
    void testGetInLonelyList(){
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(1);

        assertEquals(1,list.get(0));
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод get находит необходимый элемент в списке из нескольких элементов.
    @Test
    void testGetInNotLonelyList() {
        Integer[] i = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(i);

        assertEquals(4,list.get(3));
    }

    //Проверка на ошибку о нарушении границ списка при поиске данных в списке
    @Test
    void testGetOutOfBoundsException() {
        Integer[] i = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(i);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(5);
        });
    }

}