/*
Widening Conversions
- going to a bigger (wider) data type, not losing any info
*/

// going from int to double
int x = 15;
double half = 1.0*x/2;
// casting
double half = (double)x/2;

// is it legal?
int x = 7  // yes
int x = 8.2 // no
int x = 9.0 // no
double n = 18 // yes

/*
Narrowing Conversions
- going to a smaller (narrower) data type, losing info
- just truncates the decimal, doesn't round
- programmer MUST cast double -> integer
*/
 
int x = (int) 3.756 // x = 3

