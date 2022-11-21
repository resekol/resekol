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
public class Question21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
            {
                b++;
                
            }
                    
        }
        if (b == 2)
        {
            a=a+2;
            int c = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    c++;
                    
                }
            }
            if (c == 2) {
                System.out.println("Chen");
            }
        }
        }
    }
    

