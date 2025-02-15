package custom_exception;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class UserDefinedException {

    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is Valid");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Invalid input!Please enter a valid number");
        }finally {
            sc.close();
        }
    }
}
