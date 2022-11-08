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
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Kütle:");
        double m = input.nextDouble () ;
        System.out.println("Hız:");
        double v = input.nextDouble();
        System.out.println("Yerden Yüksekliği:");
        double h = input.nextDouble ();
        double d = (m*v*v)/2 ;
        double f = m*10*h ;
        System.out.println("Kinetik Enerji:"+d);
        System.out.println("Potansiyel Enerji:"+f);
        
        
    }
    
}
