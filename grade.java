
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        int English,Maths,Physics,Chemistry,Computer_science;
        double avg;
        String name;
        int roll;

        Scanner my=new Scanner(System.in);
        System.out.println("Enter name of the canditate : ");
        name = my.nextLine();
m
        System.out.println("Enter the roll number :");
        roll=my.nextInt();

        System.out.println("ENTER ENGLISH MARK: ");
        English=my.nextInt();

        System.out.println("ENTER MATHS MARK: ");
        Maths =my.nextInt();

        System.out.println("ENTER PHYSICS MARK: ");
        Physics =my.nextInt();

        System.out.println("ENTER CHEMISTRY MARK: ");
        Chemistry=my.nextInt();

        System.out.println("ENTER COMPUTER_SCIENCE MARK: ");
        Computer_science=my.nextInt();

        int Total=English+Maths+Physics+Chemistry+Computer_science; 
        avg=(English+Maths+Physics+Chemistry+Computer_science)/5;

        System.out.println("NAME OF THE CANDITATE      :  "+  name);
        System.out.println("ROLL NUMBER OF CANDITATE   :  "+  roll);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("TOTAL MARKS OBTAINED IS    :  "+  Total);
        System.out.println("AVERAGE PERCENTAGE IS      :  "+  avg);
        
        if(avg>=90)
        {
            System.out.println("GRADE O");
        }
        else if(avg>=80)
        {
            System.out.println("GRADE A");
        }
        else if(avg>=70)
        {
            System.out.println("GRADE B");
        }
        else if(avg>=60)
        {
            System.out.println("GRADE C");
        }
        else if(avg>=40)
        {
            System.out.println("GRADE D");
        }
        else
        {
            System.out.println("FAIL");
        }






    }
    
}
