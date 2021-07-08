import java.util.*; 
import javax.swing.*;
import java.util.regex.*;


public class do_whilePassword {

        public static boolean passChecked(String choice){
            String regex = "^[A-Za-z]\\w{5,29}$"; //“^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$”
            //String regex2 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{1, 20}$";
    
            Pattern p = Pattern.compile(regex);
    
            if(choice == null){
                return false;
            }
            Matcher m = p.matcher(choice);
    
            return m.matches();
        } 
    public static void main(String[] args) {
        String choice = "";
        String choice1 = "";
        String choice2 = "";
        String newPassword = "";
        int count = 0;
        //PassCheck myObject = new PassCheck();
    

        String password = "John"; 
        do{
            
            count = count + 1;
            choice = JOptionPane.showInputDialog("Please enter password");
            choice1 = choice;

            if (password.equals(choice1) == false && count < 3){
                System.out.println(choice1 + " is incorrect try again.");
                // choice = JOptionPane.showInputDialog("Incorrect password. Please enter password");
                // choice1 = choice;
            }
            else if (count == 3){
                System.out.println("You have entered a wrong password 3 times, your password is " + password);
                choice2 = JOptionPane.showInputDialog("You have entered a wrong password 3 times, your password was " 
                                                        + password + ". Please enter a new password");
                newPassword = choice2;
                do{
                    System.out.println(choice2 + " does not meet requirements try again.");
                    choice2 = JOptionPane.showInputDialog("Password does not meet Requirements please try again");
                    newPassword = choice2;
                }while(passChecked(newPassword) == false);
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