public class Pracownik2 {
    private String imie;
    private String nazwisko;
    public static double dodatekSwiateczny;

    public Pracownik2(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public static double getDodatekSwiateczny() {
        return dodatekSwiateczny;
    }

    public static void setDodatekSwiateczny(double dodatekSwiateczny) {
        Pracownik2.dodatekSwiateczny = dodatekSwiateczny;
    }
}
