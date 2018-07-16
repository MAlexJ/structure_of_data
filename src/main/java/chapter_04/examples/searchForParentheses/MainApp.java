package chapter_04.examples.searchForParentheses;

import chapter_04.examples.Utils;
import com.google.common.base.Strings;

public class MainApp
{
    public static void main(String[] args)
    {
        boolean flag = true;
        while (flag)
        {
            System.out.println("\nPlease enter the expression, like: (12{24[35]})");
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
                BracketsChecker checker = new BracketsChecker(in);
                checker.check();
                Utils.print("OK!");
            }
        }
    }
}
