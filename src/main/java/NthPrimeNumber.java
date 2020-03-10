import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class NthPrimeNumber {
    /**
     * @author Krishan Shukla
     * Problem Statement:
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * What is the 10 001st prime number?
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(PalindromicNumberOfDigit.class);
    List<Long> primes = new ArrayList<>();
    public NthPrimeNumber() {
        // Start with 2 and 3 in the list to make it easy to iterate over odd numbers.
        primes.add(2l);
        primes.add(3l);
    }


    public long getPrime(int position) {
        if (position <= primes.size()) {
            return primes.get(position - 1);
        }

        // Start the iteration after the last prime in the list. Skipping even numbers.
        int count = primes.size();
        for (long i = primes.get(primes.size() - 1) + 2; count < position; i = i + 2) {
            if (isPrime(i)) {
                count++;
            }
        }
        return primes.get(primes.size() - 1);
    }

    private boolean isPrime(long number) {
        for (long prime : primes) {
            if (number % prime == 0) {
                return false;
            }
        }
        primes.add(number);
        return true;
    }


}
