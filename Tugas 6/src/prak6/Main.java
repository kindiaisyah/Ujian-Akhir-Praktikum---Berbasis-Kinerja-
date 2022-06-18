package prak6;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Manusia mns1 = new Manusia("Kindi Aisyah", "2151506001111011", false, true);
    Manusia mns2 = new Manusia("Hwang Hyunjin", "2151506001111012", true, true);
    Manusia mns3 = new Manusia("Park Jongseong", "2151506001111013", true, false);
    ArrayList<Manusia> output = new ArrayList<Manusia>();
    output.add(mns1);
    output.add(mns2);
    output.add(mns3);

    System.out.println("========== DAFTAR MANUSIA ==========");
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).toString());
        }
    System.out.println("=====================================");

    Mahasiswa mhs1 = new Mahasiswa("Kindi Aisyah", "33261348010377623", false, false, "2151506001111011", 3.5);
    Mahasiswa mhs2 = new Mahasiswa("Hwang Yeji", "3336134801220963", false, true, "2151502001111011", 4.0);
    Mahasiswa mhs3 = new Mahasiswa("Shin Ryujin", "3325134801001763", false, false, "2151507091111011", 3.2);
    ArrayList<Mahasiswa> output1 = new ArrayList<Mahasiswa>();
    output1.add(mhs1);
    output1.add(mhs2);
    output1.add(mhs3);

    System.out.println();
    System.out.println("====== DAFTAR MAHASISWA FILKOM ======");
        for(int i=0;i<output1.size();i++){
            System.out.println(output1.get(i).toString());
        }
    System.out.println("=====================================");

    Pekerja pkj1 = new Pekerja("Kindi Aisyah", "3326133361030213", false, true, 8, 30, "211000921");
    Pekerja pkj2 = new Pekerja("Park Jimin", "332613480009300690", true, false, 9, 28, "37151198");
    Pekerja pkj3 = new Pekerja("Son Seungwan", "3346134133030088", false, true, 10, 26, "65788198");
    ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
    output2.add(pkj1);
    output2.add(pkj2);
    output2.add(pkj3);

    System.out.println();
    System.out.println("========== DAFTAR PEKERJA ==========");
        for(int i=0;i<output2.size();i++){
            System.out.println(output2.get(i).toString());
        }
    System.out.println("=====================================");

    Manajer mnj1 = new Manajer("Kang Seulgi", "34261348010305543", false, false,8, 28,"342227637", 3789);
    Manajer mnj2 = new Manajer("Bae Joohyun", "32872614801032263", false, false,8, 28,"34257637", 3789);
    Manajer mnj3 = new Manajer("Choi Yeonjun", "332331301030063", true, true,6, 25,"32425349", 3432);
    ArrayList<Manajer> output3 = new ArrayList<Manajer>();
    output3.add(mnj1);
    output3.add(mnj2);
    output3.add(mnj3);

    System.out.println();
    System.out.println("=========== DAFTAR MANAJER ==========");
        for(int i=0;i<output3.size();i++){
            System.out.println(output3.get(i).toString());
        }
    System.out.println("=====================================");

    }
}
