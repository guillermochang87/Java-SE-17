package module1.operators.part1;

public class SecondExample {

    public static void main(String[] args) {

        int x = 1;
        int z;

        try {
            z = 100 / --x;
        } catch (Exception e) {
            System.out.println("Bang!");
        }
        System.out.println(x);
    }

}
