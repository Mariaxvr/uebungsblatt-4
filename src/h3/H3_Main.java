package h3;

public class H3_Main {
    public static void main(String[] args) {

        float celsiusFloat = 14.2f;
        float fahrenheitFloat = 0;
        double celsiusDouble = 14.2f;
        double fahrenheitDouble = 0;

        fahrenheitFloat = celsiusFloat * 9/5 +32;

        fahrenheitDouble = celsiusDouble * 9/5 +32;

        System.out.println(fahrenheitFloat);
        System.out.println(fahrenheitDouble);
    }
}
