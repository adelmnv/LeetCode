package Dz10.Ex1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int op = in.nextInt();
            int n = in.nextInt();
            if(op == 1){
               PerformOperation p = isOdd();
               System.out.println(p.check(n)?"ODD":"EVEN");
            }
            else if(op ==2){
                PerformOperation p = isPrime();
                System.out.println(p.check(n)?"PRIME":"COMPOSITE");
            }
            else if(op ==3){
                PerformOperation p = isPalindrome();
                System.out.println(p.check(n)?"PALINDROME":"NOT PALINDROME");
            }
            t--;
        }
    }
    public static PerformOperation isOdd(){
        return a->(a%2!=0)?true:false;
    }

    public static PerformOperation isPrime(){
        return a->{
            for(int i=2; i < a;i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome(){
        return a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString())?true:false;
    }
}

interface PerformOperation{
    boolean check(int n);
}
