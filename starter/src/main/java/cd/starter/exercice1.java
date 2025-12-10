/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd.starter;
import java.util.Scanner;

/**
 *
 * @author darkside
 */
class exercice1 {
     public static void main(String[] args){
        System.out.println("Salut");
        System.out.println("Peux-tu entrer tes notes??");
        Scanner input = new Scanner(System.in);
        System.out.print("Note1: ");
        double note1 = input.nextDouble();
        System.out.print("Note2: ");
        double note2 = input.nextDouble();
        System.out.print("Note3: ");
        double note3 = input.nextDouble();
        input.close();
        
        double moyenne = (note1 + note2 + note3)/3;
        System.out.print("La moyenne de ces 3 notes est: "+ moyenne);
     }
    
}
