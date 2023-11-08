package mishka.workingPlace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureTimeTest {

    @Test
    void addTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.addTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void addToTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.addToTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void removeTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.removeTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void getTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.getTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void setTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.setTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void containsTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.containsTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void isEmptyTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.isEmptyTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void sizeTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.sizeTesting(list, numElements);

        assertTrue(result >= 0);
    }

    @Test
    void clearTesting() {
        List<Integer> list = new ArrayList<>();
        int numElements = 1000;

        long result = MeasureTime.clearTesting(list, numElements);

        assertTrue(result >= 0);
    }
}