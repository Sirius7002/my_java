/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cd.tp1;

/**
 *
 * @author darkside
 */
public class Main {

    public static void main(String[] args) {
        
        //Création des deux objets
        Produit brosse = new Produit();
        Produit acide = new Produit("acide",15000,15);
        
        //Changement des valeurs
        brosse.setNom("Brosse");
        brosse.set(5000);
        brosse.setQuantite(25);
        
        //Premier affichage
        brosse.afficher();
        acide.afficher();
        
        //Changement des quantités
        brosse.retirerStock(2);
        acide.ajouterStock(56);
        brosse.ajouterStock(4);
        acide.retirerStock(65);
        
        //Nouvel affichage
        System.out.println(brosse.afficher());
        System.out.println(acide.afficher());
        
        //Nombre de catégorie de produits
        System.out.println("\n"+Produit.nbProduits);
    }
}
