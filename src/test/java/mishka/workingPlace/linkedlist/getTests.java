package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getTests {

    //Проверка, что метод get выводит null в пустом списке.
    @Test
    void testGetInEmptyList(){
        LinkedList<Integer> list = new LinkedList<>();

        assertNull(list.get(0));
    }

    //Проверка, что метод get выводит null в очищенном списке.
    @Test
    void testGetInClearList(){
        Integer[] i = {1,2,3,4};
        LinkedList<Integer> list = new LinkedList<>(i);
        list.clear();

        assertNull(list.get(1));
    }

    //Проверка, что метод get находит необходимый элемент в списке из одного элемента.
    @Test
    void testGetInLonelyList(){
        LinkedList<Integer> list = new LinkedList<>(1);

        assertEquals(1,list.get(0));
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод get находит необходимый элемент в списке из нескольких элементов.
    @Test
    void testGetInNotLonelyList() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertEquals(4,list.get(3));
    }

    //Проверка на ошибку о нарушении границ списка при поиске данных в списке
    @Test
    void testGetOutOfBoundsException() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(5);
        });
    }

}