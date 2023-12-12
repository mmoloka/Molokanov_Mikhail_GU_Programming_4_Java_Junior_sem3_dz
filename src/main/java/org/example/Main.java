package org.example;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Написать класс с двумя методами:
 * 1. принимает объекты, имплементирующие интерфейс serializable, и сохраняющие их в файл.
 * Название файл - class.getName() + "_" + UUID.randomUUID().toString()
 * 2. принимает строку вида class.getName() + "_" + UUID.randomUUID().toString() и загружает объект из файла
 * и удаляет этот файл.
 * Что делать в ситуациях, когда файла нет или в нем лежит некорректные данные - подумать самостоятельно.
 */

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("WDC1668241A000001", "A001AA97", "obsidian black", 368);
        Car car2 = new Car("WDD2130421A000002", "O002OO97", "metallic", 214);

        //FileManager.writeToFile(car1);
        //FileManager.writeToFile("asdf");

        FileManager.writeToFile(car2);

        FileManager.readFromFile(FileManager.getClassName() + "_" + FileManager.getRandom());
    }
}