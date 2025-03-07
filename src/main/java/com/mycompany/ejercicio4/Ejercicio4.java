//Mairon Omar Licona Duarte
//201810010200
//Crear un arrelo que guarde e imprima 10 nombres de tus compañeros de la clase

package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el nombre:  " );
            nombres[i] = scanner.nextLine();
        }
        
        System.out.println("Lista de los nombres ingresados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        scanner.close();
    }
}
