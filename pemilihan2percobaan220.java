import java.util.Scanner;

/**
 * pemilihan2percobaan220
 */
public class pemilihan2percobaan220 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.println("sudut1   :");
        int sudut1 = input20.nextInt();
        System.out.println("sudut2  :");
        int sudut2 = input20.nextInt();
        System.out.println("sudut3     :");
        int sudut3 = input20.nextInt();
        System.out.println("total sudut   :");
        int totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println(totalSudut);
        
        
        if (sudut1 == sudut2 && sudut2 == sudut3) {
            System.out.println("Segitiga ini adalah segitiga sama sisi.");
        } else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3) {
            System.out.println("Segitiga ini adalah segitiga sama kaki.");
        } else {
            System.out.println("Segitiga ini adalah segitiga sembarang.");
        }
        if (totalSudut == 180){
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 ==90))
        System.out.println("Segitiga tsb adalah segitiga siku2");
        else
                System.out.println("Segitiga tsb bukan segitiga siku2");

      
    }
    {
    }
    }
}

