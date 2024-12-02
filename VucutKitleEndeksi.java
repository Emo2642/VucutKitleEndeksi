package Giris;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        double boy=input.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        double kilo=input.nextDouble();
        double endeks= kilo/(boy*boy);
        System.out.println("Endeksiniz : "+endeks);
    }
}
