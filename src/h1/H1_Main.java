package h1;

public class H1_Main {
    public static void main(String[] args) {

        int zone = 7;
        double price ;

        switch (zone) {
            case 1:
                price = 2.00;
                break;
            case 2:
                price = 2.35;
                break;
            case 3, 4:
                price = 2.85;
                break;
            case 5:
                price = 3.55;
                break;
            case 6:             // kann man auch weglassen
                price = 4.00;
                break;
            default:
                price = 4.00;
                break;
        }

        System.out.println("Zone: " + zone + " -> Price: " + price + "€");

    }
}
