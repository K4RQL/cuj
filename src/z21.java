import java.util.Random;
import java.util.Scanner;

public class z21 {
    public static void main(String[] args) {
        Random losowanie = new Random();
        int rzut_k = 0;
        int rzut_u = 0;
        int wygrana = 0;
        for (int i = 0;i<10;i++){
            rzut_k = losowanie.nextInt(1,7);
            rzut_u = losowanie.nextInt(1,7);
            System.out.println("Rzut komputera: "+rzut_k+", Rzut Uzytkownika: "+rzut_u);

            if(rzut_k>rzut_u){
                wygrana--;
            }
            else if (rzut_u>rzut_k) {
                wygrana++;
            }
        }
        if (wygrana>0){
            System.out.println("Uzytkownik wygrał");
        }
        else if (wygrana<0){
            System.out.println("Komputer wygrał");
        }
        else {
            System.out.println("Remis");
        }
    }
}
