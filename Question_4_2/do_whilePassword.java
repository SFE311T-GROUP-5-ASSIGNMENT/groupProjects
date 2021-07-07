import java.util.*; 
import javax.swing.*;

public class do_whilePassword {
    public static void main(String[] args) {
        String choice =""; do{
            //System.out.println("Enter today's number from the menu"); there was no indenting choice has been properly indented into line 8  
        choice = JOptionPane.showInputDialog("Please enter in a password");
        }while(choice != "John");} //Extra curly brace deleted
}