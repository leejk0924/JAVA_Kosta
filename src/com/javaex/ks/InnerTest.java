package com.javaex.ks;
class AAA{
    static int a = 100;
    class BBB{
        void method(){
            System.out.println("내부 클래스"+a);
        }
    }

    public static void main(String[] args) {
        AAA a = new AAA();
        AAA.BBB c = a.new BBB();
        c.method();

    }
}

