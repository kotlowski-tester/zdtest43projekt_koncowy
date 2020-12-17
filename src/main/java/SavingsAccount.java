// Stwórz klasę "SavingsAccount". Uzyj zmiennej statycznej do przechowywania rocznej stopy oprocentowania dla
// posiadaczy konta. Każdy obiekt klasy powinien posiadać instancje zmiennej przechowującej, aktualny stan
// oszczędności danego użytkownika.
//
// Stwórz metodę do obliczenia miesięcznych odsetek, oszczędności stanowią iloczyn oszczędności oraz rocznej stopy
// oprocentowania podzielone przez ilość miesięcy (12). Obliczone odsetki należy dodać do aktualnego stanu oszczędności
//
// Stwórz metodę, która umożliwia zmiane rocznej stopy oprocentowania.
//
// Napisz kod, który zademonstruje działanie zaprojektowanej klasy oraz jej metod. Stwórz dwie instancje klasy, w których
// będą przechowywane oszczędności, z zainicjalizowanymi wartościami 1000 zł oraz 2000 zł. Ustaw roczne oprocentowanie
// na poziomie 4%. Policz odsetki, a wynik wydrukuj na ekran. Następnie zmień oprocentowanie do poziomu 5% i ponownie
// oblicz odsetki, wynik wydrukuj na ekran.

public class SavingsAccount {
    public static double rocznaStopaOprocentowania;
    private double balansOszczednosci;
    public SavingsAccount(){
        rocznaStopaOprocentowania = 0.0;
        balansOszczednosci = 0.0;
    }

    public SavingsAccount(double intRate, double savBal){
        rocznaStopaOprocentowania = intRate;
        balansOszczednosci = savBal;
    }

    public double obliczMiesieczneOdsetki(){
        double intRate = (balansOszczednosci * rocznaStopaOprocentowania/12);
        balansOszczednosci = balansOszczednosci + intRate;
        return intRate;
    }

    public static void zmienRocznaStopeOprocentowania(double nowaStopaOprocentowania){
        rocznaStopaOprocentowania = nowaStopaOprocentowania;
    }

    public double getBalansOszczednosci() {
        return balansOszczednosci;
    }

    public void setBalansOszczednosci(double balansOszczednosci) {
        this.balansOszczednosci = balansOszczednosci;
    }

    public static double getRocznaStopaOprocentowania() {
        return rocznaStopaOprocentowania;
    }

}


