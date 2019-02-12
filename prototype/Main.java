
package prototype;


/**
 *
 * @author Zekeriya
 */
public class Main  {
    
    /*
    * new operatoru ile nesnelerin olusturulması maliyetli durumlarda kullanılır.
    * Nesnenin ilk olusma anında olusturup daha sonra olusturulmayacak
    * Maliyeti cok olan tipleri bir ust sınıfdan turetilsin.
    * Bu ust sınıf Prototype adıyla ve Prototype turunden yani kendisini donduren 
    * bir Clone isimli fonk olsun.
    * Dolayısıyla olusturulan tiplerden ConcretePrototypeA ve ConcretePrototypeB
    * sınıflarında fonk. ezilsin.
    * Client Prototype tipini kullanarak maliyetsiz tip olusturmay calisir.
    */
    public static void main(String[] args) throws CloneNotSupportedException{
        // list yapisini tutan sınıf
        Adventure adv = new Adventure();
        
        Product lcdTv = new Product(1000, "Vestel", 1000);
        adv.EntitiesList.add(lcdTv);
        
        Person bill =new Person("Bill");
        adv.EntitiesList.add(bill);
        
                
        adv.EntitiesList.add((Product)lcdTv.clone());
        adv.EntitiesList.add((Person)bill.clone());
        
        for (Object obj : adv.EntitiesList) {
            // tum nesnelerin hash kodlari farkli
            System.out.println(obj.getClass());
            System.out.println(obj.hashCode());
        }
    }
}
