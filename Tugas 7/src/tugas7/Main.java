/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {

            PegawaiTetap p1 = new PegawaiTetap("Kindi Aisyah", "3399706074536338", 8500000);
            PegawaiTetap p2 = new PegawaiTetap("Park Jimin", "313156200635447", 2310000);
            PegawaiTetap p3 = new PegawaiTetap("Choi Yeonjun", "32438702890080146", 8500000);
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());

            PegawaiHarian ph1 = new PegawaiHarian("Yunjin", "350720490327424083643", 20000, 60);
            PegawaiHarian ph2 = new PegawaiHarian("Wendy", "3507639874427543781214", 45000, 50);
            PegawaiHarian ph3 = new PegawaiHarian("Rose", "3507574553902653782007", 30000, 45);
            System.out.println(ph1.toString());
            System.out.println(ph2.toString());
            System.out.println(ph3.toString());

            Sales s1 = new
                    Sales("Heeseung", "3007049765", 30, 50000);
            Sales s2 = new
                    Sales("Namjoon", "2432804256", 55, 40000);
            Sales s3 = new
                    Sales("Niki", "4999274214", 70, 60000);
            System.out.println(s1.toString());
            System.out.println(s2.toString());
            System.out.println(s3.toString());
        }
    }



