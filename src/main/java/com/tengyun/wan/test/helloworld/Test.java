package com.tengyun.wan.test.helloworld;

public class Test
{
    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a);
        B b = new B();
        a.setB(b);
        System.out.println(a);
        C c = new C();
        b.setC(c);
        System.out.println(a);
        c.setName("d");
        System.out.println(a);
    }
}
