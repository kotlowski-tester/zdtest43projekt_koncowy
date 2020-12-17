public class Box {
    private double szerokosc;
    private double glebokosc;
    private double wysokosc;

    public double getGlebokosc() {
        return glebokosc;
    }

    public void setGlebokosc(double glebokosc) {
        if(glebokosc > 0) {
            this.glebokosc = glebokosc;
        } else {
            System.out.println("Glebokosc musi byc wieksza niz 0");
        }
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getSzerokosc(){
        return this.szerokosc;

    }
    //pudelko4.setSzerokosc(5)
    public void setSzerokosc (double szerokosc){
        this.szerokosc = szerokosc;
    }

    public Box(){
        szerokosc = 1;
        glebokosc = 1;
        wysokosc = 1;
    }

    public Box(double szerokosc, double glebokosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.glebokosc = glebokosc;
        this.wysokosc = wysokosc;
    }
    //    Box(double szer,double gleb,double wys){
//        szerokosc = szer;
//        glebokosc = gleb;
//        wysokosc = wys;
//    }

    public double obliczPojemnosc(){
        return szerokosc * glebokosc * wysokosc;

    }


}
