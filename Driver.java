public class Driver
{
    public static fraction MILU = new fraction(355, 113);
    final static double EPSILON = Math.abs(Math.PI-MILU.toDecimal());
    public static void main(String[] args)
    {
        
        //frraction stuff===================================================================
        fraction a = new fraction();
        fraction b = new fraction(100, 200);
        b.reduce();
        
        fraction c = new fraction("1202/1800");
        c.reduce();
        
        fraction d = new fraction(c);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b.toDecimal());
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println(PI().getNum() + "/" + PI().getDen());
        
        //tile stuff====================================================================
        Tile z = new Tile('z', 10);
        Tile.printTile(z);
        
        //Tile m = new Tile();
    }
    
    public static fraction PI()
    {
        fraction f = new fraction(19, 6);
        
        while (Math.abs(Math.PI-f.toDecimal()) >= EPSILON)
        {
            if (f.toDecimal()>Math.PI) f.setDen(f.getDen()+1);
            else f.setNum(f.getNum()+1);
        }
        
        return f;
    }
}
