public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private double pensja;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, int wiek, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
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

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


}
