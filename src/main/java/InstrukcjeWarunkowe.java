import org.w3c.dom.ls.LSOutput;

public class InstrukcjeWarunkowe {


    public static void main(String[] args) {
        int a = 4, b = 2;

        if (a == 5){
            System.out.println("a jest rowne 5");

        } else if(a == 4) {
            System.out.println("a njest rowne 4");


        }//koniec instrukcji warunkowej

        System.out.println("instrukcja po if");

    int c = 1, d = 2;
    c++; // c = c + 1
        ++c;
        System.out.println("c = " + c);//3

        c *= 2;//c = c * 2
        System.out.println("c = " + c);

        int zmienna1 = 1, zmienna2 = 2, zmienna3, zmienna4;
        zmienna3 = ++zmienna1;//zmienna1 = zmienna1 + 1
                                //zmienna3 = zmiienna1
        zmienna4 = zmienna2++;//zmienna4 = zmienna2
                                //zmienna = zmienna2 + 1

        System.out.println("zmienna1 = " + zmienna1);
        System.out.println("zmienna2 = " + zmienna2);
        System.out.println("zmienna3 = " + zmienna3);
        System.out.println("zmienna4 = " + zmienna4);





    }


}
