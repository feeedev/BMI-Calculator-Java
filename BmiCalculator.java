import java.util.Scanner;
import javax.swing.*;
import java.lang.*;
import java.text.*;

class BmiCalculator 
{
    public static void main(String args[]) 
    {
        String name, lastName;
        Double weight, height, bmi;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("********* BMI Calculator *********");
        
        System.out.print("Enter first name : ");
        name = sc.next();
        sb.append(name);
        
        System.out.print("Enter last name : ");
        lastName = sc.next();
        sb.append(" "+lastName);
        
        System.out.print("Enter your weight (kg.) : ");
        weight = sc.nextDouble();
        
        System.out.print("Enter your height (cm.) : ");
        height = sc.nextDouble();
        
        bmi = weight / Math.pow((height/100), 2);
        
        System.out.println("************* Result *************");
        System.out.println(sb + "'s BMI is " + df.format(bmi));
        System.out.println("**********************************");
    }
}