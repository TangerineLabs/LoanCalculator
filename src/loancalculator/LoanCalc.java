/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancalculator;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author bowmanFS
 */
public class LoanCalc {
    
    private static BigDecimal principal;
    private static BigDecimal remainingPrincipal;
    private static double rate;
    private static int numPeriods;
    private static int periodNumber;

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
        String strPrincipal = JOptionPane.showInputDialog("Enter the starting amount");
        principal = new BigDecimal(strPrincipal);
        // get the rate per period
        rate = Double.parseDouble(JOptionPane.showInputDialog("Enter rate per period"));
        // get the number of periods
        numPeriods = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of periods"));
        
    }

    private static void calculate() {
        //TODO To change body of generated methods, choose Tools | Templates.
        
    }
    
}
