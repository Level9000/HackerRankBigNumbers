package bignumbers;

/*
 * In this problem, you have to add and multiply huge numbers! 
 * These numbers are so big that you can't contain them in any ordinary data types like a long integer.
 * Use the power of Java's BigInteger class and solve this problem.
 */

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        BigInteger bi1, bi2, bi3, bi4;
        
        Scanner sc = new Scanner(System.in);
        bi1 = new BigInteger(sc.next());
        bi2 = new BigInteger(sc.next());
        
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(bi3);
        System.out.println(bi4);
    }
}