import java.util.Scanner;

/**
 * Pemilihan2percobaan120
 */
public class Pemilihan2percobaan120 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
       
       System.out.println("masukkan tahun"); 
       int tahun = input20.nextInt();
        
        
       if ((tahun % 4)  == 0) {
       if ((tahun % 100)== 0) {
       if ((tahun % 400)== 0) {
       System.out.println("tahun" + tahun + "Tahun kabisat");
        }else  { 
            System.out.println("tahun"+ tahun +"Bukan tahun kabisat");
                     }
             }
    }

       






    }
}