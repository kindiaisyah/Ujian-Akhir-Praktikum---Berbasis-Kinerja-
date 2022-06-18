package hitungluas;

import java.io.*;
import java.util.*;

public class HitungLuas {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        if (choice == 1) { //persegi
            double sisi = scan.nextDouble();
            persegi(sisi);
        } else if (choice == 2) { //segitiga
            double alas = scan.nextDouble();
            double tinggi = scan.nextDouble();
            segitiga(alas, tinggi);
        } else if (choice == 3) { //lingkaran
            double r = scan.nextDouble();
            lingkaran(r);
        } else {
             System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    public static void persegi (double sisi) {
       int lp = (int) (sisi*sisi);
       System.out.println(lp);
    }
    public static void segitiga (double alas, double tinggi) {
       int ls = (int) ((alas*tinggi)/2);
        System.out.println(ls);
    }
   public static void lingkaran (double r) {
        double lg;
        if (r % 7 == 0) {
           lg = 22/7*r*r;
            System.out.println(lg);
        } else {
           lg = (int) (3.14*r*r);
            System.out.println(lg);
        }
   }
}