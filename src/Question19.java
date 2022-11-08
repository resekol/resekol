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

public class Question19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi");
        int a = input.nextInt();
        for (int i = -a; i <= a; i++) {
            for (int j = -a; j <= a; j++) {
                if ((j * j) + (i * i) == a) {
                    System.out.println(i + " " + j);
                }
            }

        }

    }

}
