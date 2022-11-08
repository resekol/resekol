
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
public class Question16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Metre");
        double a = input.nextInt();
        System.out.println("mm=0 cm=1 dm=2 km=3 giriniz");
        double b = input.nextInt();
        if (b==0) {
            double mm = 1000*a;
            System.out.println("Kaç Metre");
        }
        else if (b==1) {
            double cm = 100 * a ;
            System.out.println(cm);
        }
        else if (b==2) {
            double dm = 10*a;
            System.out.println(dm);
        }
        else if (b==3) {
            double km = a/1000;
            System.out.println(km);
        }
    }
    
}
