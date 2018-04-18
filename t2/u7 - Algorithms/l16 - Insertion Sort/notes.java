/*
Goal: Put the elements of the array in order

Move through the array and insert each element in the correct position in the array

Steps:
1. Start with a pointer variable, next = 1
2. Going backwards, move through the elements until you find the position of an element less than the value at next
3. Insert array[next] at this location
4. Increment next
5. Repeat until next = length - 1

Advantages: easy to code and understand
Disadvntages: slow for large datasets (roughly same amount of time as a selection sort)

*/