package ca.jrvs.practice.codingChallenge;

public class RotateString {

  /**
   * Description: Returns true if String B is a rotation of String A Big O : O(n^2) Justification :
   * checks a string of length 2n if it contains a string of length n
   */
  public boolean rotateString(String A, String B) {
    return A.length() == B.length() && (A + A).contains(B);
  }
}
