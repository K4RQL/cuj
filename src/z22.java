import java.util.Random;
import java.util.Scanner;

public class z22 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj ilośc pieniedzy: ");
        int kwota = klawisz.nextInt();

        String[] obrazki = {"Wiśnie", "Pomarańcze", "Śliwki", "Dzwonki", "Melony", "Bary"};
        Random losowanie = new Random();
        int[] liczby = {losowanie.nextInt(6),losowanie.nextInt(6),losowanie.nextInt(6)};

        System.out.println(obrazki[liczby[0]]+", "+obrazki[liczby[1]]+", "+obrazki[liczby[2]]);

        if(liczby[0]==liczby[1]&&liczby[0]==liczby[2]&&liczby[1]==liczby[2]){
            System.out.print("Wygrałeś "+kwota*3+"zł");
        }
        else if (liczby[0]==liczby[1]||liczby[0]==liczby[2]||liczby[1]==liczby[2]){
            System.out.print("Wygrałeś "+kwota*2+"zł");
        }
        else{System.out.print("Wygrałeś 0zł");}
    }
}
