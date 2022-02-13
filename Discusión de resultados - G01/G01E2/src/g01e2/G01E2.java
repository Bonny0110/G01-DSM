/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EBONY
 */

import java.util.Scanner;

public class G01E2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("        INGRESO DE NOTAS          ");
        System.out.println("**********************************");
        
        int[] notas = new int[10];
        int aprobados = 0;
        int reprobados = 0;
        
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Por favor ingrese la nota del alumno " + (i+1) + ":");
            notas[i] = ingresar.nextInt();
            if(notas[i] >= 7)
            {
                aprobados++;
            }
            else
            {
                reprobados++;
            }
        }
        
        System.out.println("**********************************");
        System.out.println("            RESULTADOS            ");
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos reprobados: " + reprobados);
        
        ingresar.close();
    }
    
}
