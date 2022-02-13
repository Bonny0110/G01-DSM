/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g01.e1;
import java.util.Scanner;

/**
 *
 * @author EBONY
 */
public class G01E1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2;
        
        Scanner ingresar = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("        NÚMEROS DIVISIBLES         ");
        System.out.println("***********************************");
        
        System.out.println("Por favor ingrese el primer número:");
        n1 = ingresar.nextInt();
        System.out.println("Por favor ingrese el segundo número:");
        n2 = ingresar.nextInt();
        
        System.out.println("********* RESULTADO ****************");
        if(n1 % n2 == 0)
        {
            System.out.println(" " + n1 + " es dvisible entre " + n2);
        }
        else
        {
            System.out.println(" " + n1 + " no es divisible entre " + n2);
        }
        
        ingresar.close();
    }
    
}
