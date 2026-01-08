public class FractionDriver
{
    public static void main(String[] args)
    {
        fraction a = new fraction();
        fraction b = new fraction(100, 200);
        b.reduce();
        
        fraction c = new fraction("3588/2742");
        c.reduce();
        
        fraction d = new fraction(c);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b.toDecimal());
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
