
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
// Product sınıf
public abstract class Connection {
    public abstract boolean Connect();
    public abstract boolean DisConnect();
    public abstract String State() ;
}
