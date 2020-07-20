package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  /**
   * Description : Returns true if two strings are anagrams of eachother
   * Big O : O(nlog(n))
   * Justification : Time complexity of Arrays.sort is O(nlog(n))
   */
  public boolean validAnagramSorting(String str, String mixedStr) {
    if (str.length() != mixedStr.length()) {
      return false;
    }
    char[] strArr = str.toLowerCase().toCharArray();
    char[] mixedStrArr = mixedStr.toLowerCase().toCharArray();
    Arrays.sort(strArr);
    Arrays.sort(mixedStrArr);
    return Arrays.equals(strArr, mixedStrArr);
  }

  /**
   * Description : Returns true if two strings are anagrams of eachother
   * Big O : O(n)
   * Justification : Iterates through str and mixedStr of length n and insert/remove from map takes O(1)
   */
  public boolean validAnagramModified(String str, String mixedStr) {
    if (str.length() != mixedStr.length()) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (map.containsKey(c)) {
        map.put(c, map.get(c)+1);
      } else {
        map.put(c, 1);
      }
    }

    for (int j = 0; j < mixedStr.length(); j++) {
      char x = mixedStr.charAt(j);
      if (map.containsKey(x)) {
        map.put(x, map.get(x)-1);
        if (map.get(x) < 0) {
          return false;
        }
      } else {
        return false;
      }
    }
    return true;
  }

}
