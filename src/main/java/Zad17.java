//  jeśli liczba jest podzielna przez 3 to program powinien wydrukować słowo "fizz"
//  jeśli liczba jest podzielna przez 5 to program powinien wydrukować słowo "buzz"
//  jeśli liczba jest podzielna przez 3 i 5 to program powinien wydrukować słowo "fizzbuzz"

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {

        Scanner podanaLiczba = new Scanner(System.in);
        System.out.println("Podaj liczbe ");
        int liczba = podanaLiczba.nextInt();
        String fizzbuzzRezultat = fizzBuzz(liczba);
        System.out.println(fizzbuzzRezultat);

    }

    public static String fizzBuzz(int liczba) {
        if (liczba % 3 == 0) {
            if (liczba % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (liczba % 5 == 0) {
            return "buzz";

        }
        return String.valueOf(liczba);
    }
}
