/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd.starter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author darkside
 */
public class exercice2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean saisieAge = false ;
        int age = 0;
        System.out.println("veuillez répondre à ces quelques questions");
        System.out.println("Quelle est votre nom?");
        System.out.print("Réponse: ");
        String nom = input.nextLine();
        while(saisieAge != true){
            try{
                System.out.println("Quel âge avez-vous?");
                System.out.print("Réponse: ");
                age = input.nextInt();
                saisieAge =  true;
            }catch(InputMismatchException e){
                System.out.println("Merci d'entrer un âge valide");
                input.nextLine();
            }
        }
        input.nextLine();
        System.out.println("Dans quelle ville vivez-vous?");
        System.out.print("Réponse: ");
        String ville = input.nextLine();
        
        System.out.println("Bonjour "+nom+", tu as "+age+"ans et tu vis à "+ville+".");
        input.close();
    }
}
