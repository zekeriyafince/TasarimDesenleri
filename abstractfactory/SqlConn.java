
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public class SqlConn extends Connection{

    @Override
    public boolean Connect() {
        System.out.println("Sql baglantisi acilacak");
        return true;
    }

    @Override
    public boolean DisConnect() {
        System.out.println("Sql baglantisi kapatilacak");
        return true;
    }

    @Override
    public String State() {
        return "Open";
    }
    
}
