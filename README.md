# loginPageApp
 Kotlin kullanarak: Giriş sayfası, kayıt olma sayfası, şifremi unuttum sayfası ve uygulama ana sayfası tasarladığım proje. 

Giriş Sayfası:
Bu Kotlin dosyası, MainActivity sınıfını tanımlayarak uygulamanın giriş sayfasının işlevselliğini sağlar. Uygulama, kullanıcı arayüzü bileşenlerine ActivityMainBinding kullanarak erişim sağlar ve kenar çubuğu arayüzü ile uyumlu hale getirilir. Kullanıcıdan alınan e-posta ve şifre bilgileri, SharedPreferences aracılığıyla saklanan kayıtlı verilerle karşılaştırılır. Giriş başarılı olduğunda kullanıcı, ana sayfaya yönlendirilir; aksi takdirde bir hata mesajı görüntülenir. Ayrıca, kullanıcıların şifre sıfırlama işlemleri için gerekli olan "Şifreyi Unuttum" bağlantısı ve yeni hesap oluşturma işlemleri için yönlendiren bir bağlantı da bulunmaktadır. Sosyal medya ile giriş seçenekleri için simgeler eklenmiştir; her bir simgeye tıklandığında, ilgili sosyal medya hesabı ile giriş yapılacağına dair bir bilgi mesajı gösterilir. Bu yapı, kullanıcıların uygulamaya giriş yapmalarını kolaylaştırarak kullanıcı dostu bir deneyim sunmayı amaçlamaktadır.



Hesap Oluşturma Sayfası: 
Bu Kotlin dosyası, NewAccountActivity sınıfını tanımlayarak uygulamanın yeni hesap oluşturma sayfasının işlevselliğini sağlamaktadır. Uygulama, kullanıcı arayüzü bileşenlerine ActivityNewAccountBinding kullanarak erişim sağlar ve kenar çubuğu arayüzü ile uyumlu hale getirilir. Kullanıcıdan alınan kullanıcı adı, e-posta ve şifre bilgileri, formun altındaki "Kayıt Ol" butonuna tıklandığında kontrol edilir. Tüm alanlar doldurulmuşsa, bilgiler SharedPreferences aracılığıyla saklanır ve kullanıcıya "Kayıt Başarılı!" mesajı gösterilir. Eğer herhangi bir alan boş bırakılmışsa, kullanıcıya tüm alanları doldurması gerektiği bildirilir. Kullanıcı, "Zaten hesabınız var mı? Giriş Yap" metnine tıkladığında, önceki sayfaya geri dönme işlemi gerçekleştirilir. XML dosyası, tüm bileşenleri kapsayan bir NestedScrollView içinde, kullanıcı dostu bir arayüz sunmak amacıyla düzenlenmiştir. Bu yapı, yeni kullanıcıların kayıt işlemlerini kolaylaştırarak, uygulamanın genel kullanımını daha erişilebilir hale getirmeyi hedeflemektedir.



Şifremi Unuttum Sayfası: 
Bu Kotlin dosyası, NewPasswordActivity sınıfını tanımlayarak uygulamanın şifre sıfırlama sayfasının işlevselliğini sağlamaktadır. Kullanıcı arayüzü bileşenlerine ActivityNewPasswordBinding kullanılarak erişilir ve kenar çubuğu arayüzü ile uyumlu hale getirilir. Sayfa, kullanıcıdan e-posta adresini girmesini isteyen bir alan içerir. Ayrıca, şifre sıfırlama işlemi için bir buton ve geri dönmek için bir metin bağlantısı bulunmaktadır. Kullanıcı, "Şifreyi Sıfırla" butonuna tıkladığında, belirli bir işlevin gerçekleştirilmesi için gerekli kodun yazılması beklenir. "Geri dön" metnine tıklandığında ise kullanıcı, önceki giriş sayfasına dönebilir. XML dosyası, tüm bileşenleri kapsayan bir NestedScrollView içinde, kullanıcı dostu bir arayüz sunmak amacıyla düzenlenmiştir. Bu yapı, kullanıcıların şifrelerini sıfırlamalarını kolaylaştırarak, uygulamanın genel kullanımını daha erişilebilir hale getirmeyi hedeflemektedir.



Uygulama Ana Sayfası:
Bu Kotlin dosyası, HomePageActivity sınıfını tanımlayarak uygulamanın ana sayfasının işlevselliğini sağlar. Kullanıcı arayüzü bileşenlerine ActivityHomePageBinding kullanılarak erişilir ve kenar çubuğu arayüzü ile uyumlu hale getirilir. Sayfa, kullanıcıya hoş geldin mesajı ve uygulamanın sunduğu hizmetleri tanıtan bir açıklama metni içerir. Kullanıcının dikkatini çekmek için öne çıkan bir görsel de eklenmiştir. İki adet buton, kullanıcının hizmetler hakkında bilgi almasına ve iletişime geçmesine olanak tanır. Ayrıca, sosyal medya giriş seçeneklerini içeren bir alan bulunur; bu alanda Google, Facebook ve X simgeleri bulunmaktadır. Kullanıcı, "Çıkış Yap" butonuna tıkladığında, uygulama giriş sayfasına yönlendirilir. XML dosyası, tüm bileşenleri kapsayan bir NestedScrollView içinde, kullanıcı dostu bir arayüz sunmak amacıyla düzenlenmiştir. Bu yapı, kullanıcıların uygulamanın sunduğu hizmetlere kolay erişimini sağlarken, genel kullanıcı deneyimini iyileştirmeyi hedeflemektedir.


