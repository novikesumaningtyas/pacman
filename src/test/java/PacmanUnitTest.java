
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PacmanUnitTest {
    Pacman pacman;

    @Before
    public void localSetUp() throws Exception{
        pacman = new Pacman();
    }

    @Test(expected = NullPointerException.class)
    public void testNullFacingDirection(){
        pacman = new Pacman(0,0,null,4,4,0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyFacingDirection(){
        pacman = new Pacman(0,0,"",4,4,0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeYMinPos(){
        pacman = new Pacman(0,0,"",4,4,-1,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeXMinPos(){
        pacman = new Pacman(0,0,"",4,4,0,-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeYMaxPos(){
        pacman = new Pacman(0,0,"",-1,4,0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeXMaxPos(){
        pacman = new Pacman(0,0,"",0,-1,0,0);
    }

    @Test(expected = NullPointerException.class)
    public void testNullSetFacingDirection(){
       pacman.setFacing(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptySetFacingDirection(){
        pacman.setFacing("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSetXPosition(){
        pacman.setX(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSetYPosition(){
        pacman.setY(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThan4SetXPosition(){
        pacman.setX(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThan4SetYPosition(){
        pacman.setY(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSetXMax() {
        pacman.setxMax(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSetYMax() {
        pacman.setyMax(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSetXMin() {
        pacman.setxMin(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSetYMin() {
        pacman.setyMin(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThan4SetYMaxPosition(){
        pacman.setyMax(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThan4SetXMaxPosition(){
        pacman.setxMax(5);
    }

    @Test
    public void testSetXPosition(){
        pacman.setX(1);

        assertEquals("X is 1", 1, pacman.getX());
    }

    @Test
    public void testSetYPosition(){
        pacman.setY(1);
        assertEquals("Y is 1", 1, pacman.getY());
    }

    @Test
    public void testSetXminPosition(){
        pacman.setxMin(1);
        assertEquals("X Min is 1", 1, pacman.getxMin());
    }

    @Test
    public void testSetYminPosition(){
        pacman.setyMin(1);
        assertEquals("Y Min is 1", 1, pacman.getyMin());
    }

    @Test
    public void testSetXmaxPosition(){
        pacman.setxMax(1);
        assertEquals("X Max is 1", 1, pacman.getxMax());
    }

    @Test
    public void testSetYmaxPosition(){
        pacman.setyMax(1);
        assertEquals("Y Max is 1", 1, pacman.getyMax());
    }

    @Test
    public void testSetFacingPosition(){
        pacman.setFacing("EAST");
        assertEquals("Facing to EAST", "EAST", pacman.getFacing());
    }

}
