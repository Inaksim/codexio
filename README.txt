Task for Codexio

############################ 1 ############################

/ Task
In a box, there's a different count of balls in different colors, which we receive as an input in the following format: "Color: count", until we receive an 
"End" command. After that, we are allowed to remove balls from that box, but we can't look at their color. 
We need to write a program that prints the smallest count of balls we must take out,
so we are sure there is only one color left in the box.
/

The program first reads th input and stores the counts of balls for each color in a dictionary
called 'balls'. The 'while' loop reads input untill it encounters the "End" command.
The 'strip()' method is used to remove any leading or tralling white space from the input line, 
and the 'split()' method use to separete the color and count values.

Once we have counts of balls for each color, we compute the minimum number of balls that need
to be removed to leave only one color. To do this, we substract the maximum count from that 
count of balls. This is because removing the balls of the most abundant color will leave only 
balls of the other colors in the box.


############################ 2 ############################

/ Task
 Once upon a time there was a rabbit who loved to steal carrots from the gardens of the good software developers.
 Every time he leaped in a garden, he wanted to collect all the carrots. Can you help the rabbit find how many times he
 has to jump to eat all the carrots? The gardens are always square, he always enters from the top left corner and he has to
 jump once for one group of carrots that have no space between each other vertically or horizontally.
/

In this code we initiliaze a variable 'totalCarrots' = 0, which will keep track of the total number of carrrots in 
all the gardens.
Read the dimensions of the garden(the number of rows and columns).
Create loop and read the number of carrots in each row, and add this to 'totalCarrots'.
Divide 'totalCarrots' by the total number of carrots the rabbit can eat in one jump and round up 
to the nearest integer. This will give you number of jumps the rabbit needs to make to eat all the
carrots in the garden.

############################ 3 ############################

/ Task
In a magical world there is an elf that loves to write the words he hears.
Every time he hears a word he writes it down.
And since he loves words and letters so much he checks if the new word is similar to the 
previous one. So he crosses out letters until the two words contain the same letters. 
Please write a program that will help our kind elf.
/

In this code we create 2 methods 'getRemovedLetters' and 'getCount'.
'getRemovedLetters' takes in two strings and initilizes 2 'HashMap' : 'map1' and 'map2' to store 
the count of each character in the strings.
'getCount' method passing in 'str1', 'map2' and '0' as arguments, after passing 'str2' and 'map1' and the
result of the previous method calls as arguments. The 'getCount' method counts the number of characters in the input
string that are not present in the map and returns the total count.
'getRemovedLetters' method returns the total count from the two calls to 'getCount'.
 






