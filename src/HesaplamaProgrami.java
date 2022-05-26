import java.util.Scanner;

public class HesaplamaProgrami {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner (System.in);

        System.out.print("Matematik Notunuzu Giriniz: " );
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6;
        System.out.print("Ortalamanız:"+sonuc);

        boolean kosul1 = sonuc >= 60;

        String str = kosul1 ? "Sınıfı Geçti" :"Sınıfta Kaldı";
        System.out.print(str);







    }



}
