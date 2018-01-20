// creating arrays
int [] list = new int[7];
// creates an array called list of 7 ints
// - the new command stores creates a new reference (Java stores the memory address in the variable)
// - index starts at 0, so goes from 0 -> 6
// - fixed size

list[4]++;  // add one to whatever is at the fourth position in list
list[0] = list[1] + 2; // change value of zero position to be first position + 2

// initalizer list
int[] list = {14, -10, 1, 0, 9, 7, 3};
// automatically sets size based on number of elements you give it