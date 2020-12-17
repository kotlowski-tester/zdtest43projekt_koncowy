public class Zad13 {
    public static void main(String[] args) {

//        System.out.println(Math.sqrt(2+2));


        //double[] tablica = {3,5,7,1,3,12,50,11};

        int[] tablica = new int[10];
        for(int i = 0;i <= tablica.length-1;i++){
            tablica[i] = (int)(Math.random() * 20 - 10);
        }
        int min, max;
        min = tablica[0];
        max = tablica[0];

        for(int pobranaWartosc : tablica){
            if(pobranaWartosc < min){
                 min = pobranaWartosc;
            }
            if(pobranaWartosc > max){
                max = pobranaWartosc;


            }
        }
        System.out.println("minimalna wartość " + min);
        System.out.println("maksymalna wartosc " + max);
    }

}
