package mishka.workingPlace.arraylist;

import mishka.workingPlace.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class toStringTests {
    //Проверка, что метод toString работает с пустым списком
    @Test
    void testToStringInEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();

        assertEquals("Array:\t[]", list.toString());
    }

    //Проверка, что метод toString работает с непустым списком
    @Test
    void testToStringInNotEmptyList() {
        Integer[] i = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(i);

        assertEquals("Array:\t[1, 2, 3, 4, 5]", list.toString());
    }

}