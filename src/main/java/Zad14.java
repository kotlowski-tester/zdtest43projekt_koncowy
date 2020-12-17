import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {

        Scanner wczytajZasieg = new Scanner (System.in);

        int a,b,c,d;

        System.out.println("Podaj zakres tabliczki mnozenia:");

        a = wczytajZasieg.nextInt();
        b = wczytajZasieg.nextInt();

        for(c=a; c<=b ; c++){
            System.out.println("Tabliczka mnozenia dla liczby: " + c);

            for(d=1;d<=10;d++){
                System.out.println(c +"*" + d + " = " + (c*d));

            }

        }
    }
}
