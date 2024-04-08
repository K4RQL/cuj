import java.util.Scanner;

public class zM12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = klawisz.nextInt();
        if (isPrime(liczba)){
            System.out.print("Liczba jest liczbą pierwszą");
        }
        else{
            System.out.print("Liczba nie jest liczbą pierwszą");
        }
    }
    static boolean isPrime(int liczba){
        for (int i = 2 ; i <=Math.sqrt(liczba);i++){
            if (liczba%i==0){return false;}
        }
        return true;
    }
}
