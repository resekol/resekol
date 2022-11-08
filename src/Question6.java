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
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı:");
        int a = input.nextInt();
        if (a>0) {
            System.out.println("Pozitif");
            
        }
        else if (a<0) {
            System.out.println("Negatif");
                }
        else {
             System.out.println("Sıfır");
    }
                }
    }
    
