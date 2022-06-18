package prak6;

import java.text.DecimalFormat;

public class Manajer extends Pekerja{
    public int lamaKerja;
    static int jumlah3 = 0;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }
    
    public int getLamaKerja(){
        return lamaKerja;
    }
    public void setLamaKerja(int jamKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double bonusManajer(){
        return getBonuss() * 0.3;
    }
    public void totalManajer(){
        System.out.println(jumlah3);
    }
    
    
    public String getStatus(){
        String kantor = "";
        String dep = "";
        String cab;
        switch (NIP.substring(0,1)){
            case "1" :
                    kantor = "Mondstadt";
                break;
            case "2" :
                    kantor = "Liyue";
                break;
            case "3" :
                    kantor = "Inazuma";
                break;
            case "4" :
                    kantor = "Sumeru";
                break;
            case "5" :
                    kantor = "Fontaine";
                break;
            case "6" :
                    kantor = "Natlan";
                break;
            case "7" :
                    kantor = "Snezhnaya";
                break;
        }
        cab = " cabang ke- " + NIP.substring(2,3);
        switch (NIP.substring(6,7)){
            case "1" :
                    dep = "Pemasaran";
                break;
            case "2" :
                    dep = "Humas";
                break;
            case "3" :
                    dep = "Riset";
                break;
            case "4" :
                    dep = "Teknologi";
                break;
            case "5" :
                    dep = "Personalia";
                break;
            case "6" :
                    dep = "Akademik";
                break;
            case "7" :
                    dep = "Administrasi";
                break;
            case "8" :
                    dep = "Operasional";
                break;
            case "9" :
                    dep = "Pembangunan";
                break;
        }
        return dep + ", "+ kantor;
    }

    public void totalPekerja(){
        System.out.println(jumlah2);
        
    }
   public String toString(){
        jumlah3++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
                "\nNama             : " + getNama()+
                        "\nNIK              : "+ getNIK()+
                        "\nJenis Kelamin    : "+ (getJenisKelamin()?"Laki-laki" : "Perempuan") +
                        "\nPendapatan       : "+ (getPendapatan() + getBonuss() + bonusManajer() + getGajii() + 15) + "$" +
                        "\nBonus            : "+ getBonuss() + bonusManajer()+ "$" +
                        "\nGaji             : "+ getGajii()+ "$" +
                        "\nStatus           : "+ getStatus() +
                        "\nLama Kerja       : "+ getLamaKerja()+ " hari" + "\n"
                ;

    }


}
