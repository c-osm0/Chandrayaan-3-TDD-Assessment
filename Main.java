class ChandrayaanSpacecraft {
    private int[] position;
    private char direction;

    public ChandrayaanSpacecraft(int[] initialPosition, char initialDirection) {
        position = initialPosition;
        direction = initialDirection;
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                position[1]++;
                break;
            case 'S':
                position[1]--;
                break;
            case 'E':
                position[0]++;
                break;
            case 'W':
                position[0]--;
                break;
            case 'U':
                position[2]++;
                break;
            case 'D':
                position[2]--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case 'N':
                position[1]--;
                break;
            case 'S':
                position[1]++;
                break;
            case 'E':
                position[0]--;
                break;
            case 'W':
                position[0]++;
                break;
            case 'U':
                position[2]--;
                break;
            case 'D':
                position[2]++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public void turnUp() {
        if (direction != 'U') {
            direction = 'U';
        }
    }

    public void turnDown() {
        if (direction != 'D') {
            direction = 'D';
        }
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
