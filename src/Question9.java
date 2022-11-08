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
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("n");
        int a = input.nextInt();
        int toplam = 0 ;
        if (a%2==0) {
            a = a-1;
            
        
        while (a>=1)
        {
            toplam = a + toplam ;
            a = a-2;
        }
        }
            System.out.println(toplam);
            
    }
    
}
