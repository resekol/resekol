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
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Kenar Uzunluğu:");
        double a = input.nextDouble () ;
        System.out.println("Yükseklik:");
        double b = input.nextDouble () ;
        double c = a*b/2 ;
        System.out.println ("Alan: "+c);
        
        
    }
    
}
