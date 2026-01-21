
public class Tile
{
    //implicit default constructor
    
    private char letter = 'x';
    private int value = 0; //each tile has value
    
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
        return "tile: " + letter + ", worth " + value + " pts";
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
