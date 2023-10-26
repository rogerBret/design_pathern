
public class ProduitFactory {
    public final int TYPE_PRODUIT_1 = 1;
    public final int TYPE_PRODUIT_2 = 2;
    public final int TYPE_PRODUIT_3 = 3;
    
    public ProduitA getProduitA(int typeProduit){

        ProduitA produitA = null;

        
        switch (typeProduit){
            case TYPE_PRODUIT_1:
                produitA = new ProduitA1();
                break;
            case TYPE_PRODUIT_2:
                produitA = new ProduitA2();
                break;
            case TYPE_PRODUIT_3:
                produitA = new ProduitA3();
                break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
        return produitA;
    } 
}