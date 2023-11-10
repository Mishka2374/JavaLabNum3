package mishka.workingPlace;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
/**
 * Класс MeasureTimeForCollections представляет собой реализацию вычисление времени работы разных методов
 * встроенных коллекций ArrayList и LinkedList при работе с "int" переменными
 *
 * @author Mishka2374
 */
public class MeasureTimeForCollections {
    //Переменная для указания начала работы метода
    private static long startTime;
    //Переменная для указания конца работы метода
    private static long endTime;

    /** Метод, измеряющий время работы метода добавления элемента, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long addTesting(List<T> list, int numElements){
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.add((T) Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }

    /** Метод, измеряющий время работы метода добавления элемента по индексу, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long addToTesting(List<T> list, int numElements){
        addTesting(list, numElements);

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.add(i,(T) Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы метода удаления элемента, повторенного N раз.
     * Это аналог delete
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long removeTesting(List<T> list, int numElements){
        addTesting(list, numElements);

        int num = numElements;
        startTime = System.nanoTime();
        for (int i = numElements - 1; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы метода нахождения элемента по индексу, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long getTesting(List<T> list, int numElements){
        addTesting(list, numElements);

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы метода замены элемента по индексу, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long setTesting(List<T> list, int numElements){
        addTesting(list, numElements);

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.set(i,(T) Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы метода добавления элемента, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long containsTesting(List<T> list, int numElements){
        addTesting(list, numElements);

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.contains((T) Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы метода проверки на пустоту list, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long isEmptyTesting(List<T> list, int numElements){
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.isEmpty();
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы метода возвращения размера list, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long sizeTesting(List<T> list, int numElements){
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.size();
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы метода чистки list, повторенного N раз
     *
     * @param list переменная некоторой коллекции, у которой
     *             используем данный метод
     *
     * @param numElements - количество повторений данного метода
     * */
    public static <T> long clearTesting(List<T> list, int numElements){
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.clear();
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
    /** Метод, измеряющий время работы коллекций ArrayList и LinkedList,
     * у которых повторяли методы N раз
     *
     * @param times2 матрица, в которую записывают найденное время работы методов коллекций
     *
     * @param numElements - количество повторений данных методов
     * */

    public static void timeWorkingForCollections(long [][] times2, int numElements) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();

        times2[0][0] = addTesting(array, numElements);
        times2[1][0] = addToTesting(array, numElements);
        times2[2][0] = removeTesting(array, numElements);
        times2[3][0] = getTesting(array, numElements);
        times2[4][0] = setTesting(array, numElements);
        times2[5][0] = containsTesting(array, numElements);
        times2[6][0] = isEmptyTesting(array, numElements);
        times2[7][0] = sizeTesting(array, numElements);
        times2[8][0] = clearTesting(array, numElements);

        times2[0][1] = addTesting(list, numElements);
        times2[1][1] = addToTesting(list, numElements);
        times2[2][1] = removeTesting(list, numElements);
        times2[3][1] = getTesting(list, numElements);
        times2[4][1] = setTesting(list, numElements);
        times2[5][1] = containsTesting(list, numElements);
        times2[6][1] = isEmptyTesting(list, numElements);
        times2[7][1] = sizeTesting(list, numElements);
        times2[8][1] = clearTesting(list, numElements);

    }


}
