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
public class Question11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("n");
        int a = input.nextInt();
        int c = 0 ;
        while (a!=0)
        {
            int b = a*a;
            c = c+b;
            a = a-1;
        }
            System.out.println(c);
    }
    
}
