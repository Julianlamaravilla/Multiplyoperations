import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //initialized scanner object
        //Scanner s = new Scanner(System.in);


        // try-catch structure
        try {

            // do-while control variable
            boolean exit = false;
            do {
                // logic
                int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number : "));
                int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"now, enter second one : "));
                JOptionPane.showMessageDialog(null, "Result : " + (num1*num2));
                String option = JOptionPane.showInputDialog(null,"Do you want exit?[Y/N] : " );

                // if the user wants exit, select "y" end the variable exit going to be true
                if (option.equalsIgnoreCase("y")){
                    exit = true;
                }
            } while(!exit);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error :" + e);

        } finally {
            // final message
            JOptionPane.showMessageDialog(null, "End process");
        }
    }
}