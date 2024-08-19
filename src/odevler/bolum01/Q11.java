package odevler.bolum01;

public class Q11 {
    public static void main(String[] args){
/*her 7 saniyede bir doğum
her 13 saniyede bir ölüm
her 45 saniyede bir yeni göçmen
şu an 312,032,486 kişi bulunmakta */
        int nufus = 312032486;
        int saniye = 365 * 24 * 60 * 60;
        int dogum = saniye / 7;
        int olum = saniye / 13;
        int gocmen = saniye / 45;
        int yeni_nufus = nufus + dogum + gocmen - olum;
        System.out.println("1.yil = "+yeni_nufus);
        System.out.println("2.yil = "+(nufus+yeni_nufus));
        System.out.println("3.yil = "+(2*nufus+yeni_nufus));
        System.out.println("4.yil = "+(3*nufus+yeni_nufus));
        System.out.println("5.yil = "+(4*nufus+yeni_nufus));
    }
}
