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
public class Question15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi");
        int a = input.nextInt();
        int b = 0 ;
        b = (a*a) +3 -5*a ;
        if (b>1) {
            System.out.println("1");
            
        }
        else if (b==0) {
            System.out.println("0")
                    ;
            
        }
        else
            System.out.println("-1");
    }
    
}
