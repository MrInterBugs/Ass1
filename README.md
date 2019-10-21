# Ass1
Java Assessment Project 1

A Assignment one – breaking the Caesar cypher

Please see the ‘Coursework requirements and deadlines’ section of our website
for submission deadlines, and for the contribution to your final course mark.

Assessment criteria and feedback
The parts of this assignment are not all of the same weight: the marks for each
question are shown below. Some marks will be given for a correct approach
even when the overall solution is incomplete or incorrect.
This assignment will be marked by the course lecturer and feedback given;
please note that the feedback grades are provisional and subject to moderation
by our external examiners during the examination process.
The primary purpose of this assignment is formative: it provides practice
in basic Java programming and gives you an opportunity to assess for yourself
the degree to which you have understood the material
You should try all parts and hand in what you have done, even if you are
not able to complete some of the questions. Solutions to the assignment will be
discussed in a lecture slot after the assignments have been marked.
If you do not know how to do part of the assignment, begin by reading the
corresponding text in the notes and working through related examples discussed
in lectures. Please feel free to make an appointment to talk to me about anything you don’t understand, and remember solutions must be the submitter’s
own work.
If someone asks you for help you may discuss the material and examples
given in class but you should not give any form of help that you would not
expect the course lecturer to give; in particular do not share code. It is an
offence to submit somebody elese’s work under your own name, and it is also
an offence to give your work to somebody else.
150 ASSIGNMENT ONE – BREAKING THE CAESAR CYPHER

A.1 Introduction
The Caesar cypher is a particularly simple (i.e. not very effective) way of
encrypting text. You can read about it at
https://en.wikipedia.org/wiki/Caesar_cipher
The reason that the cypher is insecure is that in most human languages,
letter frequencies are not uniform. For instance, in English the letter E is often
the most common and the letters Q and Z are quite rare. In addition, in English
the letter Q is invariably followed by the letter U.
In this assignment you will perform letter frequency analysis of a piece of
text to test these claims. Your program could also be used to decrypt text with
an unknown Caesar shift by looking for the most common letter and assumming
that is an E.

A.2 Preparing the input data [10 marks]
 Create a directory ass1 in your javaProgramming directory and begin
editing a file called jc.txt
teaching$ cd javaProgramming
teaching$ mkdir ass1
teaching$ cd ass1
teaching$ kate jc.txt &
Of course, you should use whatever kind of editor pleases you.
 Copy and paste the contents of page 10 of the course book Java, Concisely
into your jc.txt file.
 Add your own name to this file, inserting it on a line of its own at the
end.

A.3 Reading the file [30 marks]
 Begin editing a Java programme called Ass1.java
teaching$ kate Ass1.java &
 Create a suitable class with main method.
 Inside the main method, add code to open the text file jc.txt and read
in each line, keeping a count of the number of lines as you go. When the
end of the file is reached, print out a message of the form
jc.txt contains x lines
where x is the number of lines in the file.
 Manually verify that the number of lines read in is indeed the number of
line in the file.
Counting letter frequencies [30 marks]

A.4 Counting letter frequencies [30 marks]
We are now going to read through the file, counting letter frequencies. Note that
we are treating lowercase characters such as a as equivalent to their uppercase
counterparts (A, in this case).
 Create an array of integers called counters with 27 positions, one for each
letter of the alphabet, plus an extra slot for non-alphabetic characters.
We shall use the first slot to store the count of the number of a characters,
the next to count the number of b characters and so on. The last slot will
hold the number of non-alphabetic characters.
 Read the lines of the file, and for each line iterate over its characters incrementing the appropriate element of the counters array for each character.
 After reading the whole file, iterate over the array and for each element
print out the letter it represents and the count within the file. In my test
solution, there were 2 Q characters, four X characters and no Z characters.
Your results might differ, depending on your name.

A.5 Visualising the output [30 marks]
Produce a diagram showing a histogram of the output. There are a variety
of ways you might do this: you could print one out on the screen by using a
column of * characters for each slot. You could output the data in Excel’s CSV
format and get Excel to plot the histogram. You could use one of the Java
graphics subsystems such as Swing or JavaFX to directly display the result on
the screen. Be creative.
