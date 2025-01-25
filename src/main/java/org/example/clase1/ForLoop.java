package org.example.clase1;

import javax.swing.*;
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        int loops = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos loops quieres?");
        loops = scanner.nextInt();

        for (int i = 0; i < loops; i++) {
            System.out.println("Loop: " + i);
        }
    }
}
