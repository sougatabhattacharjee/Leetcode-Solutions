package leetcode.explore.interview.google;

/**
 * Created by Sougata Bhattacharjee
 * On 2019-05-11
 *
 * https://leetcode.com/explore/interview/card/google/67/sql-2/469/
 *
 * Repeated String Match
 *
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
 *
 * For example, with A = "abcd" and B = "cdabcdab".
 *
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
 *
 * Note:
 * The length of A and B will be between 1 and 10000.
 */
public class RepeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        StringBuilder builder = new StringBuilder(A);
        while (builder.length() <= 10000) {
            if (builder.toString().contains(B))
                return count;
            builder.append(A);
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();
        int i = repeatedStringMatch.repeatedStringMatch("abc", "cabcabca");
        System.out.println("i = " + i);
    }
}
