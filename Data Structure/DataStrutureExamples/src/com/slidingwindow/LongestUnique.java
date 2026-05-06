package com.slidingwindow;

class LongestUnique {
    public static void main(String[] args) {
        String s = "abcacbb";

        boolean[] seen = new boolean[256];

        int left = 0, max = 0;

        for(int right=0; right<s.length(); right++){

            while(seen[s.charAt(right)]){
                seen[s.charAt(left)] = false;
                left++;
            }

            seen[s.charAt(right)] = true;

            max = Math.max(max, right-left+1);
        }

        System.out.println(max);
    }
}

