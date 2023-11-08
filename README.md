# Работа с коллекциями

---

## Задание

Сравнить производительность ArrayList и LinkedList

Необходимо написать код, который бы вызывал основные методы коллекций определенное(1000 или 2000, или любое другое) количество раз. При этом должно засекаться время.

Минимально необходимо протестировать методы:add, delete (== remove), get

После этого вывести таблицу с результатами(метод, сколько раз выполнялся, время выполнения)

---
# Реализованные классы

----
## 1. Одиночный список: LinkedList

Лист включает в себя несколько конструкторов и основные методы для работы с этим списком.

----
## 2. Список массива: ArrayList

Лист включает в себя несколько конструкторов и основные методы для работы с этим списком.

---
### Реализованные методы для LinkedList и ArrayList

- `add(value)`: Добавляет указанный элемент в конец этого списка.
- `add(index, value)`: Вставляет указанный элемент в указанную позицию в этом списке.
- `remove(index)`: Удаляет элемент в указанной позиции в этом списке.
- `get(index)`: Возвращает элемент в указанной позиции в этом списке.
- `set(index, value)`: Заменяет элемент в указанной позиции в этом списке на указанный элемент.
- `isEmpty()`: Проверка на пустоту списка.
- `size()`: Возвращает количество элементов в этом списке.
- `clear()`: Удаляет все элементы из этого списка.
- `contains(value)`: Проверка на наличие указанного элемента в списке.

----
### Функциональный интерфейс: List

Интерфейс включает в себя один абстрактный класс List для работы с коллекциями LinkedList и ArrayList

---
## 3. Замер времени: MeasureTime

Класс включает в себя методы для произведения замеров времени при работе разных методов коллекций LinkedList и ArrayList

---
### Реализованные методы

- `addTesting(list,numElements)`: Измерение времени работы метода добавления за N раз.
- `addToTesting(list,numElements)`: Измерение времени работы метода добавления по указанной позиции за N раз.
- `removeTesting(list, numElements)`: Измерение времени работы метода удаления элемента за N раз.
- `getTesting(list,numElements)`: Измерение времени работы метода получения элемента по позиции за N раз.
- `setTesting(list,numElements)`: Измерение времени работы метода замены элемента за N раз.
- `containsTesting(list,numElements)`: Измерение времени работы метода проверки наличия элемента за N раз.
- `isEmptyTesting(list,numElements)`: Измерение времени работы метода проверки на пустоту за N раз.
- `sizeTesting(list,numElements)`: Измерение времени работы вывода размера списка за N раз.
- `clearTesting(list,numElements)`: Измерение времени работы чистки списка за N раз.

---
## 4. Меню: menu

Меню реализовано для удобной работы со всеми классами pakage.mishka

---
### Реализованный метод

- `answer()`: Работа с пользователем - составление таблицы с результатами (метод, сколько раз выполнялся, время выполнения)
