package Dz7.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int square = 0;
        while(l < r){
            int temp = 0;
            if(height[l] > height[r]){
                temp = Math.abs(l-r) * height[r];
                r--;
            }
            else{
                temp = Math.abs(l-r) * height[l];
                l++;
            }
            if(square < temp){
                square = temp;
            }
        }
        return square;
    }

    public static void main(String[] args){
        int[] num = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(num));
    }
}
