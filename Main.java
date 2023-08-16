class ChandrayaanSpacecraft {
    private int[] position;
    private char direction;

    public ChandrayaanSpacecraft(int[] initialPosition, char initialDirection) {
        position = initialPosition;
        direction = initialDirection;
    }

    public void moveForward() {
        
    }

    public void moveBackward() {
        
    }

    public void turnLeft() {
    
    }

    public void turnRight() {
        
    }

    public void turnUp() {
        
    }

    public void turnDown() {
       
    }

    public int[] executeCommands(char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
            }
        }
        return position;
    }

    public char getDirection() {
        return direction;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] initialPosition = {0, 0, 0};
        char initialDirection = 'N';
        char[] commands = {'f', 'r', 'u', 'b', 'l'};

        ChandrayaanSpacecraft spacecraft = new ChandrayaanSpacecraft(initialPosition, initialDirection);
        int[] finalPosition = spacecraft.executeCommands(commands);
        char finalDirection = spacecraft.getDirection();

        System.out.println("Final Position: (" + finalPosition[0] + ", " + finalPosition[1] + ", " + finalPosition[2] + ")");
        System.out.println("Final Direction: " + finalDirection);
    }
}
