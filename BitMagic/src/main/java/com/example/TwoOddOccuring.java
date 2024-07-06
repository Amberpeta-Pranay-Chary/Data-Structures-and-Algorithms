package com.example;

public class TwoOddOccuring {
    public static void main(String[] args) {
        int a[]=new int[]{3,4,3,4,5,4,4,6,7,7};
        int b[]=twoOddNum(a);
        System.out.println(b[0]+" "+b[1]);
    }
    public static int[] twoOddNum(int a[])
    {
        // code here
        int result=a[0];
        for(int i=1;i<a.length;i++)
        {
            result=result^a[i];
        }

        int res=0,res2=0;
        int k=(result&(~(result-1)));
        for(int i=0;i<a.length;i++)
        {
            if((a[i]&k)==0)
                res=res^a[i];
            else
                res2=res2^a[i];
        }
        return new int[]{res,res2};
    }
}
