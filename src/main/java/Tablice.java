public class Tablice {
    public static void main(String[] args) {

        int nazwaZmiennej;
        int[]    tablica1 = new int[3];
        //int tablica2[];
        tablica1[0] = 4;
        tablica1[1] = 2;
        tablica1[2] = 3;

        System.out.println(tablica1[1]);
        System.out.println(tablica1[2]);

        System.out.println("--------------");

        double[] tablica2 = {9,1,3,5,7,9.1};
        //System.out.println(tablica2[5]);

        double[] tablica3 = tablica2.clone();


        for(int i = 0; i < tablica2.length; i++){
            System.out.println(tablica2[i]);
        }
        System.out.println("--------------");

        for (double pobranaWartoscZTablicy : tablica2) {
            System.out.println(pobranaWartoscZTablicy);
        }

        System.out.println("--------------");

//        int[] tablica4 = {1,2,2,5,10,20,1,2,5,10};
//
//        for (double pobranaWartoscZTablicy : tablica4) {
//            System.out.println(pobranaWartoscZTablicy);
//
//            int max;
//            for(int j = 0; j < tablica4.length; j++){
//                if(max < tablica4[j]){
//                    max = tablica4[j];
//                    System.out.println(max);
//                }
//
//            }
//        }
    }
}
