import java.util.Random;

public class zM14 {
    public static void main(String[] args) {
        Random losowanie = new Random();
        int random,parzyste=0,nieparzyste=0;
        for(int i=0;i<100;i++){
            random = losowanie.nextInt(0,100000 );
            System.out.print(random);
            if(isEven(random)){
                System.out.println(" Parzysta");
                parzyste++;
            }
            else{
                System.out.println(" Nieparzysta");
                nieparzyste++;
            }

        }
        System.out.println("Ilość liczb parzystych: "+parzyste);
        System.out.println("Ilość liczb nieparzystych: "+nieparzyste);
    }
    static boolean isEven(int number){
        return number % 2 == 0;
    }
}
