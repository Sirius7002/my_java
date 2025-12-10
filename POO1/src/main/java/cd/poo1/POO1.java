/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cd.poo1;
class compte{
    int solde;
    void creation(int c){
        solde = c;
    }
    void depot(int a){
        solde = solde + a;
    }
    void retrait(int b){
        solde = solde - b;
    }
}
public class POO1 {

    public static void main(String[] args) {
        compte alan = new compte();
        alan.creation(10000);
        alan.depot(1000);
        System.out.println(alan.solde);
        alan.retrait(2500);
        System.out.println(alan.solde);
    }
}
