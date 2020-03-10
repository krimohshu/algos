import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class MultiplesOf3And5 {
    private static final Logger LOGGER = LoggerFactory.getLogger(MultiplesOf3And5.class);

    /**
     * @author Krishan Shukla
     * Problem Statement:
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    private int total_sum=0;
    // Following is using Int stream
    public int getSumOffactorsUsingStreams(){
        IntStream.range(1, 1000)
               .forEach(factor -> {
                   if (factor % 3 == 0 || factor % 5 == 0) {
                       total_sum = total_sum + factor;
                   }
               });

        return total_sum;
    }

    /*public int getSumOffactors(){
        for(int i=0 ; i<1001 ; i++){
            if (i % 3 == 0 || i % 5 == 0)
                total_sum = total_sum + i;
        }
        return total_sum;
    }
*/
}
