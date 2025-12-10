/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cd.premiertest;

/**
 *
 * @author darkside
 */
public class PremierTest {
    public static void meth(int x){
            x=10;
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        meth(a);
        System.out.println(a);
        PremiereClasse premierObjet = new PremiereClasse();
        premierObjet.math1(5);
        System.out.println(premierObjet.att1);
    }
}