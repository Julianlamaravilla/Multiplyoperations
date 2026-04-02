import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        try {

            boolean exit = false;
            do {
                System.out.println("Please enter a number : ");
                int num1 = s.nextInt();
                System.out.println("now, enter second one : ");
                int num2 = s.nextInt();
                System.out.println("Result : " + (num1*num2));
                System.out.println("Do you want exit?[Y/N] : ");
                String option = s.next();
                if (option.equalsIgnoreCase("y")){
                    exit = true;
                }

            } while(!exit);


        } catch(Exception e){
            System.out.println("Error :" + e);
        } finally {
            System.out.println("End process");
        }
    }
}