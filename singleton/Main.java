
package singleton;

/**
 *
 * @author Zekeriya
 */
public class Main {
    /*
     * Sıngleton Design Pattern 
     * AMAC: Bir nesnenin calisma zamanında tek olmasını istemek
     * 
    */
    public static void main(String[] args) {
        for(int i=0;i<3;i++) {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.getDeger());
        }
        
    }
    
    
    
}

