public class TablicaDwuwymiarowa {
    public static void main(String[] args) {
        int[][] tablicaDwuwymiarowa =  {{1,2},
                                        {4,5},
                                        {7,9}};

        for (int i = 0; i <= 2 ; i++){
            for(int j = 0; j<=1; j++) {
                System.out.print(tablicaDwuwymiarowa[i][j] + "");
            }
            System.out.println();

        }

    }
}
