package mishka.workingPlace.arraylist;

import mishka.workingPlace.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class clearTests {

    //Проверка, что метод clear работает корректно с пустым списком
    @Test
    void testClearInEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        int size = list.size();

        list.clear();

        assertEquals(size, list.size());
    }

    //Проверка, что метод clear работает корректно с непустым списком
    @Test
    void testClearInNotEmptyList() {
        Integer[] i = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(i);

        int size = list.size();

        list.clear();

        assertEquals(size - 5, list.size());
        assertEquals(0,list.size());
    }

}