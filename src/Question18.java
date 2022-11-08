/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author resekol
 */
public class Question18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int s ;
        do {
            System.out.println("7'den büyük gir");
            s = input.nextInt();

            
        } while (s <= 7);
        for (int i = 0; i<=s/3 ; i++) 
        {
            for (int j = 0; j<=s/5; j++) 
            {
                if (3*i + 5*j == s) {
                    System.out.println(i+ " " +j);
                    
                }
                
            }
            
        }
    }
    
}
