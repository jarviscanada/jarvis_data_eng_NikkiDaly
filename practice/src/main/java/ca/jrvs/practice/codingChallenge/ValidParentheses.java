package ca.jrvs.practice.codingChallenge;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class ValidParentheses {

  public Boolean validParentheses(String str) {
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (map.containsKey(c)) {
        try {
          char top = stack.pop();
          if (top != map.get(c)) {
            return false;
          }
        } catch (EmptyStackException ex) {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }


}
