package com.example;

public class CheckKthBitSetOrNot {
    public static void main(String[] args)
    {
        System.out.println(isKthSet(4,2));
        //printing the result
    }
    public static boolean isKthSet(int n,int k)
    {
        if((n&(1<<k))==0)
            return false;
        return true;
    }
}