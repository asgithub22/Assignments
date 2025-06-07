package ConditionalStatementsAndLoops;

public class Assignement13 {

	public static void main(String[] args) {
		int n = 7; // You can change this value to test other inputs
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        

        System.out.println("Is " + n + " a prime number? " + isPrime);
    }

	

}
