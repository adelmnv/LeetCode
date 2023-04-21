package Dz8.Dequeue;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> uniqe = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            uniqe.add(num);
            if(deque.size() == m){
                if(max < uniqe.size()){
                    max = uniqe.size();
                }
                int temp = (int)deque.remove();
                if(!deque.contains(temp)){
                    uniqe.remove(temp);
                }
            }
        }
        System.out.println(max);

    }
}

