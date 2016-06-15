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
public class GUIATM extends chooseAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;

        accounts s = new accounts();
        choice =1;
        /*String option = JOptionPane.showInputDialog("Welcome Customer\n What would you like to do today?\n"
                + "1. Open Account  \t 2. Deposit\n"
                + "3. Withdraw    \t4. Check Balance\n"
                + "\n\n press -1 to quit\n");
        choice = Integer.parseInt(option);*/
        while (choice != -1){
          String  option = JOptionPane.showInputDialog("Welcome Customer\n What would you like to do today?\n"
                + "1. Open Account \t 2. Deposit\n"
                + "3. Withdraw    \t4. Check Balance\n"
                + "\n\n press -1 to quit\n");
            choice = Integer.parseInt(option);
            switch(choice){
                case 1:{
                    String initDeposit = JOptionPane.showInputDialog(choose());
                    int options = Integer.parseInt(initDeposit);
                    s.openAccount(options);
                    JOptionPane.showMessageDialog(null,"Account Successfully Opened");
                }
                break;
                case 2:{
                    String initDeposit = JOptionPane.showInputDialog("Select the Amount to Deposit\n"
                            + "1. $200  2. $500"
                            + "3. $1000 4. $2000");
                    int options = Integer.parseInt(initDeposit);
                    s.deposit(options);
                }
                break;
                case 3:{
                    String withdraw = JOptionPane.showInputDialog("Select the Amount to Deposit\n"
                            + "1. $200  2. $500"
                            + "3. $1000 4. $2000");
                    int options = Integer.parseInt(withdraw);
                    s.withdraw(options);
                }
                break;
                    
                case 4:{
                    s.checkBalance();
                }
                break;
                default:{
                    option = JOptionPane.showInputDialog("press -1 again to quit \n");
                choice = Integer.parseInt(option);
                }
                    
            }
        }
        JOptionPane.showMessageDialog(null,"Thank You for Banking with us");
        System.exit(0);
    }
    
}
