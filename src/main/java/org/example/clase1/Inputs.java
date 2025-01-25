package org.example.clase1;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String message =  "Hola %s, tu edad es: %s";
        System.out.println("Cual es tu nombre?");
        name = scanner.next();

        System.out.println("Cual es tu edad?");
        age = scanner.nextInt();

        scanner.close();
        String messageFinal = String.format(message, name, age);
        System.out.println(messageFinal);

    }
}
