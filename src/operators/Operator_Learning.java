package operators;

import javax.lang.model.util.ElementScanner6;

public class Operator_Learning {
    public static void main(String[] args) {
        Operator_Learning.getValue();
        Operator_Learning.ConditionalOPT();
        Operator_Learning.unaryOPT();
    }
    public static void getValue(){
        int numb1=10;
        int numb2=20;
        int edition=numb1+numb2;
        int subtraction= numb1-numb2;
        int multiplication=numb1*numb2;
        int division = numb1/numb2;
        int remainder= numb1%numb2;
        System.out.println("Edition value-"+edition);
        System.out.println("Subtraction value-"+subtraction);
        System.out.println("Multiplication value-"+multiplication);
        System.out.println("Division value-"+division);
        System.out.println("Remainder value-"+remainder);
    }
    public static void ConditionalOPT(){
        int number1=12;
        int number2=5;
        int number3=3;
        int number4=8;
        if (number1>=number2 && number3<=number4){

            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }if (number1<=number3 || number2<number4){
            System.out.println("OUTPUT POSITIVE");
        }else{
            System.out.println("F");
        }


    }
    public static void unaryOPT(){
      int numb=10;
//     pre increment
    ++numb;
//    post increment
     numb++;
     numb++;
     numb++;
//      pre decrement
        --numb;
        --numb;
//         post decrement
        numb--;
        numb--;
        System.out.println("VALUE="+numb);

    }

}
