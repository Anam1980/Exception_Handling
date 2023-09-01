package org.example;

public class Main {
    public static void main(String[] args) {

//        int[]arr = {1,2,3,4};
//
//        try{
//            int a=5/0;
//
//            System.out.println(arr[4]);
//
//        }
//        catch(ArithmeticException e){
//            System.out.println("Exception");
//        }
//        //as parent class is before this can never execute
//        //catch(ArithmeticException e){
//
//        //}
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("It is index out of bound"+e.getMessage());
//        }
//
//        //finally always execute
//        finally{
//            System.out.println("I am permanent");
//        }
//
//        System.out.println("I am out");


        //How to use throw to make custom exceptions:--->

        int age = 12;

        try {
            if (checkAge(age)) {
                //custom exception which I created
                //throws new UnderAgeException
                System.out.println("Congrats");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Good");

        int[]arr = {1,2,3,4};

        try{
            int a=5/0;

            System.out.println(arr[4]);

        }
        catch(NullPointerException e){
            System.out.println("Exception"+e.getMessage());
        }
        //not printed because exception is wrong
        System.out.println("I am here");

    }
    public static boolean checkAge(int age) throws ArithmeticException, UnderAgeException{
        try {
            if (age<18) {
                //custom exception which I created
                throw new UnderAgeException("Called in Child");
//                System.out.println("I am OK");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  true;
    }




}