import java.util.Arrays;

public class NamesScoreBasedOnChar {

    /**
     * @author Krishan Shukla
     * Using names as a param in calcNameScore, a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
     * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
     * What is the total of all the name scores in the file?
     */

    public int calcNameScore(String[] names)
    {
        int sum = 0;
        Arrays.sort(names);
        for(int i=1;i<=names.length;i++)
        {
            sum+=i*nameScore(names[i-1]);
        }
        return sum;
    }

    private int nameScore(String name)
    {
        int score = 0;
        if(name == null || name.length() == 0)
            return score;
        int size = name.length();
        for(int i=0;i<size;i++)
        {
            score+=(int)name.charAt(i)-64;
        }
        return score;
    }


}
