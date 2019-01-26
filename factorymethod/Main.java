
package factorymethod;

/**
 *
 * @author Zekeriya
 */
public class Main {
    
    /*
        Kalıtımsal iliskili olan (nesne)urunlerin uretilmesi icin kullanılır
        Factory metod'un gorevi client'in istegi olan urunlerin olusturulması
        saglar
        
        
        1.yontem
          Genel sınıf abstract veya interface olan bir sınıf olacak(PRODUCT)
          Genel sınıfdan tureyen ve fonksiyonların override edilen alt sınıflar olacak(productA,productB vb.)
          Client sınıfı ve client'in urunlere erisebilmesi icin factory metodun bulunması gereken Creator sınıfı tanımlan
          Creator sınıfında FactoryMethod var ki metod genel sınıf olan(PRODUCT) tipinden deger dondursun
        2. yontem
          1. yonteme ek creator genel sınıfını product alt sınıflarinin her biri icin sınıf tanımlanmasıdır
          Her urun icin ayrı ayrı creator sınıfları soz konusu. Bu sınıflardaki factory metod kullanılarak
          urunler olusturuluyor.
    */
              
    public static void main(String[] args) {
        
       
        
        Creator cre = new CreaterWinScreen();
        Screen sc = cre.ScreenFactoryMethod();
        sc.Draw();
        
        
    }
    
}
