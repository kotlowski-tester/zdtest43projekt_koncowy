//Napisz program, który pobiera dwie liczby całkowite, a następnie wykonuje następujące
//operacje matematyczne:
//
//* dodawanie
//* odejmowanie
//* mnożenie
//* dzielenie
//* podniesienie do potęgi (pierwszy argument to liczba, która będzie podnoszona do potęgi,
//drugi argument to potęga do której podnosimy liczbę)
// Wynik operacji powinien zostać przypisany do nowoutworzonej zmiennej, odpowiedniego typu.
// Wynik powinien zostać wyświetlony na ekranie, w następującej postaci:
//* dodawanie -> "a = A, b = B, wynik to C"
//* odejmowanie -> "a = A, b = B, wynik to C"
//* mnożenie -> "a = A, b = B, wynik to C"
//* dzielenie -> "a = A, b = B, wynik to C"
//* podniesienie do potęgi -> "a = A, podniesione do potęgi  B, daje wynik C"


import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner wprowadzonaLiczba = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe calkowita");
        int a = wprowadzonaLiczba.nextInt();

        System.out.println("Wprowadz druga liczbe calkowita");
        int b = wprowadzonaLiczba.nextInt();

        int wynikDodawania = a + b;
        System.out.println("a = " + a +", b = " + b + ", ich suma to " + wynikDodawania);

        int wynikOdejmowania = a - b;
        System.out.println("a = " + a +", b = " + b + ", ich roznica to " + wynikOdejmowania);

        int wynikMnozenia = a * b;
        System.out.println("a = " + a +", b = " + b + ", ich iloczyn to " + wynikMnozenia);

        double wynikDzielenia = a / b;
        System.out.println("a = " + a +", b = " + b + ", ich wynik dzielenia to " + wynikDzielenia);

        double potega = Math.pow(a,b);
        System.out.println("a = " + a +", b = " + b + ", a do potegi b to " + potega);



    }
}
