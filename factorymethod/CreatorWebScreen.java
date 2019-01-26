
package factorymethod;

/**
 *
 * @author Zekeriya
 */
public class CreatorWebScreen implements Creator{

    @Override
    public Screen ScreenFactoryMethod() {
        return new WebScreen();
    }
    
}
