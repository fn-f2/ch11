
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
        setNum(num);
        setDen(den);
    }
    
    public fraction(String str)
    {
        
        String[] numbers = str.split("/");
        int num = Integer.parseInt(numbers[0]);
        int den = Integer.parseInt(numbers[1]);
        
        setNum(num);
        setDen(den);
        
    }
    
    public fraction(fraction f)
    {
        setNum(f.numerator);
        setDen(f.denominator);
    }
    
    public String toString()
    {
        return numerator + "/" + denominator;
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
    
    public boolean equals(fraction f)
    {
        return (this.numerator == f.getNum()) && (this.denominator == f.getDen());
    }
    
    //setters
    
    public void reduce()
    {
        int gcf = gcf(numerator, denominator);
        numerator /= gcf;
        denominator /= gcf;
    }
    
    public int gcf(int a, int b)
    {
        int s = Math.min(a, b);
        b = Math.max(a, b)-s;
        if (a == b) return a;
        
        return gcf(s, b);
    }
    
    public void setNum(int num)
    {
        numerator = num;
    }
    
    public void setDen(int den)
    {
        if (den != 0) this.denominator = den;
        else
        {
            this.denominator = 1;
            System.out.println("DNEOMNINATOR cant BE ZEROI");
        }
    }

    
    public static fraction multiply(fraction a, fraction b)
    {
        int newNum = a.getNum() * b.getNum();
        int newDen = a.getDen() * b.getDen();
        
        fraction c = new fraction(newNum, newDen);
        //c.reduce();
        
        return c;
    }
    
    public static fraction divide(fraction a, fraction b)
    {
        if (b.getNum() == 0) return null;
        
        int newNum = a.getNum() * b.getDen();
        int newDen = a.getDen() * b.getNum();
        
        fraction c = new fraction(newNum, newDen);
        //c.reduce();
        
        return c;
    }
    
    public static fraction add(fraction a, fraction b)
    {
        int newNum = (b.getDen() * a.getNum()) + (a.getDen() * b.getNum());
        int newDen = (a.getDen() * b.getDen());
        
        fraction c = new fraction(newNum, newDen);
        //c.reduce();
        
        return c;
    }
    
    public static fraction subtract(fraction a, fraction b)
    {
        int newNum = (b.getDen() * a.getNum()) - (a.getDen() * b.getNum());
        int newDen = (a.getDen() * b.getDen());
        
        fraction c = new fraction(newNum, newDen);
        //c.reduce();
        
        return c;
    }
}
