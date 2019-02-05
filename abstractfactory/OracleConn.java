
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public class OracleConn extends Connection{

    @Override
    public boolean Connect() {
        System.out.println("Oracle baglantisi acilacak");
        return true;
    }

    @Override
    public boolean DisConnect() {
        System.out.println("Oracle baglantisi kapatilacak");
        return true;
    }

    @Override
    public String State() {
        return "Open";
    }
    
}
