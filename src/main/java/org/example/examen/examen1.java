package org.example.examen;
import java.util.Scanner;

public class examen1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número de ciclos requeridos");
        int numCiclos = scanner.nextInt();

        System.out.println("Imprimiendo el número de ciclos requeridos");

        for (int i = numCiclos; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        scanner.close();
    }
}



