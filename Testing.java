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
    }
}

public class Testing {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("ChandrayaanSpacecraftTest");
    }
}