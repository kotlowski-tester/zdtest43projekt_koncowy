import java.util.Scanner;

public class DataTest {

    public static void main(String[] args) {
        Scanner wprowadzoneDane = new Scanner(System.in);
        Data mojaData;
        mojaData = new Data(9,11,1985);

        System.out.println("Podaj dzien ");
        int dzien = wprowadzoneDane.nextInt();
        mojaData.setDzien(dzien);

        System.out.println("Podaj miesiac ");
        int miesiac = wprowadzoneDane.nextInt();
        mojaData.setMiesiac(miesiac);

        System.out.println("Podaj rok ");
        int rok = wprowadzoneDane.nextInt();
        mojaData.setRok(rok);

        System.out.println("Kompletna data");
        mojaData.wyswietlDate();

    }
}
