import static org.apache.commons.lang3.Validate.notNull;

public class Pacman {
    private int x;
    private int y;
    private int xMax;
    private int yMax;
    private int xMin;
    private int yMin;


    private String facing;

    public Pacman()
    {
        facing = "";
        x = 0;
        y = 0;
        yMax = 4;
        xMax = 4;
        yMin = 0;
        xMin = 0;
    }

    public Pacman(int inputX, int inputY, String pacmanFacing, int yMaxPos, int xMaxPos, int yMinPos, int xMinPos)
    {
        notNull(pacmanFacing);
        notNull(inputX);
        notNull(inputY);
        notNull(yMaxPos);
        notNull(xMaxPos);
        notNull(yMinPos);
        notNull(xMinPos);

        if ("".equals(pacmanFacing)){
            throw new IllegalArgumentException();
        }

        facing = pacmanFacing;
        x = inputX;
        y = inputY;

        yMax = yMaxPos;
        xMax = xMaxPos;
        yMin = yMinPos;
        xMin = xMinPos;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getxMax(){ return xMax;}

    public int getyMax(){return yMax;}

    public int getxMin() {return xMin;}

    public int getyMin() {return yMin;}

    public String getFacing()
    {
        return facing;
    }

    public void setX(int positionX)
    {
        notNull(positionX);
        if(positionX < 0 || positionX  > 4 ) {
            throw new IllegalArgumentException();
        }

        x = positionX;
    }

    public void setY(int positionY)
    {
        notNull(positionY);
        if(positionY < 0 || positionY  > 4 ) {
            throw new IllegalArgumentException();
        }

        y = positionY;
    }

    public void setxMax(int xMaxPos)
    {
        notNull(xMaxPos);
        if(xMaxPos < 0 || xMaxPos  > 4 ) {
            throw new IllegalArgumentException();
        }

        xMax = xMaxPos;
    }

    public void setyMax(int yMaxPos)
    {
        notNull(yMaxPos);
        if(yMaxPos < 0 || yMaxPos  > 4 ) {
            throw new IllegalArgumentException();
        }

        yMax = yMaxPos;
    }

    public void setxMin(int xMinPos)
    {
        notNull(xMinPos);
        if(xMinPos < 0 || xMinPos  > 4 ) {
            throw new IllegalArgumentException();
        }

        xMin = xMinPos;
    }

    public void setyMin(int yMinPos)
    {
        notNull(yMinPos);
        if(yMinPos < 0 || yMinPos  > 4 ) {
            throw new IllegalArgumentException();
        }

        yMin = yMinPos;
    }

    public void setFacing(String pacmanFacing)
    {
        notNull(pacmanFacing);

        if("".equalsIgnoreCase(pacmanFacing)){
            throw new IllegalArgumentException();
        }

        facing = pacmanFacing;
    }

    public void reportPosition()
    {
        System.out.println("\n\t ===>> Pacman's CURRENT Position : " + x + ", " + y + ", " + facing);
    }
}
