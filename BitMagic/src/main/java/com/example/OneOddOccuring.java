package com.example;

public class OneOddOccuring {
    public static void main(String[] args) {
        int a[]=new int[]{1,1,2,2,3,2,2,3,4};
        System.out.println(oddCount(a));
    }
    public static int oddCount(int a[])
    {
        int c=a[0];
        for(int i=1;i<a.length;i++)
        {
            c=c^a[i];
        }
        return c;
    }
}
