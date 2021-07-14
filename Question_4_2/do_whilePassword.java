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
        String user_input = "";
        String newPassword= "";
        String password = "John"; 
        int count = 0; 

        do{
            count = count + 1;
            if(count == 1){
                user_input = JOptionPane.showInputDialog("Please enter password");
            }
            if (password.equals(user_input) == false && count < 3){
                user_input = JOptionPane.showInputDialog("Password is incorrect please enter password");
            }
            else if (count == 3){
                user_input = JOptionPane.showInputDialog("You have entered a wrong password 3 times, your password was " 
                                                        + password + ". Please enter a new password");
                newPassword = user_input;
                if(passChecked(newPassword) == false){
                    do{
                        user_input = JOptionPane.showInputDialog("Password does not meet Requirements please try again");
                        newPassword = user_input; 
                    }while(passChecked(newPassword) == false);
                }
                break;
            } 
        }while(password.equals(user_input) == false);
        if(user_input.equals(password)){
            JOptionPane.showMessageDialog(null, "Access Granted");
        }
        else{
            JOptionPane.showMessageDialog(null, "Password change was successful");
            password = newPassword;
        }  
    }
}