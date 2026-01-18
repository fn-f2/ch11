
public class Tile
{
    //implicit default constructor
    
    private static char letter = 'x'; //one variable for all instances of this object - class variable
    private int value = 0; //each tile has value
    
    private int yay = 1;
    
    public Tile(char ch, int v) //constructor
    {
        this.letter = ch;
        this.value = v;
    }
    
    public static void printTile(Tile t)
    {
        System.out.println(t);
    }
    
    public String toString()
    {
        return "tile: " + letter + "worth: " + value + "pts";
    }
    
    public boolean equals(Tile t)
    {
        return this.letter == t.letter;
    }
    
    //getters====================================================================
    public char getLetter()
    {
        return this.letter;
    }
    public int getValue()
    {
        return this.value;
    }
    
    //setters====================================================================
    public void setLetter(char ch)
    {
        this.letter = ch;
    }
    public void setValue(int v)
    {
        this.value = v;
    }
}
