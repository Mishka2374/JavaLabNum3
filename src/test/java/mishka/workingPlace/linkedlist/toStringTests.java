package mishka.workingPlace.linkedlist;

import mishka.workingPlace.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class toStringTests {
    //Проверка, что метод toString работает с пустым списком
    @Test
    void testToStringInEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();

        assertEquals("List:\t", list.toString());
    }

    //Проверка, что метод toString работает с непустым списком
    @Test
    void testToStringInNotEmptyList() {
        Integer[] i = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList<>(i);

        assertEquals("List:\t1 --> 2 --> 3 --> 4 --> 5", list.toString());
    }

}