
package factorymethod;

/**
 *
 * @author Zekeriya
 */
public class CreaterWinScreen implements Creator{

    @Override
    public Screen ScreenFactoryMethod() {
        return new WinScreen();
    }
    
}
