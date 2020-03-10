import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PalindromicNumberOfDigit {

    private static final Logger LOGGER = LoggerFactory.getLogger(PalindromicNumberOfDigit.class);

    /**
     * @author Krishan Shukla
     * Problem Statement:
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */

    long candidateBigNumber = 0;

    public long getPalindromicNumberOfTwoThreeDigit(int firstNumber,int secondNumber) {

        for (int secNum = secondNumber; secNum > 0; secNum--)
        {
            for (int firNum = firstNumber; firNum > 0; firNum--)
            {
                if ( isPalindrome( new Long(firNum*secNum).toString() ) )
                {
                    if ( firNum*secNum > candidateBigNumber)
                    {
                        candidateBigNumber = firNum*secNum;
                    }
                }
            }
        }
        LOGGER.info("Highest num is " + candidateBigNumber);
        return candidateBigNumber;

    }

    public boolean isPalindrome( String multipleOfTwoNumberForAnalysis )
    {
        if ( multipleOfTwoNumberForAnalysis.length() % 2 != 0 )
        {
            multipleOfTwoNumberForAnalysis = multipleOfTwoNumberForAnalysis.substring( 0, multipleOfTwoNumberForAnalysis.length() / 2 ) + multipleOfTwoNumberForAnalysis.substring( (multipleOfTwoNumberForAnalysis.length() / 2) + 1);
        }

        return new StringBuilder( multipleOfTwoNumberForAnalysis.substring( 0, multipleOfTwoNumberForAnalysis.length() / 2) ).
                reverse().toString().equals( multipleOfTwoNumberForAnalysis.substring( multipleOfTwoNumberForAnalysis.length() / 2) );
    }


}
