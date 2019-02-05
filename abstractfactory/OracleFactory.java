
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public class OracleFactory extends DatabaseFactory{

    @Override
    public Connection CreateConnection() {
        return new OracleConn();
    }

    @Override
    public Command CreateCommand() {
        return new OracleComm();
    }
    
}
