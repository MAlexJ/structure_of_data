package chapter_04.examples.permutationOfLetters;


import java.util.Stack;

class Reverse
{
    private String input;

    Reverse(String in)
    {
        this.input = in;
    }

    String doRevers()
    {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray())
        {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.empty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
