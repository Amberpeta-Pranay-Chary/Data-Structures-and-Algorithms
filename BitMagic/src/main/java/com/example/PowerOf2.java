package com.example;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(0));
    }
    public static boolean isPowerOf2(int n)
    {
        //Power of 2 will contain only one set bit in the number.
        int c=0;
        while(n>0)
        {
            c++;
            n=(n&(n-1));
            if(c>1)
                return false;
        }
        return true;
    }
}
