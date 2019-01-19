
package singleton;

/**
 *
 * @author Zekeriya
 */
public class Main {
    /*
     * Sıngleton Design Pattern 
     * AMAC: Bir nesnenin calisma zamanında tek olmasını istemek
     * Bir sınıfının instance orneginin tek olmasını istemektir.
     * Bunun icinde Constructor metodu private tanımlanmalıdır.Boylece diger sınıflardan
    new operatoru ile nesne ornegi yaratamayacak.
     * Bundan sonra mecburen nesne uretilmesini kendi icinde uretmesi lazım.
     * Uretilen instance dısarıya Singleton tipinde public static bir metod ile verilir.
     * 
    */
    public static void main(String[] args) {
        for(int i=0;i<3;i++) {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.getDeger());
        }
        
    }
    
    
    
}

