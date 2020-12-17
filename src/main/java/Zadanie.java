import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        double wprowadzonaWartosc;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe");
        wprowadzonaWartosc = klawiatura.nextDouble();

        if((wprowadzonaWartosc > 3 && wprowadzonaWartosc <=5 )|| (wprowadzonaWartosc > 8 && wprowadzonaWartosc <= 9)){
            System.out.println("liczba jest prawidlowa");
        }else{
            System.out.println("liczba jest niepoprawna");
        }

    }
}
