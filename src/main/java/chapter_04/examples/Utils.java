package chapter_04.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils
{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine()
    {
        try
        {
            return reader.readLine();
        } catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
        throw new IllegalArgumentException("Incorrect input!");
    }

    public static void close()
    {
        try
        {
            reader.close();
        } catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }

    public static void print(String str)
    {
        System.out.println(String.format("  Result: %s", str));
    }
}
