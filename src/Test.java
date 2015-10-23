
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delia
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Numeros num =new Numeros(sc.nextInt());
       
        num.llenar( 0);
        num.print(0);
        System.out.println(num.Maximo(1));
        
    //System.out.println(num.Maximo(4, 0));
        
    }
}
