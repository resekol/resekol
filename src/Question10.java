/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author resekol
 */
import java.util.Scanner;
public class Question10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = 0 ;
        System.out.println("Ilk Sayi");
        int a = input.nextInt();
        System.out.println("Ikinci Sayi");
        int b = input.nextInt();
        
            
        
        while (b!=0){
             n = a + n ;
             b = b-1 ;       
        }
        System.out.println(n); 
        }  
    }
    

