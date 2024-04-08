import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class zM13 {
    public static void main(String[] args)throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("liczby_pierwsze.txt");
        for (int i = 2;i<=10000;i++){
            if (isPrime(i)){
                zapis.println(i);
            }
        }
        zapis.close();
    }
    static boolean isPrime(int liczba){
        for (int i = 2 ; i <=Math.sqrt(liczba);i++){
            if (liczba%i==0){return false;}
        }
        return true;
    }
}
