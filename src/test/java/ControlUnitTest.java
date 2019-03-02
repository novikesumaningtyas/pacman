import org.apache.commons.lang3.ObjectUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class ControlUnitTest {
    Control control;
    Pacman pacman;


    @Before
    public void localSetUp() throws Exception{
        control = new Control();
        pacman = new Pacman();
    }

    @Test
    public void testTurnLeft(){
        pacman.setFacing("NORTH");

        control.turnLeft(pacman);
        String facing = pacman.getFacing();

        assertEquals("Should be WEST direction", "WEST", facing);
    }

    @Test
    public void testTurnRight(){
        pacman.setFacing("NORTH");

        control.turnRight(pacman);
        String facing = pacman.getFacing();

        assertEquals("Should be EAST direction", "EAST", facing);
    }

    @Test
    public void testMove(){
        pacman.setX(1);
        pacman.setFacing("EAST");

        control.move(pacman);

        assertEquals("X coordinate should be 2", 2, pacman.getX());
    }

    @Test
    public void testLeftAndMove(){
        //Example 3 Case

        pacman.setX(1);
        pacman.setY(2);
        pacman.setFacing("EAST");
        control.move(pacman);
        control.move(pacman);
        control.turnLeft(pacman);
        control.move(pacman);

        assertEquals("X coordinate should be 3", 3, pacman.getX());
        assertEquals("Y coordinate should be 3", 3, pacman.getY());
        assertEquals("Pacman should be facing to North", "NORTH", pacman.getFacing());
    }


}
