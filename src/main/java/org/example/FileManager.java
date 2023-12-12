package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class FileManager {

    private static String random = UUID.randomUUID().toString();
    private static String className = FileManager.class.getName();

    public static String getRandom() {
        return random;
    }

    public static String getClassName() {
        return className;
    }

    public static void writeToFile(Serializable object) {

        try (OutputStream fileOutputStream = new FileOutputStream(className + "_" + random, true);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void readFromFile(String fileName) {
        try (InputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            try {
                Car car = (Car) objectInputStream.readObject();
                System.out.println(car);
            } catch (ClassCastException ex) {
                System.out.println("Данные в файле некорректны.");
            } catch (ClassNotFoundException e) {
                e.printStackTrace(System.out);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Файла с таким именем не найдено!");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        try {
            Files.delete(Path.of(fileName));
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
