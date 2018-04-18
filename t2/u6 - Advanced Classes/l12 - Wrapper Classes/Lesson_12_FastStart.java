import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.*;

class Lesson_12_FastStart {
	public static void main (String str[]) throws IOException {
		ArrayList <String> strings = new ArrayList <String> ();
		strings.add("Harry");
		strings.add("Did");
		strings.add("You");
		strings.add("Put");
		strings.add("Your");
		strings.add("Name");
		strings.add("In");
		strings.add("The");
		strings.add("Goblet");
		strings.add("Fire");
		int rand1 = (int)(Math.random()*10);
		int rand2 = (int)(Math.random()*10);
		while (rand2 == rand1) {
			rand2 = (int)(Math.random()*10);
		}
		System.out.println(strings.get(rand1));
		System.out.println(strings.get(rand2));
	}
}