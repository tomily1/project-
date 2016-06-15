/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiatm;
import javax.swing.JOptionPane; 
/**
 *
 * @author ZION
 */
public class accounts extends chooseAccount{
    
    private double Balance = 100;

    public void openAccount(int choice) {
        if (choice == 1){
            Balance += 500;
        }
        if (choice == 2){
            Balance += 1000;
        }
    }

   public void deposit(int cash) {
        switch (cash) {
            case 1:
                Balance += 200;
                JOptionPane.showMessageDialog(null,"You successfully added $200 to your Account");
                break;
            case 2:
                Balance += 500;
                JOptionPane.showMessageDialog(null,"You successfully added $500 to your Account");
                break;
            case 3:
                Balance += 1000;
                JOptionPane.showMessageDialog(null,"You successfully added $1000 to your Account");
                break;
            case 4:
                Balance += 2000;
                JOptionPane.showMessageDialog(null,"You successfully added $2000 to your Account");
                break;
            default:
                JOptionPane.showMessageDialog(null,"invalid transaction!, Please try again");
                break;
        }
    }

    public void withdraw(int withdraw) {
        if (Balance>100){
         switch (withdraw) {
            case 1:
                Balance -= 200;
                JOptionPane.showMessageDialog(null,"You successfully withdraw $200 from your Account");
                break;
            case 2:
                Balance -= 500;
                JOptionPane.showMessageDialog(null,"You successfully withdraw $500 from your Account");
                break;
            case 3:
                Balance -= 1000;
                JOptionPane.showMessageDialog(null,"You successfully withdraw $1000 from your Account");
                break;
            case 4:
                Balance -= 2000;
                JOptionPane.showMessageDialog(null,"You successfully withdraw $2000 from your Account");
                break;
            default:
                JOptionPane.showMessageDialog(null,"invalid transaction!, Please try again");
                break;
        }
        }
        else
            JOptionPane.showMessageDialog(null,"invalid transaction!\nInsufficient Balance\nPlease Check your Account Balance");
    }

    protected String checkBalances() {
       return String.format("Your Account Balance is %.2f\nYour Ledger Balance is %.2f",Balance-100, Balance);
    }
    public void checkBalance(){
        JOptionPane.showMessageDialog(null, checkBalances());
    
}
}