package org.example.clase1;

public class ElseIfStatement {
    public static void main(String[] args) {
        int age = 14;

        if (age >= 18) {
            System.out.println("Eres mayor de edad.");
        } else if (age >= 16) {
            System.out.println("Eres adolescente.");
        } else if (age >= 12) {
            System.out.println("Eres puberto.");
        } else {
            System.out.println("Eres un niño.");
        }
    }
}
