package conditions;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        If_Else obj = new If_Else();
//        obj.VoterInfo();
        obj.walmart();
    }
    public void VoterInfo(){
        System.out.println("Welcome to voting Line 2021");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = input.nextLine();
        System.out.println("Enter Your Age");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("You are Eligible For Vote 2021");
        }else {
            System.out.println("You are not Eligible for vote 2021");
        }
        System.out.println("****************");
        System.out.println("Thank You");
    }
    public void walmart(){
       Scanner in = new Scanner(System.in);
        System.out.println("Walmart Official");
        System.out.println("Your order list is below");
        System.out.println("Pampers" + "Whips");
        System.out.println("Please enter your payment method");
        String paymentby=in.nextLine();

            System.out.println("Enter your card information");

        long card=in.nextLong();
        if (card==4207670250539460l){
            System.out.println("Enter your cc");
        }else {
            System.out.println("Sorry your information is incorrect");
        }
        int cc =in.nextInt();
        if (cc==943){
            System.out.println("Thank you for your order");
        }else {
            System.out.println("Sorry your information is incorrect");
        }
        System.out.println("Thank you for Shopping Walmart.com");

    }
}
