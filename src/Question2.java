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
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Derece:");
        double a = input.nextDouble();
        double c = a/180 ;
        double b = a/200 ;
        System.out.println ("Gradian: "+b);
        System.out.println ("Radian: "+c);
        
    }
    
}
