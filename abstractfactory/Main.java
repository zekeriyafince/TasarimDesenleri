
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
public class Main {
    /*
    * Abstract Factory(Soyut Fabrika)
    *  İstemci ihtiyacı olan ve birbirleri aralarında iliskileri bulan
    nesnelerin üretiminden sorumlu olan soyut fabrikalarin tasarlanmasini 
    saglar. İstemciler üretilecek nesnelerin tiplerine gore farklı
    fabrikalari secip kullanabilirler. Bu nesneler ve iliskiler abstract
    seviyede gerceklestirilerek client'dan soyutlanmıstır. 
    *  Ozetle, birbirleriyle ilişkili yada birbirlerine bağlı olan 
    nesnelerin oluşturulmasını en etkin bir şekilde çözmeyi hedefler. 
    *  "Abstract Factory" deseninin ana teması belirli sınıfların içerdiği 
    ortak arayüzü soyut bir sınıf yada arayüz olarak tasarlamaktır. 
    Böylece nesneleri üreten sınıf, hangi nesnenin üretileceği ile pek 
    fazla ilgilinmesi gerekmez. İlgilenmesi gereken nokta oluşturacağı 
    nesnenin hangi arayüzleri desteklediği yada uyguladığıdır. Bahsi geçen 
    mekanizmalarla deseni oluşturduğumuz anda çalışma zamanında hangi 
    nesnenin oluşturulması gerektiğini bilmeden nesnelerin oluşturulmasını 
    yönetebiliriz. 
    *
    * UML diyagram icin
    * Product lar olarak Connection ve Command abstract sınıflar tanımlansın
    * ConcreateProduct olarak;(asıl urunler)
    Connection icin, SqlConn ve OracleConn sınıfları tanımlansın
    Command sınıfı icinde SqlComm ve OracleComm tanımlansın
    * Database adında Factory sınıf tanımlanır.Bundan tureyen
    SqlDatabase sınıfı
    OracleDatabase sınıfı tanımlanır
    * Genel olarak, 
    SqlDatabase, SqlConnection ve SqlCommand sınıflari kullanır
    OracleDatabase ise InterbaseConn ve InterbaseCommand kullanır
    * Client'in baglanacagı bir de application sınıf tanımlanır. Bu sınıfda
    DatabaseFactory , Command ve Connection sınıfları kullanarak calisir.
    *
    */
    public static void main(String[] args) {
        /**/
        
        Factory factory = new Factory(new OracleFactory());
        factory.Start();
        
        System.out.println("----");
        
        Factory factory2 = new Factory(new SqlFactory());
        factory2.Start();
    }
}
