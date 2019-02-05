# TasarimDesenleri
Tasarım desenleri konusu hakkında kaynak oluşturma amaçlı kod örneklerin yer alacağı projedir.
> Merhaba, bu repo tasarım desenlerini öğrenmek isteyen arkadaşlara bu konu da yazılmış örnek kodların yer alacağı Türkçe kaynak oluşturma amaçlı hazırlanmıştır. Sizlerde katkıda bulunarak tasarım deseni öğretilmesine yardımcı olabilirsiniz.

Tasarım Desenleri kategorileri ve kodları aşağıdadır.

#### Singleton(Tekillik) Tasarım Deseni
- **AMAC:** Bir nesnenin calisma zamanında tek olmasını istemektir. Bunun için;
  1) Constructor metodu "private" tanımlanmalıdır ki boylece diger sınıflardan
    new operatoru ile nesne ornegi yaratılmasın. Bunun sonucunda nesne üretilme 
    işi instance, kendi sınıf içerisinde yapılmalıdır.
  2) Uretilen instance dısarıya Singleton tipinde "public static" bir metod ile verilir.
- **Kullanım Ornekleri**
  1) [Java Kod](https://github.com/zekeriyafince/TasarimDesenleri/tree/master/singleton)
  
#### Factory Method(Fabrika Yordam) Tasarım Deseni
- **AMAC:** Kalıtımsal iliskili olan (nesne)urunlerin uretilmesi icin kullanılır. 
   Factory metod'un gorevi client'in istegi olan urunlerin olusturulmasını
   saglar.
- Factory Method'un kullanılmasında 2 yöntem vardır:
   1) Tek class icindeki factory metod yardımıyla ilgili sınıfların ürünlerin uretilmesi
      sağlanır.
   2) Her urun icin ayrı sınıf tanımlanmasi ile urunleri üretilmesi sağlanır.
  
- **Kullanım Ornekleri**
  1) [Java Kod](https://github.com/zekeriyafince/TasarimDesenleri/tree/master/factorymethod)
  
#### Abstract Factory(Soyut Fabrika) Tasarım Deseni
- **AMAC:** Birbirleriyle ilgili ya da bağımlı nesne ailelerini, nesnelerin somut sınıflarını 
   belirtmeden yaratmak için bir arayüz sağlamak. 

[Factory Method](https://github.com/zekeriyafince/TasarimDesenleri#factory-methodfabrika-yordam-tasar%C4%B1m-deseni)’da 
tek bir ürün ailesine ait tek bir arayüz mevcutken,Abstract Factory’de farklı ürün aileleri 
için farklı arayüzler mevcuttur.
- Abstract Factory'nin kullanılmasındaki yöntem :
   1) İstemci ihtiyacı olan ve birbirleri aralarında iliskileri bulan
    nesnelerin üretiminden sorumlu olan soyut fabrikalarin tasarlanmasini 
    saglar. İstemciler üretilecek nesnelerin tiplerine gore farklı
    fabrikalari secip kullanabilirler. Bu nesneler ve iliskiler abstract
    seviyede gerceklestirilerek client'dan soyutlanmıstır.
    
- **Kullanım Ornekleri**
  1) [Java Kod](https://github.com/zekeriyafince/TasarimDesenleri/tree/master/abstractfactory)



        
