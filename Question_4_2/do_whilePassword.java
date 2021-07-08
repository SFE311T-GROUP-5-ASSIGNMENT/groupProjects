import java.util.*; 
import javax.swing.*;

public class do_whilePassword {
    public static void main(String[] args) {
        String choice = "";
        String choice1 = "";
        int count = 0;
        String password = "John"; 
        do{
            
            count = count + 1;
            choice = JOptionPane.showInputDialog("Please enter password");
            choice1 = choice;

            if (password.equals(choice1) == false && count < 3){
                System.out.println(choice1 + " is incorrect try again.");
                //JOptionPane.showInputDialog("Incorrect passord. Please enter password");
                //choice1 = choice;
            }
            else if (count == 3){
                System.out.println("You have entered a wrong password 3 times, your password is " + password);
                choice = JOptionPane.showInputDialog("You have entered a wrong password 3 times, your password was " + password + ". Please enter a new password");
                break;
            }
        }while(password.equals(choice1)==false);

        if(choice1.equals(password)){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Password Changed");
        }
        
    }
}