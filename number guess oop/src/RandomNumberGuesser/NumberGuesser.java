//Doga Akpinaroglu
public class NumberGuesser 
{
    protected
    int lower;
    protected
    int upper;
    private
    int calledUpper;
    private
    int calledLower;
    protected boolean shouldGenerate;


    private int getMidPoint (int lower, int upper)
    {
        int midPoint = (lower + upper)/2;
        if (lower == upper - 1 && upper == calledUpper)
        {
            return 100;
        }
        if (lower == calledLower && upper == lower + 1)
        {
            return 1;
        }
        return midPoint;

    }
   /* public int getUpper()
    {
        return upper;
    }
     public int getLower()
    {
        return lower;
    }*/


    public NumberGuesser (int lowerBound, int upperBound)
    {
        lower = lowerBound;
        upper = upperBound;
        calledLower = lowerBound;
        calledUpper = upperBound;
        shouldGenerate = true;
    }

    public void higher ()
    {
        lower = getMidPoint(lower, upper);
        shouldGenerate = true;
    }
    public void higher (int a)
    {
        //System.out.println('h');
        lower = a;
        shouldGenerate = true;
    }
    public void lower()
    {
        upper = getMidPoint(lower, upper);
        shouldGenerate = true;
    }

    public void lower(int a)
    {
        //System.out.println('l');
        upper = a;
        shouldGenerate = true;
    }

    public int getCurrentGuess ()
    {
        return getMidPoint(lower, upper);
    }
    public void reset ()
    {
        lower = calledLower;
        upper = calledUpper;
    }

}