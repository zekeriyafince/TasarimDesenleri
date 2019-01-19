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
