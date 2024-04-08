import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = klawisz.nextInt();
        int produkt = liczba*10;
        while (produkt<=100) {

            System.out.println(produkt);
            produkt  *= 10;
        }
    }
}
