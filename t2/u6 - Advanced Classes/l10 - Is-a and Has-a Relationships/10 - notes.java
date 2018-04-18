public class A {
	public A () {
		System.out.println("A");
	}
}

public class B {
	public B () {
		// calls an invisible super();
		System.out.println("B");
	}
}

// What is output by:
Women w = new Women ();
1. A
2. B
3. AB
4. BA
5. ABA

// Answer: 4 - because it calls super(), which prints A, then prints B