package mishka;
import mishka.workingPlace.MeasureTime;

import java.util.Scanner;
/**
 * Класс menu представляет собой реализацию работы "меню" упрощённой работы
 * с чем-либо. В данном случае меню работает для сравнения разных методов
 * коллекций ArrayList и LinkedList
 *
 * @author Mishka2374
 */
public class menu {
    /**
     * Метод для реализации составления сравнительной таблицы
     * методов коллекций ArrayList и LinkedList
     */
    public static void answer()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, Вас приветствует МЕНЮ \n по сравнению работы методов коллекций ArrayList и LinkedList.\nПожалуйста, укажите количество повторений:");
        //Повтор на правильный ввод значения
        int numElements;
        do {
            numElements = scanner.nextInt();
            if (numElements < 0) System.out.println("Неправильно введено число, повторите:");
        } while (numElements < 0);

        System.out.println("Выберите действие:");
        System.out.println("1) Сравнить ВСЕ имеющиеся методы - нажмите \"1\"");
        System.out.println("2) Сравнить метод add - нажмите \"2\"");
        System.out.println("3) Сравнить метод add (добавление по индексу, обозн. addTo в табл.) - нажмите \"3\"");
        System.out.println("4) Сравнить метод remove - нажмите \"4\"");
        System.out.println("5) Сравнить метод get - нажмите \"5\"");
        System.out.println("6) Сравнить метод set - нажмите \"6\"");
        System.out.println("7) Сравнить метод contains - нажмите \"7\"");
        System.out.println("8) Сравнить метод isEmpty - нажмите \"8\"");
        System.out.println("9) Сравнить метод size - нажмите \"9\"");
        System.out.println("10) Сравнить метод clear - нажмите \"10\"");
        System.out.println("11) Пересчитать время работы методов - нажмите \"11\"");
        System.out.println("12) Изменить количество повторений (изменится время работы) - нажмите \"12\"");
        System.out.println("Выход - нажмите любое отрицательное число");
        int x;
        String []methods = {"add", "addTo", "remove", "get", "set", "contains", "isEmpty", "size", "clear"};
        do {
            System.out.println("\nВернуться в меню - \"0\" \t Выход - \"-1\"");
            x = scanner.nextInt();
            long[][] times = new long[9][3];
            MeasureTime.timeWorking(times, numElements); //Посчитали все значения

            switch (x) {
                case 0:
                    System.out.println("Выберите действие:");
                    System.out.println("1) Сравнить ВСЕ имеющиеся методы - нажмите \"1\"");
                    System.out.println("2) Сравнить метод add - нажмите \"2\"");
                    System.out.println("3) Сравнить метод add (добавление по индексу, обозн. addTo в табл.) - нажмите \"3\"");
                    System.out.println("4) Сравнить метод remove - нажмите \"4\"");
                    System.out.println("5) Сравнить метод get - нажмите \"5\"");
                    System.out.println("6) Сравнить метод set - нажмите \"6\"");
                    System.out.println("7) Сравнить метод contains - нажмите \"7\"");
                    System.out.println("8) Сравнить метод isEmpty - нажмите \"8\"");
                    System.out.println("9) Сравнить метод size - нажмите \"9\"");
                    System.out.println("10) Сравнить метод clear - нажмите \"10\"");
                    System.out.println("11) Пересчитать время работы методов - нажмите \"11\"");
                    System.out.println("12) Изменить количество повторений (изменится время работы) - нажмите \"12\"");
                    System.out.println("Выход - нажмите любое отрицательное число");
                    break;
                case 1:
                    print();
                    for (int i = 0; i < 9; i++) {
                        System.out.printf("%-9s %-3s %-15s %-15s %-15s",methods[i],"|",times[i][0] + " ns",times[i][1] + " ns", numElements );
                        System.out.println();
                    }
                    break;
                case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                    print();
                    System.out.printf("%-9s %-3s %-15s %-15s %-18s",methods[x-2],"|",times[x-2][0] + " ns",times[x-2][1] + " ns", numElements);
                    break;
                case 11:
                    MeasureTime.timeWorking(times, numElements);
                    System.out.println("Таблица времени изменена!");
                    break;
                case 12:
                    numElements = scanner.nextInt();
                    System.out.println("Количество повторений изменено!");
                    MeasureTime.timeWorking(times, numElements);
                    System.out.println("Таблица времени изменена!");
                    break;
                default:
                    System.out.println("До свидания!");
            }

        } while (x >= 0);
    }

    private static void print() {
        System.out.printf("%-9s %-3s %-15s %-15s %-15s%n", "Method", "|", "ArrayList", "LinkedList", "Repeats");
        System.out.println("__________|___________________________________________");
    }
}
