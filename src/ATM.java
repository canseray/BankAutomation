
import java.util.Scanner;

public class ATM {
    
    public void calis(Hesap hesap){
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgeldiniz");
        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*****************************");
        
        int giris_hakki = 3;
        
        while(true){
            
            if (login.login(hesap)){                                //logi objemın ıcındekı logın metodu.atmye gonferdıgım
                
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                System.out.println("Giriş başarısız");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı:"+giris_hakki);
            }
            
            if (giris_hakki == 0){
                System.out.println("Giriş hakkınız bitti");
                return;
            }  //yanlıs giris yaparsa metot sonlanıcak dogru giris yaparsa while sonlanıcak
        }
        
        
        //giriş yağtıktan sonrası aşağıdakiler
        
        System.out.println("*************************");
        String islemler = "1.Bakiye görüntüle\n"
                        + "2.Para yatır\n"
                        + "3.Para çek\n"
                        + "Çıkış q";
        System.out.println(islemler);
        System.out.println("**************************");
        
        
        while(true){
            
            System.out.println("İşlemi seçiniz");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                break;
            }
            
            else if(islem.equals("1")){
                System.out.println(hesap.getBakiye());
            }
            
            else if (islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                hesap.paraYatir(tutar);
               
            }
            
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                hesap.paraCek(tutar);
            }
            
            else{
                System.out.println("Hatalı işlem girişi");
            }
        }
        
        
    }
    
}
