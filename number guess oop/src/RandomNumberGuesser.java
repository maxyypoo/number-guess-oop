import java.lang.Math;


public class RandomNumberGuesser extends NumberGuesser {
    private int randMidPoint;
    


    public RandomNumberGuesser (int a,int b)
    {
        super(a,b);
    }

    public int getCurrentGuess()
    {
        int genMidPoint;
        int min = lower;
        int max = upper;
        if (shouldGenerate)
        {
            genMidPoint = (int) (Math.random() * (max - min + 1) + min);

            System.out.println(genMidPoint);
            System.out.println(upper);
            System.out.println(lower);

            randMidPoint = genMidPoint;
            shouldGenerate = false;

            return genMidPoint; 
        
        }
        else
        {
            //System.out.println('e');
            
            return randMidPoint;
        }
    }

    public void higher(int currentGuess) {
    }
    
}
