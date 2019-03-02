import java.util.Scanner;


public class Validation {
    public Validation()
    {

    }

    public boolean integerValidation(String input, int min, int max)
    {
        Scanner console = new Scanner(input);
        boolean value = false;
        int numberToCheck;

        if (console.hasNextInt())
        {
            numberToCheck = Integer.parseInt(input);
            if (numberToCheck <= max && numberToCheck >= min)
                value = true;
            else
            {
                System.out.println();
                System.out.println("\t\t!!ERROR : Invalid Input.Please enter a valid number (" + min + "-" + max +")");
                System.out.println();
                value = false;
            }
        }
        else
        {
            System.out.println();
            System.out.println("\t\t!!ERROR : Invalid Input.Please enter a valid number (" + min + "-" + max +")");
            System.out.println();
            value = false;
        }

        return value;
    }

    public boolean checkNoBlank(String word) {
        boolean value = true;

        if (word.length() > 0)
            value = true;
        else if (word.length() == 0) {
            System.out.println();
            System.out.println("\t\t!!ERROR : Invalid Input. Please do not enter a blank space");
            System.out.println();
            value = false;
        }
        return value;
    }
}
