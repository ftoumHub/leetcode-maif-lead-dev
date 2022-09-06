package fr.maif.leetcode.todo;

import java.util.Stack;

/**
 * Given an input string, reverse the string word by word.
 */
public class ReverseWordsInAString {

  public String reverseWords(String s) {
    if (s == null) {
      return null;
    }
    if (s.length() == 0) {
      return "";
    }
    int state = 0;
    int start = -1;
    Stack<String> stack = new Stack<String>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (state) {
      case 0:
        if (c == ' ') {
          start = -1;
        } else {
          start = i;
          state = 1;
        }
        break;
      case 1:
        if (c == ' ') {
          String word = s.substring(start, i);
          stack.push(word);
          start = -1;
          state = 0;
        } else {
          ;
        }
      }
    }
    // last word
    if (start != -1) {
      stack.push(s.substring(start));
    }
    if (stack.isEmpty()) {
      return "";
    } else {
      String output = stack.pop();
      while (!stack.isEmpty()) {
        output += " " + stack.pop();
      }
      return output;
    }
  }
}
