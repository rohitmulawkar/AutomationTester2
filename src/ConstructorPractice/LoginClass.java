package ConstructorPractice;
import java.sql.SQLOutput;
import java.util.*;
public class LoginClass {
    String username ;
    String password;
    int number;
//Scanner scanner= new Scanner(System.in);
    LoginClass(){
        username="unkown";
        password="forgotten";
        number = 1;

    }
    //Constructor Overloading
    LoginClass(String username, String password){
        this.username= username;
        this.password=password;
        /*System.out.println("Please enter username");
    username=scanner.next();
        System.out.println("Please enter password");
        pass=scanner.next();*/
    }
    LoginClass(int number){
        this.number=number;

    }
void display(){
    System.out.println(username);
    System.out.println(password);
    System.out.println(number);
}


}
