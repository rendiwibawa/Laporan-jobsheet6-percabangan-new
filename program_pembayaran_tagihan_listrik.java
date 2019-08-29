package tugas_jobsheet8;
import java.text.NumberFormat;
import java.util.Scanner;
public class program_pembayaran_tagihan_listrik {
    public static void main(String[] args) {
        System.out.println("=========PROGRAM PEMBAYARAN TAGIHAN LISTRIK=========");
        System.out.println("by.");
        Scanner ren= new Scanner(System.in);
        double biaya;
        double total;
        int tariflanganan;
        double pajak;
        int kWh;
        
      //GOLONGAN A
        int langanan=50000;
        int hargakwh=3000;
      //GOLONGAN B
        int langanan2=35000;
        int hargakwh2=2500;
      //GOLONGAN C
        int langanan3=20000;
        int hargakwh3=1000;
        
        System.out.println("Masukan besaran kwh yang anda gunakan selama 1 bulan :");
         System.out.println("======================================================================"); 
        System.out.println("^Pemakaian 000-450kwh  = Golongan C =langanan=20000 & hargakwh=1000^");
          System.out.println("^Pemakaian 451-900kwh  = Golongan B =langanan=35000 & hargakwh=2500^");
           System.out.println("^Pemakaian 901-1200kwh = Golongan A =langanan=50000 & hargakwh=3000^");
            System.out.println("======================================================================");
            System.out.println("Masukan besaran kwh yang anda gunakan selama 1 bulan ini :");
        kWh=ren.nextInt();
        if(kWh>900 && kWh<=1200){
            System.out.println("biyaya dari golongan A");
            biaya=langanan +(hargakwh*kWh);
            System.out.println("BIAYA 1 BULAN  :Rp."+NumberFormat.getCurrencyInstance().format(biaya));
            pajak=(0.2*biaya);
            System.out.println("DI TAMBAH PAJAK:Rp."+NumberFormat.getCurrencyInstance().format(pajak));
            total=biaya+pajak;
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA Rp."+NumberFormat.getCurrencyInstance().format(total));
        
        }else
        if (kWh>450&&kWh<=900){
            System.out.println("biyaya dari golongan B");
            biaya=langanan2 +(hargakwh2*kWh);
            System.out.println("BIAYA 1 BULAN  :Rp."+NumberFormat.getCurrencyInstance().format(biaya));
            pajak=(0.15 * biaya);
            System.out.println("DI TAMBAH PAJAK:Rp."+NumberFormat.getCurrencyInstance().format(pajak));
            total=biaya+pajak;
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA RP."+NumberFormat.getCurrencyInstance().format(total));
        
        }else
        if(kWh<=450){
            System.out.println("biyaya dari golongan C");
            biaya=langanan3 +(hargakwh3*kWh);
            System.out.println("BIAYA 1 BULAN  :Rp."+NumberFormat.getCurrencyInstance().format(biaya));
            pajak=(0.1 * biaya);
            System.out.println("DI TAMBAH PAJAK:Rp."+NumberFormat.getCurrencyInstance().format(pajak));
            total=biaya+pajak;
             System.out.println("===========NOTA PEMBAYARAN===============");
            System.out.println("TOTALNYA Rp."+NumberFormat.getCurrencyInstance().format(total));
        
        }
           
    }
    
}
