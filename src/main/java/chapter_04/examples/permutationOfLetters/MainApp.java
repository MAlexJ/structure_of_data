package chapter_04.examples.permutationOfLetters;

import chapter_04.examples.Utils;
import com.google.common.base.Strings;

public class MainApp
{
    public static void main(String[] args)
    {
        boolean flag = true;
        while (flag)
        {
            System.out.println("\nPlease enter the word!");
            String in = Utils.readLine();

            if (in.equalsIgnoreCase("EXIT"))
            {
                Utils.close();
                flag = false;
            }
            else if (Strings.isNullOrEmpty(in))
            {
                System.out.println("Please enter the correct word!");
            }
            else
            {
                Reverse rev = new Reverse(in);
                Utils.print(rev.doRevers());
            }
        }
    }
}
