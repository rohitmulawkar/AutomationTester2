package ConstructorPractice;

public class RunnerClass extends LoginClass{
    public static void main(String[] args) {
        LoginClass l1= new LoginClass();
        l1.display();
        LoginClass l2= new LoginClass("Rohit", "Rakesh");
        l2.display();
        LoginClass l3= new LoginClass(997454);
        l3.display();
}}
