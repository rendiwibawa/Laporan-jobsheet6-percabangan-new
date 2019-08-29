package tugas_jobsheet6;
import java.util.Scanner;
public class membuat_resep_bahan {
    public static void main(String[] args) {
        String identitas= "rendi pryata wibawa/X_RPL2/30";
        System.out.println("identitas ="+identitas);
        
        System.out.println("\nSaran resep dari Bahan Milik Anda\n");
        Scanner ren= new Scanner(System.in);
        System.out.println("Bahan pertama =");
        System.out.println("1. Pisang ");
        System.out.println("2. Telur ");
        System.out.println("Masukkan no pilihan Anda");
        int bahan1 = ren.nextInt();
        if (bahan1 == 1 || bahan1 == 2)
        {
        System.out.println("Bahan Kedua: ");
        if (bahan1 == 1){
        System.out.println("1. Susu");
        System.out.println("2. MINYAK GORENG");
        System.out.println("3. Tidak ada");
        }else{
        System.out.println("1. Minyak Goreng");
        System.out.println("2. Roti");
        System.out.println("3. Tidak ada");
        }
        System.out.println("masukan no pilihan Anda :");
       
        
        }else
        System.out.println("Mohon Maaf, pilihan tidak ditemukan,"+"tidak dapat memberikan saran resep");
        int bahan2 = ren.nextInt();
        if(bahan1 >= 1 && bahan2 <= 3)
        {
        if(bahan1==1)
            switch(bahan2)
            {
                case 1:System.out.println("Anda dapat membuat milk shake banana");break;
                case 2:System.out.println("Anda dapat membuat pisang goreng");break;
                case 3:System.out.println("Anda dapat membuat pisang rebus");   
                    
            }
        else
           switch(bahan2){
               case 1: System.out.println("Anda dapat membuat teluar mata sapi");break;
               case 2: System.out.println("Anda Dapat membuat sandwich telur");break;
               case 3: System.out.println("Anda Dapat membuat telur rebus");
                       
           }
            
        }else
             System.out.println("mohon maaf, pilihan tidak di temukan,"+"tidak dapat memberikan saran resep");
        
    }
    
}
