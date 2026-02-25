package ru.hse.lab1.second;
/**
 * Класс для человека
 * @author OlyaSchulpina
 * @version 1.0
 * @since 2026
 */
public class Person {
    public String name;
    public int age;
    /**
     * Конструктор класса Person
     * @param name имя человека
     * @param age возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}