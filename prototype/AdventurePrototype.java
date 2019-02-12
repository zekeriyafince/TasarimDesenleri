
package prototype;

/**
 *
 * @author Zekeriya
 */
//Prototype
public abstract class AdventurePrototype implements Cloneable{
    
    
    @Override
    public AdventurePrototype clone() throws CloneNotSupportedException {
        AdventurePrototype advPrototype = null;
        try {
            advPrototype = (AdventurePrototype)super.clone();
        } catch (Exception e) {
        }
        return advPrototype;
    }
    
    
}
