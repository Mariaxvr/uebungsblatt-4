package h1;

public class H1_Main {
    public static void main(String[] args) {

        int zone = 3;
        double price = 2.00;

        switch(zone) {
            case 1: System.out.println(price); break;
            case 2: System.out.println(price + 0.35); break;
            case 3,4: System.out.println(price + 0.85); break;
            case 5: System.out.println(price + 1.55); break;
            case 6: System.out.println(price + 2.00); break;
            default: System.out.println(price + 2.00); break;
        }



    }
}
