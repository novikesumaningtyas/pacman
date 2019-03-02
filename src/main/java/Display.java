public class Display {
    public Display()
    {

    }

    public void printMenu()
    {
        System.out.println("\n=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("||         WELCOME TO PACMAN SIMULATOR          ||");
        System.out.println("==================================================");
        System.out.println("|\t(1) Place Pacman                             |" +
                "\n|\t(2) Move                                     |" +
                "\n|\t(3) Left                                     |" +
                "\n|\t(4) Right                                    |" +
                "\n|\t(5) Report                                   |" +
                "\n|\t(6) Help                                     |" +
                "\n|\t(7) Exit Simulator                           |");
        System.out.println("==================================================");
        System.out.print("Please choose the command : ");
    }


    public void startDisplay()
    {
        System.out.println("\n=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("||         WELCOME TO PACMAN SIMULATOR          ||");
        System.out.println("==================================================");
        System.out.println("|\t(1) Place Pacman                             |" +
                "\n|\t(2) Help                                     |" +
                "\n|\t(3) Exit Simulator                           |");
        System.out.println("==================================================");
        System.out.print("Please choose the command : ");
    }


    public void printHelp()
    {
        System.out.println();
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::SIMULATOR HELP:::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("DESCRIPTION");
        System.out.println("The application is a simulation of Pacman moving on in a grid, of dimensions 5 units x 5 units.");
        System.out.println("There are no other obstructions on the grid.");
        System.out.println("Pacman is free to roam around the surface of the grid, but must be prevented from moving off the grid.");
        System.out.println("Any movement that would result in Pacman moving off the grid must be prevented,");
        System.out.println("however further valid movement commands must still be allowed.");
        System.out.println("You will have 7 (seven) commands in this simulator : PLACE PACMAN, MOVE, LEFT, RIGHT, REPORT, HELP, EXIT SIMULATOR");
        System.out.println("PLACE will put the Pacman on the grid in position X,Y and facing NORTH,SOUTH, EAST or WEST.");
        System.out.println("The origin (0,0) can be considered the SOUTH WEST most corner.");
        System.out.println("The MINIMUM coordinate is (0,0) and the MAXIMUM is (4,4), the grid dimensions 5x5 units which start from 0 ");
        System.out.println("MOVE will move Pacman one unit forward in the direction it is currently facing.");
        System.out.println("LEFT and RIGHT will rotate Pacman 90 degrees in the specified direction without changing the position of Pacman.");
        System.out.println("REPORT will announce the X,Y and F of Pacman.");

        System.out.println();
        System.out.println("HOW TO USE THE PACMAN SIMULATOR");
        System.out.println("1. PLACE Pacman by choosing option (1) in the simulator menu");
        System.out.println("2. Set X and Y coordinate for placing Pacman following by facing direction of Pacman");
        System.out.println("3. Choose MOVE to move Pacman around the grid");
        System.out.println("4. Choose LEFT/RIGHT to change facing direction of Pacman");
        System.out.println("5. Choose REPORT to see Pacman current position");
        System.out.println("6. Choose Help to see the guidance for simulator");
        System.out.println("7. Choose Exit Simulator to exit the simulator");
        System.out.println();
        System.out.println("Have fun and enjoy the Pacman Simulator!");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();
    }

    public void facingDirection()
    {
        System.out.println("\n\t\t::::::::::::::::::::::::::");
        System.out.println("\t\t| Select Options Below : |");
        System.out.println("\t\t::::::::::::::::::::::::::");
        System.out.println("\t\t|  [1] NORTH             |");
        System.out.println("\t\t|  [2] EAST              |");
        System.out.println("\t\t|  [3] SOUTH             |");
        System.out.println("\t\t|  [4] WEST              |");
        System.out.println("\t\t==========================");
        System.out.print("\tPlease choose Pacman's facing direction (1-4) : ");
    }

    public void warningOffGrid()
    {
        System.out.println("\n\t WARNING: You can't move further than this");
    }

}
