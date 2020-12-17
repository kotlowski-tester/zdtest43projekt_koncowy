// Napisz program, który pobiera liczbę całkowitą od użytkownika i zwraca liczbę odwróconą.
// * dla liczby 1234, program powinien zwrócić 4321
// * dla liczby 654789, program powinien zwrócić 987456

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner podanaLiczba = new Scanner(System.in);

        int liczba;
        int odwroconaLiczba = 0;

        System.out.println("Jaka liczbe odwrocic?");
        liczba = podanaLiczba.nextInt();

//        while(liczba != 0){
//            int cyfra = liczba % 10;
//            odwroconaLiczba = odwroconaLiczba * 10 + cyfra;
//            liczba /=10;
//            }

        for(;liczba != 0;liczba /=10){
            int cyfra = liczba%10;
            odwroconaLiczba = odwroconaLiczba*10 + cyfra;
        }

        System.out.println("Wartosc odwrocona : " + odwroconaLiczba);
    }
}
