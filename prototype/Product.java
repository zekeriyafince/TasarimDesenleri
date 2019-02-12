
package prototype;

/**
 *
 * @author Zekeriya
 */
//ConcretePrototype
public class Product extends AdventurePrototype{
    public  int productId;
    public String name;
    public int listPrice;

    public Product(int productId, String name, int listPrice) {
        this.productId = productId;
        this.name = name;
        this.listPrice = listPrice;
    }

    
    
    
}
