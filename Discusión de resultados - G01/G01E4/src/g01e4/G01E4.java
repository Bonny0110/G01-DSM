/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g01e4;

/**
 *
 * @author EBONY
 */

import java.util.Scanner;

public class G01E4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("    COORDENADAS EN PLANO CARTESIANO     ");
        System.out.println("****************************************");
        
        System.out.println("Cantidad de pares ordenados a clasificar:");
        int n = ingresar.nextInt();
        int x, y;
        int cuadrante1 = 0, cuadrante2 = 0, cuadrante3 = 0, cuadrante4= 0;
        
        for (int i = 0; i < n; i++) {
        {
            System.out.println("COORDENADA " + (i+1));
            
            System.out.println("Ingrese valor en x:");
            x = ingresar.nextInt();
            
            System.out.println("Ingrese vaor en y:");
            y = ingresar.nextInt();
            
            if (x > 0 && y > 0)
            {
                cuadrante1++;
            }
            else if(x < 0 && y > 0)
            {
                cuadrante2++;
            }
            else if(x < 0 && y < 0)
            {
                cuadrante3++;
            }
            else if(x > 0 && y <0)
            {
                cuadrante4++;
            }
        
        }
        
    }
            System.out.println("********************* RESULTADOS *******************************");
            System.out.println("Cantidad de pares ordenados en el primer cuadrante: " + cuadrante1);
            System.out.println("Cantidad de pares ordenados en el segundo cuadrante: " + cuadrante2);
            System.out.println("Cantidad de pares ordenados en el tercer cuadrante: " + cuadrante3);
            System.out.println("Cantidad de pares ordenados en el cuarto cuadrante: " + cuadrante4);
    }
}