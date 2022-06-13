package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //Создали список автомобилей
        ArrayList<Car> auto_1 = new ArrayList<>();

        //Добавили в список автомобили
        auto_1.add(new Car("Kamaz", "А 652 ХМ", 480, 2015, 5000, 4));
        auto_1.add(new Car("Volvo", "Е 155 ТТ", 600, 2013, 6500, 3));
        auto_1.add(new Car("Мaz", "О 777 НН", 320, 2021, 4500, 12));
        auto_1.add(new Car("Hundai", "H 007 ММ", 250, 2021, 3000, 8));

        //вывод данных автомобилей на экран
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tИнформация об автомобилях:");
        for (Car item : auto_1) {
            System.out.print(item);
        }
        System.out.println();

        Collections.sort(auto_1); //сортировка автомобилей по мощности
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tСортировка Авто по мощности:");
        //вывод отсортитрованных авто на экран
        for (Car item : auto_1) {
            System.out.print(item);
        }
        System.out.println();

        //TreeSet автомобилей, упорядочивающий объекты по году выпуска.
        // Автомобили с одинаковым годом выпуска упорядочиваются по мощности.
        //Создали TreeSet автомобилей
        TreeSet<Car> auto_2 = new TreeSet<>(new Car.ComparatorCar());

        //Добавили в TreeSet автомобили
        auto_2.add(new Car("Kamaz", "А 652 ХМ", 480, 2015, 5000, 4));
        auto_2.add(new Car("Volvo", "Е 155 ТТ", 600, 2013, 6500, 3));
        auto_2.add(new Car("Мaz", "О 777 НН", 320, 2021, 4500, 12));
        auto_2.add(new Car("Hundai", "H 007 ММ", 250, 2021, 3000, 8));

        System.out.println("\t\t\t\t\t\t\t\t\tTreeSet автомобилей, упорядочивающий объекты по году выпуска.");
        System.out.println("\t\t\t\t\t\t\t\t\tАвтомобили с одинаковым годом выпуска упорядочиваются по мощности:");
        //вывод данных автомобилей на экран
        for (Car item : auto_2) {
            System.out.print(item);
        }
        System.out.println();

        //PriorityQueue очередь автомобилей на основе года выпуска.
        //Создали PriorityQueue очередь автомобилей
        PriorityQueue<Car> auto_3 = new PriorityQueue<>(4, new Car.ComparatorCar());

        //Добавили в PriorityQueue автомобили
        auto_3.add(new Car("Kamaz", "А 652 ХМ", 480, 2015, 5000, 4));
        auto_3.add(new Car("Volvo", "Е 155 ТТ", 600, 2013, 6500, 3));
        auto_3.add(new Car("Мaz", "О 777 НН", 320, 2021, 4500, 12));
        auto_3.add(new Car("Hundai", "H 007 ММ", 250, 2021, 3000, 8));

        System.out.println("\t\t\t\t\t\t\t\t\t\t\tPriorityQueue автомобилей на основе года выпуска:");
        //вывод данных автомобилей на экран
        for (Car item : auto_3) {
            System.out.print(item);
        }
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t\t\tОчередь автомобилей в случайном порядке :");
        //Создали PriorityQueue очередь автомобилей
        PriorityQueue<Car> auto_4 = new PriorityQueue<>();

        //Добавили в PriorityQueue автомобили в случайном порядке
        auto_4.add(new Car("Hundai", "H 007 ММ", 250, 2021, 3000, 8));
        auto_4.add(new Car("Kamaz", "А 652 ХМ", 480, 2015, 5000, 4));
        auto_4.add(new Car("Volvo", "Е 155 ТТ", 600, 2013, 6500, 3));
        auto_4.add(new Car("Мaz", "О 777 НН", 320, 2021, 4500, 12));

        //вывод данных автомобилей на экран
        for (Car item : auto_4) {
            System.out.print(item);
        }
        System.out.println();

        System.out.println("\t\t\t\t\t\t\t\t\t\tПоследовательное  извлечение автомобилей из очереди. :");
        // Последовательное  извлечение автомобилей из очереди
        int count = auto_4.size();
        for (int i = 0; i < count; i++) {
            //выводит элемент
            Car item = auto_4.element();
            //извлекает элемент
            auto_4.remove();
            //вывод элемента
            System.out.print("Car № " + (i + 1) + ": " + item);
        }

    }//main

}//class close
