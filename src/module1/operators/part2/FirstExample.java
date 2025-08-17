package module1.operators.part2;

public class FirstExample {
    public static void main(String[] args) {

        int[] ia = { 1, 2, 3, 4 };

        int idx = (int) (Math.random() * 101) - 50;

        System.out.println(ia[idx / ia.length]);

        // Sometimes : ArrayIndexOutOfBoundsException

    }

}
