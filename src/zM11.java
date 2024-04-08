import java.util.Scanner;

public class zM11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj mase obiektu(w kg): ");
        int m = klawisz.nextInt();
        System.out.print("Podaj predkość obiektu (w m/s): ");
        int v = klawisz.nextInt();
        System.out.print("Energia kinetyczna wynosi: "+kineticEnegry(m,v));
    }
    static int kineticEnegry(int m,int v){
        return (int) (0.5*m*Math.pow(v,2));
    }
}
