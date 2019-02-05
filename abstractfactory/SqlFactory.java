
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public class SqlFactory extends DatabaseFactory{

    @Override
    public Connection CreateConnection() {
        return new SqlConn();
    }

    @Override
    public Command CreateCommand() {
        return new SqlComm();
    }
    
}
