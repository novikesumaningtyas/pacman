import java.util.Scanner;

public class Control {
    private Validation validation;
    private Display display;

    public Control()
    {
        validation = new Validation();
        display = new Display();
    }


    public void startSimulator()
    {
        int option;
        Pacman pacman = new Pacman();

        do{
            display.startDisplay();
            Scanner console = new Scanner(System.in);
            while (true)
            {
                if (console.hasNextInt())
                {
                    option = console.nextInt();
                    break;
                }
                else
                    console.nextLine();

                System.out.println();
                System.out.println("\tERROR : Invalid Input. Please enter a valid number 1 - 3 ");
                System.out.println();
                display.startDisplay();
            }

            switch(option)
            {
                case 1:
                    createPacman(pacman);break;

                case 2:
                    display.printHelp();break;

                case 3:
                    exitSimulator();break;

                default:
                    System.out.println("\n\tERROR : Invalid Input. Please enter a valid number 1 - 3 \n ");
            }

        }while(true);


    }

    public void runningSimulator(Pacman pacman)
    {
        int option;

        do{
            display.printMenu();
            Scanner console = new Scanner(System.in);
            while (true)
            {
                if (console.hasNextInt())
                {
                    option = console.nextInt();
                    break;
                }
                else
                    console.nextLine();

                System.out.println();
                System.out.println("\tERROR : Invalid Input. Please enter a valid number 1 - 7 ");
                System.out.println();
                display.printMenu();
            }

            switch(option)
            {
                case 1:
                    createPacman(pacman);break;

                case 2:
                    move(pacman);break;

                case 3:
                    turnLeft(pacman);break;

                case 4:
                    turnRight(pacman);break;

                case 5:
                    displayReport(pacman);break;

                case 6:
                    display.printHelp();break;

                case 7:
                    exitSimulator();break;

                default:
                    System.out.println("\n\tERROR : Invalid Input. Please enter a valid number 1 - 7 \n ");
            }

        }while(true);
    }

    public int insertX()
    {
        boolean valid = false;
        String pos = "";
        Scanner console = new Scanner(System.in);

        while (!valid)
        {
            System.out.print("\t\tInsert Pacman's X position (0-4): ");
            pos = console.nextLine().trim();
            valid = validation.integerValidation(pos, 0, 4);
        }

        int xPos = Integer.parseInt(pos);

        return xPos;
    }

    public int insertY()
    {
        boolean valid = false;
        String pos = "";
        Scanner console = new Scanner(System.in);

        while (!valid)
        {
            System.out.print("\t\tInsert Pacman's Y position (0-4): ");
            pos = console.nextLine().trim();
            valid = validation.integerValidation(pos, 0, 4);
        }

        int yPos = Integer.parseInt(pos);

        return yPos;
    }

    public String insertFacing()
    {
        String facing = "";
        int answer = insertFacingDirection();

        if(answer == 1)
            facing = "NORTH";
        else
            if(answer == 2)
                facing = "EAST";
        else
            if(answer == 3)
                facing = "SOUTH";
        else
            if(answer == 4)
                facing = "WEST";

        return facing;
    }

    private int insertFacingDirection()
    {
        boolean valid = false;
        String answer = "";
        Scanner content = new Scanner(System.in);

        while (!valid)
        {
            display.facingDirection();
            answer = content.nextLine().trim();
            valid = validation.integerValidation(answer, 1, 4);
        }

        int ans = Integer.parseInt(answer);
        return ans;
    }

    public void createPacman(Pacman character)
    {
        int x;
        int y;
        String facing;

        x = insertX();
        y = insertY();
        facing = insertFacing();

        character.setX(x);
        character.setY(y);
        character.setFacing(facing);

        System.out.println();
        System.out.println("\t===>> PACMAN's Start Position : PLACE" + " " + x +", " + y +", " + facing );

        runningSimulator(character);
    }

    public void turnLeft(Pacman pacman)
    {
        String facing = pacman.getFacing();
        String change = "";

        if (facing.equalsIgnoreCase("east"))
            change = "NORTH";
        else
            if(facing.equalsIgnoreCase("north"))
                change = "WEST";
        else
            if(facing.equalsIgnoreCase("west"))
                change = "SOUTH";
        else
            if(facing.equalsIgnoreCase("south"))
                change = "EAST";

        pacman.setFacing(change);
        System.out.println("\n\t ===>> Pacman changes to the LEFT direction from " + facing + " to " + change);
    }

    public void turnRight(Pacman pacman)
    {
        String facing = pacman.getFacing();
        String change = "";

        if (facing.equalsIgnoreCase("east"))
            change = "SOUTH";
        else
        if(facing.equalsIgnoreCase("north"))
            change = "EAST";
        else
        if(facing.equalsIgnoreCase("west"))
            change = "NORTH";
        else
        if(facing.equalsIgnoreCase("south"))
            change = "WEST";

        pacman.setFacing(change);
        System.out.println("\n\t ===>> Pacman changes to the RIGHT direction from " + facing + " to " + change);
    }

    public void move(Pacman pacman)
    {
        int nextX;
        int nextY;

        int currentX = pacman.getX();
        int currentY = pacman.getY();
        String facing = pacman.getFacing();
        int xMax = pacman.getxMax();
        int yMax = pacman.getyMax();
        int xMin = pacman.getxMin();
        int yMin = pacman.getyMin();

        if(facing.equalsIgnoreCase("east")) {

            nextX = currentX + 1;
            if(nextX > xMax)
            {
                display.warningOffGrid();
                nextX = xMax;
            }
            else
                displayMove(pacman);

            pacman.setX(nextX);
        }

        else
            if(facing.equalsIgnoreCase("west")) {
                nextX = currentX - 1;
                if(nextX < xMin)
                {
                    display.warningOffGrid();
                    nextX = xMin;
                }
                else
                    displayMove(pacman);

                pacman.setX(nextX);
            }

        else
            if(facing.equalsIgnoreCase("north")) {
                nextY = currentY + 1;
                if(nextY > yMax)
                {
                    display.warningOffGrid();
                    nextY = yMax;
                }
                else
                    displayMove(pacman);

                pacman.setY(nextY);
            }
        else
            if(facing.equalsIgnoreCase("south")) {
                nextY = currentY - 1;
                if(nextY < yMin)
                {
                    display.warningOffGrid();
                    nextY = yMin;
                }
                else
                    displayMove(pacman);

                pacman.setY(nextY);
            }
    }

    public void displayMove(Pacman pacman)
    {
        System.out.println("\n\t ===>> Pacman moves ONE step forward to " + pacman.getFacing() + " direction");
    }

    public void displayReport(Pacman pacman)
    {
        pacman.reportPosition();
    }

    public void exitSimulator()
    {
        Scanner console = new Scanner(System.in);
        String decision = "";

        do
        {
            boolean valid = false;
            while (!valid)
            {
                System.out.print("\t\tAre you sure want to exit the simulator?(y/n) ");
                decision = console.nextLine().trim().toLowerCase();
                valid = validation.checkNoBlank(decision);
            }

            decision = decision.substring(0, 1);

            if (decision.equals("y"))
            {
                System.out.println("\t------** Thankyou for using Pacman Simulator **------");
                System.exit(0);
            }
            else
            if (decision.equals("n"))
                return;
            else
                System.out.println("Please enter your answer again (y/n) ");
        }while(!decision.equals("n") && !decision.equals("y"));
    }

}
