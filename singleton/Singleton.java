/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Zekeriya
 */
public class Singleton {
    // Singleton sınıfından olusturulucak tek nesne static sınıf degiskeni
    // olarak tanımlanıyor
    private static Singleton instance = null;
    
    private static int idValue;
    // MultiThread uygulamalarda check locking için kullanılan nesne
    private static Object lock = new Object();

    // private Constructor ile dısardan nesne uretilmesi engellendi.
    private Singleton() {
        idValue++;
        
    }
    // Singleton sınıfından olusturulan tek nesneye ulasmak icin metod
    public  static Singleton getInstance() {
         if (instance == null) {
            // Multithread calismalarda kontrol icin
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
       
        return instance;
    }
    // Nesne id degeri dondurur.
    public int getDeger() {
        return idValue;
    }
    
    
}
