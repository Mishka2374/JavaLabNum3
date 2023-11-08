package mishka.workingPlace;
/**
 * Класс MeasureTime представляет собой реализацию вычисление времени работы разных методов
 * коллекций ArrayList и LinkedList при работе с "int" переменными
 *
 * @author Mishka2374
 */
public class MeasureTime {
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
         * @param times матрица, в которую записывают найденное время работы методов коллекций
         *
         * @param numElements - количество повторений данных методов
         * */
        public static void timeWorking(long [][] times, int numElements) {
                LinkedList<Integer> list = new LinkedList<>();
                ArrayList<Integer> array = new ArrayList<>();

                times[0][0] = addTesting(array, numElements);
                times[1][0] = addToTesting(array, numElements);
                times[2][0] = removeTesting(array, numElements);
                times[3][0] = getTesting(array, numElements);
                times[4][0] = setTesting(array, numElements);
                times[5][0] = containsTesting(array, numElements);
                times[6][0] = isEmptyTesting(array, numElements);
                times[7][0] = sizeTesting(array, numElements);
                times[8][0] = clearTesting(array, numElements);

                times[0][1] = addTesting(list, numElements);
                times[1][1] = addToTesting(list, numElements);
                times[2][1] = removeTesting(list, numElements);
                times[3][1] = getTesting(list, numElements);
                times[4][1] = setTesting(list, numElements);
                times[5][1] = containsTesting(list, numElements);
                times[6][1] = isEmptyTesting(list, numElements);
                times[7][1] = sizeTesting(list, numElements);
                times[8][1] = clearTesting(list, numElements);
        }


}
