import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class zM15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj wartosc przyszłą(F): ");
        int F = klawisz.nextInt();
        System.out.print("Podaj roczną stope oprocentowania(r): ");
        double r = klawisz.nextDouble();
        System.out.print("Podaj liczbe lat(n): ");
        int n = klawisz.nextInt();
        System.out.println("Wartość bieżąca wynosi "+PresentValue(F,r,n)+"zł");
    }
    static double PresentValue(int F,double r, int n){
        BigDecimal bd = new BigDecimal(F/Math.pow((1+r),n)).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
