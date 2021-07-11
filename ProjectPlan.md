Kevin Darby & Filipe Moreira

Project Outline & Pseudo Code 

Program Objective
Read data from 2 text files, employees.txt and employeesHours.txt
 Process the data into objects
Generate 4 reports in 4 different text files

Core Classes & Methods

Employee Class
Instance Variables: empNumber, firstName, lastName, hourlyWage, totalWage, TimeStamp
Constructors - Employee
Methods - get&setEmpNumber, get&setTimeStamp, get&setHourlyWage, get&setFirstName, get&setLastName, get&setTotalWage

TimeStamp Class
Instance Variables:  hour, minute, second
Constructors - TimeStamp
Methods - get&setHour, get&setMin, get&setSec, addHour, addMin, addSec

setTotalWage()
Calculates the total wage of the employee based on total hours, minutes and seconds worked	
	
Input: hourWage, minWage, secWage
Output: totalWage
Pseudo Code: hWage = timestamp.getHour * hWage
		mWage = timestamp.getMin / 60 * hWage
		sWage = timestamp.getSec / 60 / 60 * hWage
		totalWage = hWage +mWage + sWage;

readInputFiles()
	1st part: read “employees.txt” and import to ArrayList
	2nd: clear ArrayList first, read “employeesHours.txt” and import.		
Input: ArrayList<String> stringList, ArrayList<Employee> employeeList
Output: two files objects (one for each file input)
File newFile = new File(file)
Scanner obj, while scanner hasNext

generateOutputFiles()
Should generate whatever file in passed as parameter (user choice)
Input: String file, ArrayList<Employee> AL
Output: parameterChosenOrder.txt
FileOutputStream writingFile = new FOS(fileToBeGenerated)
switch(fileToBeGenerated)
Case for each option available in the menu (nameOrder.txt, etc.)
try/catch blocks - IOException & InputMismatch
readFiletoRuntime()
Should read and display the file generated (@generateOutputFiles) to the console
Input: fileToBeRead 
Output: Displays the sorted file
File newFile = new File(file)
Scanner obj, while scanner hasNext
Throws IOException


Comparator classes
	Input: Two Employee objects
	Output: -1 if e1 < e2
		  1 if e1 > e2

Main Method
Program should start by processing the two input files prior to showing the menu
Generate and display menu
Initialize an instance of Employee class for each employee listed (employees.txt)
Create file object for each input (employees.txt + employeesHours.txt)

