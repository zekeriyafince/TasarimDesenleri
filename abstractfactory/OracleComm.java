
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public class OracleComm extends Command{
    @Override
    public void Execute(String query) {
        System.out.println("Oracle sorgusu calistirildi.");
    }
}
