
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author resekol
 */
public class Question14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman Sayisi");
        int a = input.nextInt();
        System.out.println("Kombinasyon");
        int b = input.nextInt();
        int c = 1 ;
        int d = 1 ;
        int f = 1 ;
        for (int i = 1; i <= a; i++) {
            c = c*i; 
        }
        for (int i = 1; i <= b; i++) {
            d = d*i;
        }
        for (int i = 1; i <= a-b; i++) {
            f = f*i;
        }
        int k = c/d*f;
        System.out.println(k); 
    }
    
}
