import java.util.Scanner;

public class z20 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj dlugosc boku: ");
        int dl_boku = klawisz.nextInt();
        for (int i = 0;i<dl_boku;i++){
            for (int j = 0;j<dl_boku;j++){
                System.out.print("X");
            }
            System.out.println("");
        }
    }
}
