package Chapter7;

/*
(Turtle Graphics) The Logo language made the concept of turtle graphics famous. Imagine
a mechanical turtle that walks around the room under the control of a Java application. The turtle
holds a pen in one of two positions, up or down. While the pen is down, the turtle traces out shapes
as it moves, and while the pen is up, the turtle moves about freely without writing anything. In this
problem, you’ll simulate the operation of the turtle and create a computerized sketchpad.
Use a 20-by-20 array floor that’s initialized to zeros. Read commands from an array that contains them.
Keep track of the current position of the turtle at all times and whether the pen is currently up or down.
Assume that the turtle always starts at position (0, 0) of the floor with its pen
up. The set of turtle commands your application must process are shown in Fig. 7.29

Command Meaning
1 Pen up
2 Pen down
3 Turn right
4 Turn left
5,10 Move forward 10 spaces (replace 10 for a different number of spaces)
6 Display the 20-by-20 array
9 End of data (sentinel)

Suppose that the turtle is somewhere near the center of the floor. The following “program”
would draw and display a 12-by-12 square, leaving the pen in the up position:
2
5,12
3
5,12
3
5,12
3
5,12
1
6
9
As the turtle moves with the pen down, set the appropriate elements of array floor to 1s. When the
6 command (display the array) is given, wherever there’s a 1 in the array, display an asterisk or any
character you choose. Wherever there’s a 0, display a blank.
Write an application to implement the turtle graphics capabilities discussed here. Write several
turtle graphics programs to draw interesting shapes. Add other commands to increase the power of
your turtle graphics language.
 */
public class CH_7_21 {

        public static void main(String[] args) {
            int[][] floor = new int[20][20]; // 20-by-20 array floor initialized to zeros
            int x = 0, y = 0; // current position of the turtle
            boolean penDown = false; // pen is initially up
            int direction = 0; // turtle is initially facing right
            int[] commands = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9}; // sample commands
            int i = 0; // index of the current command

            while (i < commands.length) {
                int command = commands[i];
                i++;

                if (command == 1) { // Pen up
                    penDown = false;
                } else if (command == 2) { // Pen down
                    penDown = true;
                } else if (command == 3) { // Turn right
                    direction = (direction + 1) % 4;
                } else if (command == 4) { //Turn left
                    direction = (direction + 3) % 4;
                } else if (command == 5) { // Move forward
                    int distance = commands[i];
                    i++;
                    if (penDown) {
                        for (int j = 1; j <= distance; j++) {
                            if (direction == 0) {
                                if (y < 19) {
                                    y++;
                                }
                            } else if (direction == 1) {
                                if (x < 19) {
                                    x++;
                                }
                            } else if (direction == 2) {
                                if (y > 0) {
                                    y--;
                                }
                            } else if (direction == 3) {
                                if (x > 0) {
                                    x--;
                                }
                            }
                            floor[y][x] = 1; // set the appropriate element of array floor to 1
                        }
                    } else {
                        if (direction == 0) {
                            if (y < 19) {
                                y++;
                            }
                        } else if (direction == 1) {
                            if (x < 19) {
                                x++;
                            }
                        } else if (direction == 2) {
                            if (y > 0) {
                                y--;
                            }
                        } else if (direction == 3) {
                            if (x > 0) {
                                x--;
                            }
                        }
                    }
                } else if (command == 6) { // Display the 20-by-20 array
                    for (int j = 0; j < 20; j++) {
                        for (int k = 0; k < 20; k++) {
                            System.out.print(floor[j][k] == 1 ? "*" : " ");
                        }
                        System.out.println();
                    }
                } else if (command == 9) { // End of data (sentinel)
                    break;
                }
            }
        }
    }


