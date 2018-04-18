/*

1. Write a loop to create the exact same output as the following method:

 public static void recur1(int n)
 { 
     if (n > 1)
         recur1(n / 10); 
     System.out.print(n % 10 + " ");
 }

*/
public static void loop1(int n) {
	for (int i = n; i > 1; i / 10) {
		System.out.print((i % 10) + " ");
	}
}

/*
2. Write a loop to create the exact same output as the following method:

public static void recur2(int n)
 { 
     if (n > 1)
         recur2(n - 1); 
 
     System.out.print(n+ " ");
 }
*/

public static void loop2 (int n) {
	for (int i = n; i > 1; i--) {
		System.out.print(i + " ");
	}
}