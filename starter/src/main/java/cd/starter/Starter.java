/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cd.starter;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author darkside
 */
public class Starter {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int addition(int a, int b){
        return a+b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int multiplication(int a, int b){
        return a*b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int soustraction(int a, int b){
        return a-b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static double division(int a,int b){
        return (double)a/(double)b;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println("veuillez deux nombres pour les calculs.!");
        boolean saisie1 = false;
        boolean saisie2 = false;
        int nombre1=0,nombre2=0;
        Scanner Entrer = new Scanner(System.in);
        while(saisie1 != true){
            try{
                System.out.print("Nombre 1: ");
                nombre1 = Entrer.nextInt();
                saisie1 =true;
            }catch(InputMismatchException e){
                System.out.println("Veuillez entrer un nombre correct!!");
                Entrer.nextLine();
            }
        }
        while(saisie2 != true){
            try{
                System.out.print("Nombre 2: ");
                nombre2 = Entrer.nextInt();
                saisie2 =true;
            }catch(InputMismatchException e){
                System.out.println("Veuillez entrer un nombre correct!!");
                Entrer.nextLine();
            }
        }
        System.out.println("Addition: "+addition(nombre1,nombre2));
        System.out.println("Soustraction: "+soustraction(nombre1,nombre2));
        System.out.println("Multipication: "+multiplication(nombre1,nombre2));
        System.out.println("Division: "+division(nombre1,nombre2));
        Entrer.close();
    }
}