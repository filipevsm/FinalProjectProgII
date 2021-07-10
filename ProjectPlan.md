# FinalProjectProgII
Program Objective
•	Read data from 2 text files, employees.txt and employeesHours.txt
•	Process the data into 4 different text files.
•	Write the objects into a binary file.

Plan
1.	Design of the Employee Class – (done in class)

2.	TimeStamp class
•	Instance variables - hour, minute, second (int)
•	Constructors – TimeStamp(int hour, minute, second)
•	Methods – get&setHour, get&setMin, get&setSec, addHour, addMin, addSec

3.	Functional Decomposition Design

Core methods

•	Employee constructor
-	Input: employeeNumber, lastName, firstName, hourlyWage (int, String, String, double)
-	Output: instance of Employee object
•	TimeStamp constructor
-	Input: hour, min, sec (int)
-	Output: instance of TimeStamp object
•	getTotalWage()
•	readInputFiles()
•	outputFile() decides what file to display in menu
•	generateOutputFiles()
•	readFiletoRuntime()

