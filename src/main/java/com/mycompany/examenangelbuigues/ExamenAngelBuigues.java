/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenangelbuigues;

/**
 *
 * @author angbuiand
 */

import java.util.Scanner;

public class ExamenAngelBuigues {

    public static void main(String[] args) {
        double numero1 = 56;
        double numero2 = 25;
        String cadena = "Hola";
        double numero2222222222222 = 25;
        int numero4 = 4;
        char numero5 = 5;
        Scanner sc = new Scanner(System.in);

        if(numero1 > 5 & numero2 > 5){
            System.out.println("El número 1 y el número 2 son mayores de 5");
        }   
        else if(numero1 > 5 | numero2 > 5){
            System.out.println("El número 1 ó el número 2 es mayor de 5");
        } else if (numero1 != numero2){
            System.out.println("El número 1 no es igual que el número 2");
        }
        else
        {
            System.out.println("El número 1 no es igual que el número 2");
        }

        
        System.out.println("Introduce el número del dia de la semana, siendo 1 el Lunes, y 5 el Viernes");
        int dia = sc.nextInt();
        String diaString;

        // Arrégalo para que la lógica de mostrar el día sea correcta y dependa de la variable día
        switch(dia){
            case 1:
                diaString = "Lunes";
                break;
            case 2:
                diaString = "Martes";
                break;
            case 3:
                diaString = "Miércoles";
                break;
            case 4:
                diaString = "Jueves";
                break;
            case 5:
                diaString = "Viernes";
                break;
            case 6:
                diaString = "Sábado";
                break;
            case 7:
                diaString = "Domingo";
                break;
            default:
                diaString = "Día incorrecto";
        }
        System.out.println(diaString);

        // Uso de bucles
        
        System.out.println("Introduce el número de repeticiones que quieres realizar");
        int numRepeticiones = sc.nextInt();

        for(int i = 1; i <= numRepeticiones; i++) {
            System.out.println("Dentro de un bucle for");
        }

        int i = 1;
        while(i < 10){
            System.out.println("Dentro de un bucle while");
            i++;
        }

        // Usa las funciones de la clase String adecuadas para...
        String mensaje = "Hola Mundo en Java!";
        String mensaje2 = "Mi primer programa.";

        System.out.println("Longitud del mensaje: " + mensaje.length());
        System.out.println("Comparar dos cadenas " + (mensaje.compareTo(mensaje2)));
        System.out.println("Pasar toda la cadena a minúsculas: " + mensaje.toLowerCase());
        // Cambia la concatenación de las cadenas que se muestran a continuacoón para utilizar una función de la clase String. El nombre es bastante descriptivo.
        System.out.println("Concatenar dos cadenas " + mensaje.concat(mensaje2));

        System.out.println("Introduce la base de la potencia");
        double base = sc.nextDouble();
        System.out.println("Introduce el exponente de la potencia");
        double exponente = sc.nextDouble();

        calcularLaPotencia(base, exponente);
    }

    // Método para calcular la potencia de dos números
    public static double calcularLaPotencia(double a, double b) {
        // La función para calcular la potencia es Math.pow(), eso no debes cambiarlo.
        return Math.pow(a, b);
    }
}