package mishka.workingPlace.arraylist;

import mishka.workingPlace.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class containsTests {

    //Проверка, что метод contains не работает в пустом списке.
    @Test
    void testContainsInEmptyList(){
        ArrayList<Integer> list = new ArrayList<>();

        assertFalse(list.contains(1));
    }

    //Проверка, что метод contains не работает в очищенном списке.
    @Test
    void testContainsInClearList(){
        Integer[] i = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>(i);
        list.clear();

        assertFalse(list.contains(1));
    }


    //Проверка, что метод contains находит необходимый элемент в списке из нескольких элементов.
    @Test
    void testContainsInNotLonelyList() {
        Integer[] i = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>(i);

        assertTrue(list.set(2,3));
    }

}