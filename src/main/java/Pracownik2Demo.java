public class Pracownik2Demo {
    public static void main(String[] args) {


        Pracownik2 pracownik2 = new Pracownik2("Adam", "Bogdanka");
        pracownik2.setDodatekSwiateczny(200);
        System.out.println(pracownik2.getDodatekSwiateczny());

        Pracownik2 pracownik3 = new Pracownik2("aaa","bbb");
        System.out.println(pracownik3.getDodatekSwiateczny());

        Pracownik2.setDodatekSwiateczny(3000);
        System.out.println("Dodatek dla pracownika 2 " + pracownik2.getDodatekSwiateczny());
        System.out.println("Dodatek dla pracownika 3 " + pracownik3.getDodatekSwiateczny());

    }


}
