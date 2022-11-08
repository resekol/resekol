
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
public class Question13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi");
        int a = input.nextInt();
        int b = 0 ;
        int c = 0 ;
        int d = 0 ;
        for (int i = 0; i <= a; i++) {
                b = b+i;
                if (i%2==0) {
                c =  c + i ;
            }
                if (i%2!=0) {
                d = d + i ;
                
            }
            }
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
        }
    }
    

