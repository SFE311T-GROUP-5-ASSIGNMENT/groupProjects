import java.util.*; 
import javax.swing.*;
import java.util.regex.*;

public class do_whilePassword {
        public static boolean passChecked(String userInput){
            String regex = "^[A-Za-z_]\\w{1,20}$";
            Pattern p = Pattern.compile(regex);
            if(userInput == null){
                return false;
            }
            Matcher m = p.matcher(userInput);
            return m.matches();
        } 
    public static void main(String[] args) {
        String choice = "";
        String choice1 = "";
        String choice2 = "";
        String choice3 = "";
        String newPassword= "";
        String password = "John"; 
        int count = 0; 
        
        do{
            count = count + 1;
            choice = JOptionPane.showInputDialog("Please enter password");
            choice1 = choice;

            if (password.equals(choice1) == false && count < 3){
                System.out.println(choice1 + " is incorrect try again.");   
            }
            else if (count == 3){
                System.out.println("You have entered a wrong password 3 times, your password is " + password);
                choice2 = JOptionPane.showInputDialog("You have entered a wrong password 3 times, your password was " 
                                                        + password + ". Please enter a new password");
                newPassword = choice2;
                if(passChecked(newPassword) == false){
                    do{
                        System.out.println(newPassword + " does not meet requirements try again.");
                        choice3 = JOptionPane.showInputDialog("Password does not meet Requirements please try again");
                        newPassword = choice3; 
                    }while(passChecked(newPassword) == false);
                }
                break;
            }
        }while(password.equals(choice1) == false);
        if(choice1.equals(password)){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Password change was successful");
        }  
    }
}