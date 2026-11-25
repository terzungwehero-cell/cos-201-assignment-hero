import java.math.BigInteger;

public class FibonacciSequence {
    public static void main(String[] args) {
        int count = 100;
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First " + count + " numbers of the Fibonacci sequence:");

        for (int i = 1; i <= count; i++) {
            System.out.println(i + ": " + first);
          
            BigInteger next = first.add(second);
            
            first = second;
            second = next;
        }
    }
}
