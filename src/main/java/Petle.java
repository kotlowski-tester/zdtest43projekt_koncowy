import java.sql.SQLOutput;
import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
        int i=0;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("-------------");
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);

        System.out.println("---------------------");

        for(int z = 0; z <= 10; z++){
            System.out.println(z);

        }

        System.out.println("----9--------");

        for(int a = 0; a<=4;a++){
            System.out.println("To jest " + a + " komunikat w petli");
        }

        System.out.println("---11--------");

        String tekstWprowadzonyZKlawiatury;
        Scanner klawiatura = new Scanner(System.in);

        do{
            System.out.println("Podaj haslo:");
            tekstWprowadzonyZKlawiatury = klawiatura.next();

            if(tekstWprowadzonyZKlawiatury.equals("secretpassword")){
                System.out.println("Poprawne haslo");
                break;
            }else{
                System.out.println(tekstWprowadzonyZKlawiatury);
                System.out.println("niepoprawne haslo");
            }

        }while(!tekstWprowadzonyZKlawiatury.equals("secretpassword"));






    }
}
