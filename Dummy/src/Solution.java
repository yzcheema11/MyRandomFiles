import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    static int countPalindromes(String s) {
        int count = 0;
        for(int i = 0; i <= s.length(); i++) {
            for(int j = s.length() - 1; j >= i; j--) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPalindrome (String s){
        StringBuilder sb = new StringBuilder (s);
        String reversed = sb.reverse().toString();
        return reversed.equals(s);
    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        String s;
        try {
            s = in.nextLine();
        } catch (Exception e) {
            s = null;
        }

        res = countPalindromes(s);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
