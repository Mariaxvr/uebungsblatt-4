package h2;

public class H2_Main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        boolean a = true;
        boolean b = true;
        boolean c = true;
        int input = 1;

        if (input==10 || input==11)
            x = true;
        else
            x = false;

        if (input==1 || input == 11)
            y = true;
        else
            y = false;

        if (x==true && y==true)
            a = true;
        else
            a = false;

        if (x==true || x!=y)
            b = true;
        else
            b = false;

        if ((x==true && y==true) || (x==false && y==true))
            c = false;
        else
            c = true;

        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("a ist " + a);
        System.out.println("b ist " + b);
        System.out.println("c ist " + c);
    }
}
