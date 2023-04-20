package Dz7.HashTable;
import java.util.Hashtable;
import java.util.Set;

public class Solution {
    public static String intToRoman(int num) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"I");
        hashtable.put(4,"IV");
        hashtable.put(5,"V");
        hashtable.put(9,"IX");
        hashtable.put(10,"X");
        hashtable.put(40,"XL");
        hashtable.put(50,"L");
        hashtable.put(90,"XC");
        hashtable.put(100,"C");
        hashtable.put(400,"CD");
        hashtable.put(500,"D");
        hashtable.put(900,"CM");
        hashtable.put(1000,"M");

        if(hashtable.containsKey(num)){
            return hashtable.get(num);
        }
        else{
            String n = String.valueOf(num);
            String res = "";
            Set<Integer> keys = hashtable.keySet();
            boolean check = true;
            while(check){
                int max = 0;
                for(Integer i : keys){
                    if(i <= num && i > max){
                        max = i;
                    }
                }
                res+=hashtable.get(max);
                num-=max;
                if(num == 0){
                    check = false;
                }
            }
            return res;
        }
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(5));
        System.out.println(intToRoman(17));
        System.out.println(intToRoman(28));
        System.out.println(intToRoman(44));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}
