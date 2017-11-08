package com.tengyun.wan.test.helloworld;

import com.huawei.jaguar.ereading.up.business.domain.utils.CustomThreadService;

public class A
{
    
    public static void main(String[] args)
    {
        CustomThreadService.getInstance().execute(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                    System.out.println("起一个异步线程，睡5秒。");
                }
                catch (Exception e)
                {
                    // TODO: handle exception
                }
            }
        });
        
        System.out.println("main方法。");
    }
    
    B b;
    
    public B getB()
    {
        return b;
    }
    
    public void setB(B b)
    {
        this.b = b;
    }
    
    @Override
    public String toString()
    {
        return "A [b=" + b + "]";
    }
}
