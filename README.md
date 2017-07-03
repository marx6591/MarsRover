# MarsRover

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to sen. back to Earth.

A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. Na example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple estringi of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Oracle JDK 1.8.0

Eclipse IDE for Java Developers

### Installing

Step 1: Start Eclipse, and then create a New Project named "MarsRovers".

Step 2: Download the project, copy the downloaded files and paste them into the project folder created "MarsRovers"

Step 3: In Eclipse, right click on the project and choose the "Refresh" option.

Step 4: Open the Project and find the file Test.java, right click on it and choose "Run As", then "Java Application"

## Running the tests

The first line of input is the upper-right coordinates of the plateau, enter 5 for the x-coordinate and 5 for the y-coordinate.
Then enter the number of robots that will operate, enter 3 robots.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation. Each rover will be finished sequentially, which means that the second rover mont. start to move until the first one has finished moving.

### For the first robot, we will test the best way, without contradicting the code.
```
Enter the coordinates: 1 2 N
```
```
Then enter the commands: LMLMLMLMM
```
The expected output is X = 1, Y = 3, positioning = N

### For the second robot, we will test wrong data entry
```
Enter the coordinates: 1 p N
```
An Invalid Input message will appear because the second data must be a number, not a letter.
```
Enter the coordinates: 1 2 X
```
An Invalid Entry message will appear because the third data must be a number representing one of the cardinal points 

(North = N, South = S, East = E, West = W)
```
Enter the coordinates: 8 2 N
```
An Invalid Input message will appear because the first data must be a number that is within the maximum plateau size.
```
Enter the coordinates: 1 2 N
```
```
Enter Commands: MMMM
```
An error message will appear saying that the robot does not move in one of the commands, because it arrives at the limit of the plateau, and there is no room to walk.

The expected output is X = 1, Y = 5, posicionamento = N

### For the third test we will test sending a wrong command
```
Enter the coordinates: 3 3 E
```
```
Then enter the commands: MXMRMMRMRRM
```
An invalid command message will appear, ignore the wrong command and continue with the execution.

The expected output is X = 5, Y = 1, posicionamento = E
