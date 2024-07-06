package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetUsingBitMagic {
    public static void main(String[] args) {
        System.out.println(AllPossibleStrings("abc"));
    }
    public static List<String> AllPossibleStrings(String s)
    {
        // Code here
        int k=1<<s.length();
        int n=s.length();
        List<String> L=new ArrayList<>();
        for(int i=1;i<k;i++)
        {
            String res="";

            for(int j=0;j<n;j++)
            {
                if((i&1<<j)!=0)
                {
                    res=res+Character.toString(s.charAt(j));
                }
            }
            L.add(res);
        }
        Collections.sort(L);
        return L;
    }
}
