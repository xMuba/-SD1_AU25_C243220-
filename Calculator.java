/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author moon
 */
import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       System.out.println("What operation do you want to do?");
       String c= sc.next();
       sc.close();
       switch(c){
           case("+"):
               System.out.println(a+b);
               break;
           case("-"):
               System.out.println(a-b);
               break;
            case("*"):
                System.out.println(a*b);
                break;
            case("/"):
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operation");
       }
    }
    
}
