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
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap:");
        double a = input.nextDouble ();
        double b = 4/3 * 3.14 * a*a*a ;
        double c = 4 * 3.14 * a*a ;
        System.out.println ("Hacim: "+b);
        System.out.println ("Yüzey Alanı: "+c);
        
        
    }
    
}
