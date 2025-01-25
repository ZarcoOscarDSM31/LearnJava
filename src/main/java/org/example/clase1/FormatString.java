package org.example.clase1;

public class FormatString {
    public static void main(String[] args) {
        String name = "Oscar";
        String age = "21";

        //Concatenación simple cadena de texto
        String message = "Mi nombre es " + name + " y tengo " + age + " años.";
        System.out.println(message);

        StringBuffer sb = new StringBuffer();
        sb.append("Hola ");
        sb.append(name);
        sb.append(" con tu edad actual ");
        sb.append(age);
        sb.append(", ya eres mayor de edad.");

        System.out.println(sb.toString());


        //String Format
        String defaultMessage = "Mi nombre es %s y tengo %s años.";
        String newMessage = String.format(defaultMessage, name, age);
        System.out.println(newMessage);
    }
}
