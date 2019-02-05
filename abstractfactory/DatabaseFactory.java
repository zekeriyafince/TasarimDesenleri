
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public abstract class DatabaseFactory {
    public abstract Connection CreateConnection();
    public abstract Command CreateCommand();
}
