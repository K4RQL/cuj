import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj liczbe kilometrow: ");
        int liczba_km = klawisz.nextInt();
        System.out.print("Podaj liczbe godzin jazdy: ");
        int liczba_godzin = klawisz.nextInt();
        int kmh =liczba_km / liczba_godzin;
        for (int i= 1;i<=liczba_godzin;i++){
            System.out.println(i +" "+ kmh*i);
        }
    }
}
