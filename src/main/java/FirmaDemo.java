public class FirmaDemo {

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Adam", "Bogdanka", 18, 2800);
        System.out.println(pracownik1.getNazwisko());

        Kierownik kierownik1 = new Kierownik("Marek", "Kieras", 38, 2800,2000);
    }

}

