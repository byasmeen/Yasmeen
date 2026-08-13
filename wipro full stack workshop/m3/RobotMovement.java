public class RobotMovement {
    public static String robotMovement(int input1, int input2, String input3, String input4) {
        String[] pos = input3.split("-");
        int x = Integer.parseInt(pos[0]);
        int y = Integer.parseInt(pos[1]);
        char dir = pos[2].charAt(0);

        char[] directions = {'N', 'E', 'S', 'W'};
        int dirIndex = 0;
        for (int i = 0; i < 4; i++) {
            if (directions[i] == dir) {
                dirIndex = i;
                break;
            }
        }

        String[] moves = input4.trim().split("\\s+");
        boolean isError = false;

        for (String move : moves) {
            if (move.equals("L")) {
                dirIndex = (dirIndex + 3) % 4;
            } else if (move.equals("R")) {
                dirIndex = (dirIndex + 1) % 4;
            } else if (move.equals("M")) {
                int nextX = x;
                int nextY = y;
                char currentDir = directions[dirIndex];

                if (currentDir == 'N') {
                    nextY++;
                } else if (currentDir == 'E') {
                    nextX++;
                } else if (currentDir == 'S') {
                    nextY--;
                } else if (currentDir == 'W') {
                    nextX--;
                }

                if (nextX < 0 || nextX > input1 || nextY < 0 || nextY > input2) {
                    isError = true;
                    break;
                } else {
                    x = nextX;
                    y = nextY;
                }
            }
        }

        String result = x + "-" + y + "-" + directions[dirIndex];
        if (isError) {
            result += "-ER";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(robotMovement(5, 5, "1-2-N", "L M L M L M L M M"));
    }
}
