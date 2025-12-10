/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cd.tp1;

/**
 *
 * @author darkside
 */
public class Produit {
    
    //Définition de attributs d'instance
    
    //Nom et ses methodes
    private String nom;
    
    public String  getNom(){
       return this.nom  ;
    }
    public  void setNom(String S){
        this.nom  = S;
    }
    
    //Prix 
    private double prix;
    
    public double getPrix(){
       return this.prix;
    }
    public void set(double p){
        this.prix = p;
    }
    
    //Quantité d'instances
    private int quantite; 
    
    public int getQuantite(){
       return this.quantite;
    }
    public void setQuantite(int q){
        this.quantite = q;
    }
    
    //Définition des attributs de classe
    public static int nbProduits = 0;
    public static final double TVA = 0.18;
    
    //Définition des constructeurs
    Produit(String n,double p,int q){
        this.nom= n;
        this.prix = p;
        this.quantite = q; 
        nbProduits = nbProduits +1 ;
    }
    Produit(){
        this.nom = "";
        this.prix = 0.0;
        this.quantite = 0;
        nbProduits = nbProduits +1 ;
    }
    
    //Définition des méthodes principales
    public double calculerMontantTTC(){
        return this.prix * (1 + TVA);
    }  
    
    public void ajouterStock(int q){
        this.quantite = this.quantite + q;
    }
    
    public void retirerStock(int q){
        if(q<=this.quantite){
            this.quantite = this.quantite - q;
        }else if(this.quantite == 0){
            System.out.println("Il n'y a plus de produits");
        } else {
            System.out.println("Le nombre de produits est Insuffisant");
        }
    }
    
    public String afficher(){
        return "\nNom: "+this.nom+"\nPrix HT: "+this.prix + "\nPrix TTC: "+ this.calculerMontantTTC() +"\nQuantités de prodsuits disponibles: "+this.quantite;
    }
}
