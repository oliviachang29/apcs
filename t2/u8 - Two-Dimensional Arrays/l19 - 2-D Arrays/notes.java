/* 

Arrays
- store one type of data
- indexed from 0 to length - 1
- used to store large amounts of data

2D Arrays
- when you need to store a table of data
- creates an array of arrays */
int grid [] [] = new int [4] [3];
/*
first value [4] - # rows
second value [3] - # columns

- for (2,0) - rows come first, then columns
- so opposite of coordinate grid

Row - Major
- means that the row comes first
- for loops must also be row major:
*/

for (int r = 0; r < grid.length; r++) { // outside loop deals with rows
	for (int c = 0; c < grid[0].length; c++) { // inside loop deals with columns
		System.out.print(grid[r][c] + " \t");
	}
	System.out.println();
}
