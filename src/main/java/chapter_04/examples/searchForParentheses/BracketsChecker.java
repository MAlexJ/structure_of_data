package chapter_04.examples.searchForParentheses;

import java.util.Stack;

class BracketsChecker
{
    private static final String ERROR_DOES_NOT_CONTAINS = "The expression doesn't contains the delimiter `%s` for `%s`";
    private static final String ERROR_WRONG_STR = "The wrong expression '%s'!";
    private static final String INCORRECT_EXP = "The incorrect expression '%s', the stack has delimiters: %s";

    private String in;
    private Stack<Character> stack;

    BracketsChecker(String in)
    {
        this.in = in;
        stack = new Stack<>();
    }

    void check()
    {
        char[] chars = in.toCharArray();
        for (char ch : chars)
        {
            switch (ch)
            {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!stack.empty())
                    {
                        Character chx = stack.pop();
                        if (isIncorrectDelimiter(ch, chx))
                        {
                            throw new IllegalArgumentException(String.format(ERROR_DOES_NOT_CONTAINS, ch, chx));
                        }
                    }
                    else
                    {
                        throw new IllegalArgumentException(String.format(ERROR_WRONG_STR, in));
                    }
                    break;

                default:
                    break;
            }
        }
        if (!stack.empty())
        {
            throw new IllegalArgumentException(String.format(INCORRECT_EXP, in, stack.toString()));
        }
    }

    private boolean isIncorrectDelimiter(char ch, Character chx)
    {
        return ch == '}' && chx != '{' || ch == ']' && chx != '[' || ch == ')' && chx != '(';
    }
}
