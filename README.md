# codexio
Task from codexio

Task:  In a box, there's a different count of balls in different colors, which we receive as an input in the following format: "Color: count", until we receive an "End" command. After that, we are allowed to remove balls from that box, but we can't look at their color. We need to write a program that prints the smallest count of balls we must take out, so we are sure there is only one color left in the box.

For reading input i use "Scanner" and store the counts of balls for each color in a HashMap, call that collection "balls".

Initializes the "minBalls" variable with the total count of balls in the box, assuming that all balls have different collors.

It iteatets over each count in "balls", and calculates the number of balls left in the box after removing all balls of that color. It updates "minBalls" with tha smallest number of balls left so far.

At the end, the program prints the final value of "minBalls", which is the smallest number of balls you must take out to be sure that there is only one color in the box.

It makes sense to check for the input data, since the number of balls must be a positive value.
