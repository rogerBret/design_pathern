public class Client{
    public static void main(String[] args) {
        ProduitFactory produitFactory1 = new ProduitFactoryA1();
        ProduitFactory produitFactory2 = new ProduitFactoryA2();
        ProduitFactory produitFactory3 = new ProduitFactoryA3();

        ProduitA produitA = null;

        System.out.println("utilisation de la premiere faprique");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("utilisation de la duxieme faprique");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();

        System.out.println("utilisation de la troisieme faprique");
        produitA = produitFactory3.getProduitA();
        produitA.methodeA();

        
    }
}