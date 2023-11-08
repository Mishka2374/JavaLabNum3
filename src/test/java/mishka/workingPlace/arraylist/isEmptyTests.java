package mishka.workingPlace.arraylist;

import mishka.workingPlace.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEmptyTests {

    //Проверка, что isEmpty работает в пустом списке
    @Test
    void testIsEmptyInEmptyList(){
        ArrayList<Integer> list = new ArrayList<>();

        assertTrue(list.isEmpty());
    }

    //Проверка, что isEmpty работает в непустом списке из нескольких элементов
    @Test
    void testIsEmptyInNotLonelyList(){
        Integer[] i = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(i);

        assertFalse(list.isEmpty());
    }

    //Проверка, что isEmpty работает после удаления всех элементов
    @Test
    void testIsEmptyAfterRemovingAllElements() {
        Integer[] i = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(i);

        list.clear();

        assertTrue(list.isEmpty());
    }

}