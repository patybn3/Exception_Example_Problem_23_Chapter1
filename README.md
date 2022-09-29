<h2> Object-Oriented Data Structure Using Java, 4th Edition </h2>

<h4>Patricia Antlitz - NECC 2022</h4>

<h3> Chapter 1 - Problem 24 </h3>

"Create a program that asks users to enter an integer and then thanks them. If they
do not enter an integer your program should ask again, until they do. Running your
program might result in this sort of console trace: "<br><br>
Please enter an integer.<br>
OK

That is not an integer. Please enter an integer.<br>
Twenty-seven

That is not an integer. Please enter an integer.<br>
64<br>
Thank you.

<hr>
This program uses the Scanner functionality from java.util library to get the user's entry.

It asks the user to enter a number which is saved in a variable of type String.

A loop is used to allow the user to continue entering if they enter the incorrect information.

The conditions are checks by a try/catch exception statement, which parses the String to get integers.

If the string contains letters, the program will catch the exception as a NumberFormatException, when the program fails
to convert a string to int, in this case because the program is looking for a number, and the user didn't enter one.
<hr>

This program works by building and running using an IDE, 

or in the CLI by typing the following commands:

** navigate to the correct directory ==> ....Exception_Example_PatriciaAntlitz/src <br>
** Run:

javac Exception_Example_PatriciaAntlitz.java ==> to compile<br>
java Exception_Example_PatriciaAntlitz.java ==> to run
