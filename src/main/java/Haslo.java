import java.util.Scanner;

public class Haslo {
    public static void main(String[] args) {

        String tekstWprowadzonyZKlawiatury;
        System.out.println("Poprosze haslo");
        Scanner klawiatura = new Scanner(System.in);
        tekstWprowadzonyZKlawiatury = klawiatura.next();

        System.out.println("Podane haslo to " + tekstWprowadzonyZKlawiatury);

        if(tekstWprowadzonyZKlawiatury.equals("secret")){
            System.out.println("Witaj w tajnym miejscu.");
        }

    }
}
