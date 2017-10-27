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
        /*// Math中的函数和常量
        System.out.println("π is: " + Math.PI);
        System.out.println("e is: " + Math.E);
        System.out.println("返回两个值中较大的一个： " + Math.max(2, 5));
        System.out.println("平方根： " + Math.sqrt(4));*/
        
        Long cl = System.currentTimeMillis();
        System.out.println(cl);
        String sl = cl.toString();
        System.out.println(sl);
        System.out.println(sl.substring(sl.length() - 3));
        
        /*// getClass().getSimpleName()方法返回值
        RedisTest rt = new RedisTest();
        System.out.println(rt.getClass().getSimpleName());*/
        
    }
}
