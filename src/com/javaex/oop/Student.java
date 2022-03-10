package com.javaex.oop;

public class Student extends Person{
    private String schoolName;

    public Student (){
        System.out.println("Student() 생성자 호출");
    }
    public Student(int age){
        this.setAge(age);
    }
    public Student(String schoolName) {
        System.out.println("student 생성자 호출");
        this.schoolName = schoolName;
    }


    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
        System.out.println("생성자 호출 : String name, int age, String schoolName");
    }

    public Student(String name, int age){
        super(name, age);
    }

    @Override
    void showInfo() {
        System.out.println("My name is " + this.getName() + ", and My age is " + this.getAge()+", and my school is "+this.schoolName);
    }
}
