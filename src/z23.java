import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class z23 {
    public static void main(String[] args )throws FileNotFoundException {
        Scanner klawisz = new Scanner(System.in);
        System.out.print("Podaj swoje imie: ");
        String imie = klawisz.nextLine();
        System.out.print("Opisz siebie: ");
        String opis = klawisz.nextLine();
        PrintWriter zapis = new PrintWriter("strona.html");
        zapis.println("<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>"+imie+"</h1>\n" +
                "<hr />\n" +
                opis+
                "<hr />\n" +
                "</body>\n" +
                "</html>");
        zapis.close();
    }
}
