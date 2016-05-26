/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancalculator;

import java.math.BigDecimal;
import java.math.MathContext;
import javax.swing.JOptionPane;

/**
 *
 * @author bowmanFS
 */
public class LoanCalc {
    
    private static double principal;
    private static double remainingPrincipal;
    private static double rate;
    private static int numPeriods;
    private static int periodNumber = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        promptUser();
        calculate();
    }

    private static void promptUser() {
        //get input from user
        // Get the starting amount
        principal = Double.parseDouble(JOptionPane.showInputDialog("Enter the starting amount"));
        // get the rate per period
        rate = Double.parseDouble(JOptionPane.showInputDialog("Enter rate per period"));
        // get the number of periods
        numPeriods = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of periods"));
        
    }

    private static void calculate() {
        //calculate and display new balance for each period
        for (periodNumber = 1; periodNumber <= numPeriods; periodNumber++ ){
            double interest = principal * rate;
            principal = (principal * rate) + principal;
            String update = "For period " + periodNumber + " interest earned = " +
                    interest + ". The new principal = "+ principal; 
            System.out.println(update);
        }
    }
    
}
