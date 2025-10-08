This Java program calculates the sum of digits of an integer. It contains three methods in a single file: main(), getSumOfDigits(int number), and getNumber(Scanner scanner). The main() method runs test cases and calls the user input method. The getSumOfDigits(int number) method converts the number to a string using String.valueOf(Math.abs(number)), iterates through each character with .length() and charAt(i), converts each character back to an integer, sums them, and returns the total. The getNumber(Scanner scanner) method ensures the user enters a valid integer, looping until input is correct, and then returns it. The program handles negative numbers correctly using Math.abs().

Example output:

Sum for 1000 is 1  
Sum for 14 is 5  
Sum for 0 is 0  
Sum for 12345 is 15  
Enter number to get sum of digits: 123  
Sum for 123 is 6
