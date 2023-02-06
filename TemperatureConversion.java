package com.logicalProgramming;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Fahrenheit to celsius(1) or celsius to fahrenheit (2)");
        int result=scanner.nextInt();
        if (result == 1) {
            //calculate fahrenheit to celsius
            System.out.println("fahrenheit to celsius");
            System.out.println("enter fahrenheit value : ");
            double value =scanner.nextDouble();
            double valueFinal=(value-32)*5/9;//formula
            System.out.println("celsius is : ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);
        }
        else if(result==2) {
            //  calculate celsius to fahrenheit
            System.out.println("celsius to fahrenheit");
            System.out.println("enter celsius value : ");
            double value2 =scanner.nextDouble();
            double valueFinal=value2*1.8+32;//formula
            System.out.println("celsius is : ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);
        }
        else{
           // any number that is not 1 or 2
            System.out.println("not a valid choice");
        }

    }
}
