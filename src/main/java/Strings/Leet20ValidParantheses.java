package Strings;

import java.util.Stack;

public class Leet20ValidParantheses {
  public static void main(String[] a) {
    String parantheses = "({([])})";
    System.out.println(isValidParentheses(parantheses));
  }

  private static boolean isValidParentheses(String para) {
    Stack<Character> s = new Stack<>();
    for (char c : para.toCharArray()) {
      if (c == '(') {
        s.push(')');
      } else if (c == '{') {
        s.push('}');
      } else if (c == '[') {
        s.push(']');
      } else if (s.isEmpty() || s.pop() != c) {
        return false;
      }
    }
    return s.isEmpty();
  }
}
