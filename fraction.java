
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
    
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    public void setNums(int num, int den)
    {
        this.numerator = num;
        
        if (den != 0) this.denominator = den;
        else
        {
            this.denominator = 1;
            System.out.println("DNEOMNINATOR cant BE ZEROI");
        }
    }
    
    //getters
    public int getNum()
    {
        return numerator;
    }
    
    public int getDen()
    {
        return denominator;
    }
    
    public double toDecimal()
    {
        return (double) numerator / denominator;
    }
    
    //setters
    public void reduce()
    {
        int GCF = 1;
        int i = GCF;
        while (i <= Math.min(numerator, denominator))
        {
            if (numerator % i == 0 && denominator % i == 0)
            {
                GCF = i;
            }
            i++;
        }
        numerator /= GCF;
        denominator /= GCF;
    }
    
    public void setNum(int num)
    {
        numerator = num;
    }
    
    public void setDen(int den)
    {
        denominator = den;
    }
}
