/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenangelbuigues;

/**
 *
 * @author angbuiand
 */
import java.util.Scanner;

public class SolucionEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        System.out.println("Este programa cuenta los espacios en blanco.");
        
        int numpalabras = 0;
        for(int i = 0;i < frase.length();i++){
            int f = frase.charAt(i);
            if(f != 0){
                numpalabras++;
            }
        }
        
        if(frase.length() == numpalabras){
            System.out.println("tu frase no tiene espacios en blanco.");
        }
        else if((frase.length() - numpalabras) == 1){
            System.out.println("tu frase tiene 1 espacios en blanco.");
        }
        else{
            System.out.println("tu frase tiene " + (frase.length() - numpalabras) + " espacios en blanco.");
        }
    }


    
}
