package method;


import java.util.Scanner;

public class Method_Learning {
    static String compname;
    static String streetadd;
    static String city;
    static String state;
    static int annualprofit;
    static int landvalue;
    static int storevalue;
    public static void main(String[] args){
        getname("Tomal","Dhaka",31);
        Method_Learning obj = new Method_Learning();
        obj.getage(10);
        System.out.println("*************");
        getdetails("tomal","salim","mony");
 String name1;
 String name2;
 Method_Learning.inprogram();
    }
    public static void getname(String name,String city,int age){
        System.out.println("My Nmae is-"+name);
        System.out.println("I live in-"+city);
        System.out.println("My age is-"+age);
    }
    public int getage(int num3){
       int num1=4;
       int num2=8;
       int age = num1*num2;
        System.out.println("my age-"+age++);
        System.out.println("age after one years-"+age++);
        System.out.println("age after two year"+age);
        System.out.println("the value for number3 is -"+(num3-=age));
        return num3;
    }
    public static String getdetails(String name,String fn,String mn){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name-");
        String name16= input.nextLine();
        System.out.println("Fathers name -");
        String name11=input.nextLine();
        System.out.println("Mothers name-");
        String name4 = input.nextLine();
return name;
    }
    public static void inprogram(){
       Scanner into =new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("Welcome to CNS");
        System.out.println("Company detail is below");
        System.out.println("Company name-");
        String compname= into.nextLine();
        System.out.println("Street address-");
        String streetadd= into.nextLine();
        System.out.println("City-");
        String city= into.nextLine();
        System.out.println("State-");
        String state= into.nextLine();
        System.out.println("Annual profit 2020-");
        double annualprofit= into.nextDouble();
        System.out.println("land value-");
        double landvalue=into.nextDouble();
        System.out.println("Store value-");
        double storev=into.nextDouble();
        double total=landvalue+storev;
        System.out.println("Total for purchasing SN Trading-"+total);
        System.out.println("Congratulation for purchasing this property");
        System.out.println("***************************");


    }
}
