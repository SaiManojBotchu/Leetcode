class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(char c : n.toCharArray()) {
            int ch = c - '0';
            if (ch > max) max = ch;
        }
        return max;
    }
}

/* 
logic: 
-> we have to return the highest digit in the number because we have to use 0 & 1 only, 
   and whichever index has the high digit has to get that many number of 1's
eg: "32"  1 0
          1 1
          1 1
-> as you can see in the above example our highest digit is 3,
   and inorder to get 32 we have use to 3 (1's). so the minimum no. of numbers needed = 3
*/
