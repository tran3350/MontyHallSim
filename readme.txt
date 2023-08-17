Monty Hall Simulation
=====================

This Java program simulates the Monty Hall problem, a probability puzzle based on a game show scenario. The Monty Hall problem involves a participant selecting one out of three doors, behind one of which is a prize. After the initial choice, the host opens one of the other doors to reveal a goat (not the prize). The participant is then given the option to switch their choice to the remaining unopened door. The program simulates this scenario and calculates the probability of winning by switching doors.

How to Use
----------
1. Make sure you have Java installed on your system.
2. Open a terminal or command prompt.
3. Navigate to the directory containing the Main.java file.
4. Compile the program by running the following command:javac Main.java
5. Run the compiled program using the following command:java Main
6. Follow the prompts to select a door and decide whether to switch your choice.

How It Works
------------
1. The program uses the Random class to randomly select a door behind which the prize is located.
2. Two goat doors are randomly generated using the Random class to ensure that they are different from the prize door and each other.
3. The user is prompted to select a door. The program validates the user's input to ensure it's a valid door number (1, 2, or 3).
4. Based on the user's choice, the program determines which door to open as a goat door and which door remains unopened.
5. The user is asked whether they want to switch their choice. The program validates the user's response to ensure it's either 'y' or 'n'.
6. If the user chooses to switch, their choice is updated to the remaining unopened door.
7. The program then reveals the prize door and determines whether the user's final choice matches the prize door, resulting in a win or loss.
8. The simulation results are displayed to the user.

Example Output
--------------
Select the door (1, 2, or 3): 2

Door3 is a goat door
You selected door number 2

Would you like to switch your door (y/n)? y
Your choice switched to door 1
The prize is behind door number: 3
lose


About
-----
This program was created as a Java exercise to simulate the Monty Hall problem. It demonstrates basic user input handling, random number generation, decision-making logic, and output display.

Feel free to use, modify, and share this program as you see fit!
