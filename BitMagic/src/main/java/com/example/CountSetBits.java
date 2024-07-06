package com.example;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(getCount(5));
    }
    public static int getCount(int n)
    {
        //Here we are using Brain Kerningam's Algorithm
        //where it defines the n-1 will have all the trailing 0's of n becomes 1 and the last set bit of 1 will become 0
        //if n=1010100 then n-1=1010011 and will make & operating to get the count
        int c=0;
        while(n>0)
        {
            c++;
            n=(n&(n-1));
        }
        return c;
    }
}
