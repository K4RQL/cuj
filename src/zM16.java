import java.util.Random;
import java.util.Scanner;

public class zM16 {
    public static void main(String[] args) {
        SprawdzanieWygranej();
    }
    static int PobierzWybor(){
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj swoj wybor: ");
        String wybor = klawisz.nextLine();
        return switch (wybor) {
            case "kamien" -> 0;
            case "papier" -> 1;
            case "nozyce" -> 2;
            default -> -1;
        };
    }
    static int LosowanieLiczby(){
        Random losowanie = new Random();
        return losowanie.nextInt(2);
    }
    static void SprawdzanieWygranej(){
        switch (LosowanieLiczby()){
            case 0 ->{
                switch (PobierzWybor()){
                    case 0 -> System.out.print("Remis!");
                    case 1 -> System.out.print("Wygrałeś!");
                    case 2 -> System.out.print("Przegrałeś!");
                }
            }
            case 1 ->{
                switch (PobierzWybor()){
                    case 0 -> System.out.print("Przegrałeś!");
                    case 1 -> System.out.print("Remis!");
                    case 2 -> System.out.print("Wygrałeś!");
                }
            }
            case 2 ->{
                switch (PobierzWybor()){
                    case 0 -> System.out.print("Wygrałeś!");
                    case 1 -> System.out.print("Przegrałeś!");
                    case 2 -> System.out.print("Remis!");
                }
            }
        }
    }
}
