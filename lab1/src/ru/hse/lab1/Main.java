package ru.hse.lab1;
/**
 * Класс для работы с классом Person
 * @author OlyaSchulpina
 * @version 1.0
 * @since 2026
 */
import ru.hse.lab1.second.Person;

public class Main {
    /**
     * Главный метод программы
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Person person = new Person("Иван", 20);
        System.out.println("Имя: "+ person.name);
        System.out.println("Возраст: " + person.age);
    }
}