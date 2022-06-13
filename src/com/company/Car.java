package com.company;

import java.util.Comparator;

/**
 * Задание.
 * 1. Реализовать класс «Автомобиль». Автомобиль имеет гос номер, мощность л.с., год выпуска, грузоподъёмность,
 * кол-во пассажирских мест.
 * Сделать конструктор (конструкторы) с параметрами, toString и все прочие необходимые методы для данного класса.
 * 2. Для класса из п.1. выполнить задания:
 * •    Создать список автомобилей, вывести, отсортировать по мощности, вывести
 * •    Создать TreeSet автомобилей, упорядочивающий объекты по году выпуска. Автомобили с одинаковым годом выпуска
 * упорядочиваются по мощности.
 * •	Создать PriorityQueue автомобилей на основе года выпуска. Добавить в очередь автомобили в случайном порядке,
 * затем последовательно извлекать их из очереди и выводить.
 * В программе должны быть имплементации интерфейсов Comparable и Comparator – обязательно. Stream API, lambda,
 * анонимные классы использовать запрещено.
 */

// класс "Автомобиль"
public class Car implements Comparable<Car> {

    // поля класса "Автомобиль"
    private String name;  //название авто
    private String regNum;  //регистрационный номер
    private int power;   //мощность двигателя л.с.
    private int yearProduct;  //год выпуска автомобиля
    private double loadCapacity; //грузоподъёмность
    private int passengerCapacity; //кол-во пассажирских мест

    // конструкторы
    // 1. конструктор без параметров - по умолчанию
    public Car() {
        // инициализация полей по умолчанию
        name = " \"Car\"";
        regNum = "A 000 AA 54 RUS";
        power = 80;
        yearProduct = 1987;

    }

    // 2. конструктор с 6 параметрами
    public Car(String name, String regNum, int power, int yearProduct,
               double loadCapacity, int passengerCapacity) {
        this.name = name;
        this.regNum = regNum;
        this.power = power;
        this.yearProduct = yearProduct;
        this.loadCapacity = loadCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "Автомобиль " + name + ", год выпуска " + yearProduct + ", рег/номер " +
                regNum + ", мощность: " + power + " л.с., " + "грузоподъёмность " + loadCapacity +
                " кг., пассажировместимость " + passengerCapacity + " чел.\n";
    }

    // 2. метод compare - сравнивает автомобили по мощности
    @Override
    public int compareTo(Car auto) {
        //сравниваем авто по мощности power
        return Integer.compare(power, auto.power);
    }

    //класс компаратора
    public static class ComparatorCar implements Comparator<Car> {

        //метод сравнения по году выпуска, если год выпуска одинаковый, сравнивает по мощности
        @Override
        public int compare(Car auto_1, Car auto_2) {
            if (auto_1.yearProduct > auto_2.yearProduct) {

                return 1;
            } else if (auto_1.yearProduct < auto_2.yearProduct) {
                return -1;
            } else return Double.compare(auto_1.power, auto_2.power);
        }

    }//class ComparatorCar close

}//class Car close


