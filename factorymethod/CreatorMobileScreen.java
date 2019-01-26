
package factorymethod;

/**
 *
 * @author Zekeriya
 */
public class CreatorMobileScreen implements Creator{

    @Override
    public Screen ScreenFactoryMethod() {
        return new MobileScreen();
    }
    
}
