package com.reflection.basiclevel;

import java.lang.reflect.*;
import java.util.Scanner;

public class GetClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();
        scanner.close();

        try {
            // Getting Class object
            Class<?> clazz = Class.forName(className);
            System.out.println("Class: " + clazz.getName());

            // Getting Constructors
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : clazz.getConstructors()) {
                System.out.println(constructor);
            }

            // Getting Fields
            System.out.println("\nFields:");
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                System.out.println(field);
            }

            // Getting Methods
            System.out.println("\nMethods:");
            for (Method method : clazz.getDeclaredMethods()) {
                method.setAccessible(true);
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}
