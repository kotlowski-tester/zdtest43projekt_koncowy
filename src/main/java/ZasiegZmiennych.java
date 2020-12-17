public class ZasiegZmiennych {
    public static void main(String[] args){
        int a = 4;//utworzenie a
        if (a == 4){
            int y = 2;//utworzenie y
            System.out.println(y);
        }//zmienna y zostaje zniszczona
        a = a *2;
    }
}
