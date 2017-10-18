package com.tengyun.wan.test.helloworld;

import java.util.Date;
import java.util.UUID;

public class StringUtilsAdam
{
    public static String getSpecialLengthNumber(int length)
    {
        StringBuilder s = new StringBuilder();
        s.append(1);
        return null;
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("π is: " + Math.PI);
        System.out.println("e is: " + Math.E);
        System.out.println("返回两个值中较大的一个： " + Math.max(2, 5));
        System.out.println(Math.sqrt(5));
        
        
        /*Random r = new Random(); double d = (1 + r.nextDouble()) *
         * Math.pow(10, 3); String s = String.valueOf(d).substring(1, 3-1);
         * System.out.println(s);
         */
        long l = new Date().getTime();
        System.out.println(String.valueOf(l));
        
        
        
    }
}
