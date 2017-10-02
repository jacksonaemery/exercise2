/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;
import java.util.Scanner;
/**
 *
 * @author Jackson
 */
public class PizzaCost {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter the diameter of the pizza in inches: ");
        double d = reader.nextFloat();
        double c = 1.75+.05*d*d;
        
        System.out.println("The cost of making the pizza is: $" + c );
    }
    
    
}

