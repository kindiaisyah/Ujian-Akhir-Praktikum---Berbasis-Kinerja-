package luas;

import java.io.*;
import java.util.*;

class Persegi {

   private double sisi;
        void luasPersegi (double sisi) {
            int luas = (int) (sisi*sisi);
            System.out.println(luas);
      }
  }
            class Segitiga {
    
               private double alas, tinggi;
                void luasSegitiga(double alas, double tinggi){
                    int luas = (int)((alas*tinggi)/2);
                    System.out.println(luas);
                }
            }
                class Lingkaran{
                    
                   private double r;
                    void luasLingkaran(double r){
           double luas;
                        if (r % 7 == 0) {
                            luas = 22/7*r*r;
                    } else {
                              luas =(int) (3.14*r*r);
                        }
                          System.out.println(luas);  
                        
                }
            }

public class Luas {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
       Persegi persegi = new Persegi ();
        Segitiga segitiga = new Segitiga ();
        Lingkaran lingkaran = new Lingkaran();
        
  
        int choice = scan.nextInt();  
        
    if (choice == 1) { 
            double sisi = scan.nextDouble();
            persegi.luasPersegi(sisi);
        } else if (choice == 2) { 
            double alas = scan.nextDouble();
            double tinggi = scan.nextDouble();
            segitiga.luasSegitiga(alas, tinggi);
        } else if (choice == 3) {
            double r = scan.nextDouble();
           lingkaran.luasLingkaran(r);
        } else {
             System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}