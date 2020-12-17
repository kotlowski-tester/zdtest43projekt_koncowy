public class BoxDemo {
    public static void main(String[] args) {

        Box pudelko1 = new Box();
        pudelko1.setSzerokosc(1);
        pudelko1.setWysokosc(3);
        pudelko1.setGlebokosc(-10);

        double obliczonaWartosc = pudelko1.obliczPojemnosc();
        System.out.println(obliczonaWartosc);

        Box pudelko2 = new Box();
        pudelko2.setSzerokosc(5);
        pudelko2.setWysokosc(5);
        pudelko2.setGlebokosc(9);

        System.out.println("Pojemnosc pudelka 2 "+pudelko2.obliczPojemnosc());
        System.out.println("Pojemnosc pudelka 1 " + pudelko1.obliczPojemnosc());

        Box pudelko3 = new Box();
        pudelko3.setGlebokosc(100);
        System.out.println("Pojemnosc pudelka 3 " + pudelko3.obliczPojemnosc());

        Box pudelko4 = new Box(3,4,5);
        System.out.println("pojemnosc pudelka 4 " + pudelko4.obliczPojemnosc());
        System.out.println("szerokosc pudelka 4 " + pudelko4.getSzerokosc());

    }
}
