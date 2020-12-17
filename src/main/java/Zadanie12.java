    import java.util.Scanner;

    public class Zadanie12 {
        public static void main(String[] args) {

            Scanner klawiaturka = new Scanner(System.in);

            // Initialize variables
            int pobranaLiczba;
            int remainder;

            // Ask user for a positive integer number
            System.out.println("Podaj liczbę: ");
            pobranaLiczba = klawiaturka.nextInt();

            // Iteration in for loop
            for (int i = 1; i <= pobranaLiczba; i++) {

                // Check condition
                if (i %2 == 1) {
                    System.out.println("Liczba nieparzysta: " + i);
                }
            }
        }
    }




