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
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk Kenar");
        int a = input.nextInt();
        System.out.println("Ikinci Kenar");
        int b = input.nextInt();
        System.out.println("Ucuncu Kenar");
        int c = input.nextInt();
        if (a==b && a==c) {
            System.out.println("Eskenar");   
        }
        else if (a!=b && a!=c && b!=c){
            System.out.println("Çeşitkenar");         
        }
        else if (a==b && a!=c){
            System.out.println("Ikizkenar");
        }
        else if (a==c && a!=b){
            System.out.println("Ikizkenar");
        }
        else
            System.out.println("Ikizkenar");
            


            
    }
        
    }
    

