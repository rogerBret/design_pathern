public class ProduitFactoryA2 extends ProduitFactory {
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}
