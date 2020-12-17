public class SavingAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setBalansOszczednosci(1000.0);
        saver2.setBalansOszczednosci(2000.0);

        SavingsAccount.zmienRocznaStopeOprocentowania(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Stan konta dla oszczedzajacy1 = " + saver1.getBalansOszczednosci());
        System.out.println("Stan konta dla oszczedzajacy2 = " + saver2.getBalansOszczednosci());

        SavingsAccount.zmienRocznaStopeOprocentowania(0.05);

        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Stan konta dla oszczedzajacy1 = " + saver1.getBalansOszczednosci());
        System.out.println("Stan konta dla oszczedzajacy2 = " + saver2.getBalansOszczednosci());

    }


}
