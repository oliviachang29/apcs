// 1. Write a loop to create the exact same output as the following method:

public static void recur1(int n)
{ 
    if (n > 1)
        recur1(n / 10); 
    System.out.print(n % 10 + " ");
}
int myint = 7789;
recur1(myint); // 7 7 8 9

for (int i = 0; i < myint.length; i++) { // does that even work
	System.out.print(myint.charAt(i) + " "); // i don't think this works
}

// 2. Write a loop to create the exact same output as the following method:

public static void recur2(int n)
{ 
    if (n > 1)
        recur2(n - 1); 

    System.out.print(n+ " ");
}
int newInt = 5;
recur2(newInt); // 1 2 3 4 5
for (int i = newInt; i > 0; i--) {
	System.out.print(i + " ");
}