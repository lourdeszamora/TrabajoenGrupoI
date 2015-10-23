
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lourdes Zamora
 */
public class Numeros {
    
    private int num[];
    
  
    
    public Numeros(int n){
    
        num=new int[n];
    
    } 
    public int[] getNum(){
    
        return this.num;
    }
    public void  llenar(int h){
        
        Scanner sc=new Scanner(System.in);
        if(h<num.length){
        
            num[h]=sc.nextInt();
            llenar(h+1);
        }
    }
    public int Maximo(int cont,int max){
        
        if(cont<num.length){
            if(num[cont]<max){
                
                return Maximo(cont+1,max);
                
            }
            return Maximo(cont+1,num[cont]);
        }
        return max;
       
    }
    
    //h comienza en 0
    public void print(int h){
        if(h<num.length){
            System.out.println(num[h]);
            print(h+1);
        }
    }
    public int divisor(int h, int cont){
        if(cont<num.length){
            if(num[cont]%h==0){
               return 1+divisor(h,cont+1);
               
            }
            return 0+divisor(h,cont+1);
        }
        return 0;
    }
    
    
}
