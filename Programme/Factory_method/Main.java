import produits.ProduitA;

public class Main {
    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();
        
        ProduitA produitA = null;

       produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUIT_1);
       produitA.methodeA();

        System.out.println("Utilisation de la deuxieme fabrique");
        produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUIT_2);
        produitA.methodeA();

        System.out.println("Utilisation de la troisieme fabrique");
        produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUIT_3);
        produitA.methodeA();
    }
}