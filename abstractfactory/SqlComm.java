
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public class SqlComm extends Command{

    @Override
    public void Execute(String query) {
        System.out.println("Sql sorgusu calistirildi.");
    }
    
}
