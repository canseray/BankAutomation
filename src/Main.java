public class Main {
    public static void main(String[] args) {
   
    ATM atm = new ATM();
    
    Hesap hesap = new Hesap("canseray tufan", "canbek88",1000000);
    
    atm.calis(hesap);
        System.out.println("Programdan çıkılıyor");
}
    
}
