
public class fraction
{
    private int numerator;
    private int denominator;

    public fraction()
    {
        numerator = 0;
        denominator = 1;
    }

    public fraction(int num, int den)
    {
        setNums(num, den);
    }
    
    public fraction(String str)
    {
        
        String[] numbers = str.split("/");
        int num = Integer.parseInt(numbers[0]);
        int den = Integer.parseInt(numbers[1]);
        
        setNums(num, den);
        
    }
    
    public fraction(fraction f)
    {
        setNums(f.numerator, f.denominator);
    }
    
    public void setNums(int num, int den)
    {
        numerator = num;
        
        if (den != 0) denominator = den;
        else
        {
            denominator = 1;
            System.out.println("DNEOMNINATOR cant BE ZEROI");
        }
    }
}
