// { Driver Code Starts
// initial template for Java
//https://practice.geeksforgeeks.org/problems/red-or-green5711/1

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.RedOrGreen(N, S));
        }
    }
}// } Driver Code Ends


//User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        int g=0;
        for( int i=0;i<S.length();i++){
            if(S.charAt(i)=='G'){
                g++;
            }
        }
        int r=N-g;
        return Math.min(g,r);
    }
}
