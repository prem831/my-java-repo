package basics;

public class PrintPrimeNumbers {
    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i < 2) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
