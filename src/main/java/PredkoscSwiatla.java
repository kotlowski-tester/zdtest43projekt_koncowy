public class PredkoscSwiatla {

    //main
    public static void main(String[] args) {
        long days = 130;
        long distance;
        final long LIGHT_SPEED = 300000;//km/s


        distance = LIGHT_SPEED * days * 24 * 60 * 60;
        System.out.println(distance);
        System.out.println("Swiatlo w " + days + " dni przebedzie " + distance + " km");

    }
}
