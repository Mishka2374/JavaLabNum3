package mishka.workingPlace;

/**
 * Класс ArrayList представляет собой реализацию списка массива
 *
 * @param <T> тип данных элементов списка, который пользователь хочет использовать в классе
 *
 * @author Mishka2374
 */
public class ArrayList<T> implements List<T> {
    private Object[] elements;
    private int size;

    /**
     * Метод для увеличения размера списка при нехватке зарезервированных мест
     */
    private void resize() {
        int newSize = (size * 3) / 2 + 1;
        Object[] newArray = new Object[newSize];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    /**
     * Конструктор по умолчанию
     *
     * @example <pre>{@code
     *           ArrayList<Integer> list = new ArrayList<>();
     *      }</pre>
     * */
    public ArrayList() {
        elements = new Object[10];
        size = 0;
    }

    /**
     * Конструктор, принимающий размер массива
     *
     * @param length принимает размер списка
     *
     * @example <pre>{@code
     *           ArrayList<Integer> list = new ArrayList<>(10);
     *      }</pre>
     * */
    public ArrayList(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        elements = new Object[length];
        size = 0;
    }

    /**
     * Конструктор, который позволяет преобразовывать массив в ArrayList
     *
     * @param array  массив элементов
     *
     * @example <pre>{@code
     *                  Integer []a=new Integer[]{1,2,3,4,5};
     *                  ArrayList<Integer> list = new ArrayList<>(a);
     *            }</pre>
     * */
    public ArrayList(T[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }
        elements = new Object[array.length];
        System.arraycopy(array, 0, elements, 0, array.length);
        size = array.length;
    }



    /**
     * Метод, который добавляет указанный элемент в конец этого списка
     *
     * @param e элемент, которые будет добавлен в узел списка
     */
    public void add(T e) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = e;
    }

    /** Метод, который добавляет указанное значение в указанную позицию в этом списке
     *
     * @param e элемент, который хотим добавить
     *
     * @param index позиция добавления
     *
     * @throws IndexOutOfBoundsException при выходе за границы списка
     * */
    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("The index does not match the size");
        }
        if (size == elements.length) {
            resize();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = e;
        size++;
    }

    /**
     * Метод удаления хранящегося в списке значения по указанному индексу
     *
     * @param index индекс, по которому находится значение
     *
     * @throws IndexOutOfBoundsException при выходе за границы списка
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        //T oldValue = (T) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    /**
     * Метод получения хранящегося в списке указанного по индексу значения
     *
     * @param index индекс, по которому находится значение
     *
     * @return значение найденного элемента
     *
     * @throws IndexOutOfBoundsException  выход за границы списка
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    /**
     * Метод замены указанного по индексу значения на указанный элемент
     *
     * @param index индекс, по которому находится значение
     *
     * @return true - замена прошла успешно
     *
     * @throws IndexOutOfBoundsException выход за границы списка
     */
    public boolean set(int index, T e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        elements[index] = e;
        return true;
    }

    /**
     * Метод проверки списка на пустоту
     *
     * @return true - список пустой / false - список непустой
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Метод получения размерности списка
     *
     * @return размер списка
     */
    public int size() {
        return size;
    }

    /**
     * Метод очистки списка
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    //Возвращает true, если этот список содержит указанный элемент
    /**
     * Метод проверяет, содержит ли список указанный элемент
     *
     * @param o - указанный элемент
     *
     * @return true - этот элемент содержится в списке / false - элемента нет в списке
     **/
    public boolean contains(T o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Перегруженный метод toString класса Object
     *
     * @return возвращает строку с информацией об элементах списка
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array:\t[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}