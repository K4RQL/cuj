import java.util.Scanner;

public class z11 {
    public static void main(String[] args) {
        int suma=0;
        for (int i= 0; i<10;i++){
            Scanner klawisz = new Scanner(System.in);
            System.out.println("Podaj liczbe którą chcesz dodać: ");
            int liczba = klawisz.nextInt();
            suma+=liczba;
            System.out.println("Suma po dodaniu liczby: "+suma);
        }
    }
}
