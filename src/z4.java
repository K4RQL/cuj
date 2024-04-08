import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj liczbe przepracowanych dni: ");
        int liczba_dni = klawisz.nextInt();
        double pensja = 0.01;
        double suma = 0.01 ;
        for (int i=0;i<liczba_dni;i++){
            pensja*=2;
            suma+=pensja;
            System.out.println(i+" "+pensja);
        }
        System.out.println("Wynagrodzenie: "+ suma+" zł");
    }
}
