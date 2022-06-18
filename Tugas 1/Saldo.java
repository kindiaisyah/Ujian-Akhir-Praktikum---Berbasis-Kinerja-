package saldo;

import java.io.*;
import java.util.*;

public class Saldo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input  = new Scanner(System.in);
        int saldoutama, pemasukan;
        saldoutama = input.nextInt();
         pemasukan = input.nextInt();
        System.out.println (menghitung(saldoutama, pemasukan));
    }
    public static double menghitung (int saldoutama, int pemasukan){
        double saldo = saldoutama + pemasukan - 7000;
        double bonus = 5*saldo/100/100;
        double saldototal= saldo + bonus;
        return saldototal;
    }
}