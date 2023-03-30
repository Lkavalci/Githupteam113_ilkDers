package day1;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Lutfen yapmak istediginiz isli seciniz \n 1- Toplama \n 2- Cıkarma \n 3- Carpma \n 4- Bolme");
        Scanner scan = new Scanner(System.in);
        int islem;
        System.out.println("Secilen islem: ");
        islem = scan.nextInt();
        System.out.println("");
        System.out.println("ilk sayiyi giriniz: ");
        double sayi1, sayi2, sonuc;
        sayi1= scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz: ");
        sayi2=scan.nextDouble();
        switch (islem) {
            case 1:
                sonuc=sayi1+sayi2;
                System.out.println(" Toplama işlemi sonucu: "+ sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println("cıkarma işlemi sonucu: "+sonuc);
                break;
            case 3:
                sonuc=sayi1*sayi2;
                System.out.println("carpma islemi sonucu: "+ sonuc);
                break;
            case 4:
                sonuc=sayi1/sayi2;
                System.out.println("bolme islemi sonucu: "+sonuc);
                break;
            default:
                System.out.println("gecersiz islem girdiniz! ....");
        }
    }
}
