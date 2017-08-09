/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cramirez.numeromayor;

import java.util.Scanner;

/**
 *
 * @author cramirez
 */
public class ObtenerMayor {

    public void calcular() {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        num1 = 2;
        num2 = 3;
        num3 = 4;
        num4 = 6;
        num5 = 8;
        int mayor;
        int menor;
        mayor = num1;
        menor = num1;
        if (num2 > mayor) {
            mayor = num2;
        } else if (num2 < menor) {
            menor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        } else if (num3 < menor) {
            menor = num3;
        }
        if (num4 > mayor) {
            mayor = num4;
        } else if (num4 < menor) {
            menor = num4;
        }
        if (num5 > mayor) {
            mayor = num5;
        } else if (num5 < menor) {
            menor = num5;
        }
        print ("El numero mayor es: " + mayor);
    }

    private void print(String message) {
        System.out.println(message);
    }

}
