public class Kierownik extends Pracownik {
    private double premia;

    public Kierownik(String imie, String nazwisko, int wiek, double pensja, double premia) {
        super(imie, nazwisko, wiek, pensja);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }
}
