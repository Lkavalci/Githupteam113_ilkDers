package day1;

import java.util.Arrays;

public class week08 {
    public static void main(String[] args) {
        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
        int [] arr= {2,-5,-3,10,5,3,6,-15,20,35};
        System.out.println(arrardekipozitifSayilariTopla(arr));

    }

    public static int arrardekipozitifSayilariTopla(int[] arr) {
        int sonuc=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                sonuc+=arr[i];
            }

        }
        return sonuc;
    }
}
