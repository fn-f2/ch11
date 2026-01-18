import java.util.Scanner;

public class FractionQuiz
{
    public static int wins = 0;
    public static int games = 0;
    public static String operator = "";

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!\n");

        while (true)
        {
            determineOperator();

            fraction a = randFrac();
            fraction b = randFrac();         

            System.out.println(a.toString() + " " + operator + " " + b.toString() + " = ");
            String inp = in.nextLine();

            if (inp.equals("quit"))
            {
                quitSequence();
                break;
            }

            String[] nums = inp.split("/");

            int num = Integer.parseInt(nums[0]);
            int den = Integer.parseInt(nums[1]);

            fraction ans = new fraction(num, den);

            if (ans.equals(calcAns(a, b)))
            {
                System.out.println("Correct!");
                wins++;
            } else
            {
                System.out.println("Wrong! The answer is " + calcAns(a, b));
            }

            games++;
        }
    }

    public static fraction randFrac()
    {
        fraction f = new fraction(randomize(9), randomize(9));
        f.reduce();

        return f;

    }

    public static int randomize(int n)
    {
        return (int) (Math.random() * n + 1);
    }

    public static void determineOperator()
    {
        int n = randomize(4);
        if (n == 1) operator = "+";
        else if (n == 2) operator = "-";
        else if (n == 3) operator = "/";
        else operator = "*";
    }

    public static void quitSequence()
    {
        fraction ratio = new fraction(wins, games);
        int percent = (int) ratio.toDecimal()*100;

        System.out.println("\nYour win ratio was " + ratio + ", for a score of " + percent + " percent!");
    }

    public static fraction calcAns(fraction a, fraction b)
    {
        fraction f = new fraction();

        if (operator.equals("+")) //add
        {
            f.setNum(a.getNum()*b.getDen() + b.getNum()*a.getDen());
            f.setDen(a.getDen()*b.getDen());

            fraction.subtract(a, b);
        }
        else if (operator.equals("-")) //subtract
        {
            f.setNum(a.getNum()*b.getDen() - b.getNum()*a.getDen());
            f.setDen(a.getDen()*b.getDen());
        }
        else if (operator.equals("/")) //divide
        {
            f.setNum(a.getNum()*b.getDen());
            f.setDen(a.getDen()*b.getNum());
        }
        else //multiply
        {
            f.setNum(a.getNum()*b.getNum());
            f.setDen(a.getDen()*b.getDen());
        }

        f.reduce();
        return f;
    }
}

