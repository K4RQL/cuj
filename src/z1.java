import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj dodatnia liczbe: ");
        int liczba = klawisz.nextInt();
        int suma=0;
        for(int i = 1 ; i<=liczba ; i++){
            suma+=i;
        }
        System.out.print(suma);
    }
}
