/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g01e3;

/**
 *
 * @author EBONY
 */

import java.util.Scanner;

public class G01E3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        
        int n;
        int pares = 0, impares = 0;
        
        System.out.println("*********************************");
        System.out.println("     NÚMEROS PARES E IMPARES     ");
        System.out.println("*********************************");
        
        System.out.println("Cantidad de números a ingresar:");
        n = ingresar.nextInt();
        
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Ingrese el número " +(i+1));
            if(ingresar.nextInt() % 2 == 0 )
            {
                pares++;
            }
            else
            {
                impares++;
            }           
        }
        
        System.out.println("******** RESULTADOS *************");
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        ingresar.close();
    }
    
}
