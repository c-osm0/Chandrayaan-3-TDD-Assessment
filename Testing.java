import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Here I have made a Class related to testing in order to handle spacecraft movements testing
class ChandrayaanSpacecraftTest {
    @Test
    void testExecuteCommands() {
        // Test case 1
        int[] initialPosition = { 0, 0, 0 };
        char initialDirection = 'N';
        char[] commands = { 'f', 'r', 'u', 'b', 'l' };
        // ChandrayaanSpacecraft will be the name of logic class where we will handle
        // the specifications
        ChandrayaanSpacecraft spacecraft = new ChandrayaanSpacecraft(initialPosition, initialDirection);
        int[] finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { 0, 1, -1 }, finalPosition);
        assertEquals('N', spacecraft.getDirection());

        // Test case 2
        initialPosition = new int[] { 3, -2, 1 };
        initialDirection = 'E';
        commands = new char[] { 'b', 'l', 'u', 'r', 'd', 'f' };
        spacecraft = new ChandrayaanSpacecraft(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { 4, -2, 1 }, finalPosition);
        assertEquals('S', spacecraft.getDirection());

        // Test case 3
        initialPosition = new int[]{0, 0, 0};
        initialDirection = 'U';
        commands = new char[]{'l', 'f', 'f', 'd', 'b', 'r', 'r', 'b'};
        spacecraft = new ChandrayaanSpacecraft(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[]{0, -2, -2}, finalPosition);
        assertEquals('D', spacecraft.getDirection());

        // Test case 4
        initialPosition = new int[]{-5, 7, 3};
        initialDirection = 'W';
        commands = new char[]{'r', 'f', 'u', 'u', 'b', 'l', 'f'};
        spacecraft = new ChandrayaanSpacecraft(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[]{-6, 7, 5}, finalPosition);
        assertEquals('U', spacecraft.getDirection());

        // Test case 5
        initialPosition = new int[]{1, -1, 0};
        initialDirection = 'S';
        commands = new char[]{'f', 'r', 'f', 'r', 'f', 'l', 'f', 'l'};
        spacecraft = new ChandrayaanSpacecraft(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[]{1, 0, 0}, finalPosition);
        assertEquals('S', spacecraft.getDirection());
    }
}

public class Testing {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("ChandrayaanSpacecraftTest");
    }
}
