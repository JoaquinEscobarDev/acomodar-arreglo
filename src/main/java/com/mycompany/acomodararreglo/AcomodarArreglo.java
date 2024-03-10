/*
leer por teclado dos tablas de 10 numeros enteros y mezclar en un tercero de la forma
1a,1b,2a,2b,3a,3b,etc
 */
package com.mycompany.acomodararreglo;

import java.util.Scanner;

public class AcomodarArreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[], b[], c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Digite el primer arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.println("\nDigite el segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            b[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i]; // 1 a
            j++;
            c[j] = b[i]; // 1 b
            j++;

        }

        System.out.println("\nEl tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("[" + c[i] + "] ");
            if (i % 2 == 1) {
               // Imprimir un salto de línea después de cada par de elementos para una mejor legibilidad
                System.out.println();
            }
        }
        System.out.println();
    }
}
