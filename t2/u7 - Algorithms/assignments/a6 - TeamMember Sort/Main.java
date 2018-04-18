import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;

class Main {

	public static void main (String str []) throws IOException {
		Scanner scan = new Scanner (System.in);
		ArrayList <TeamMember> members = new ArrayList <TeamMember> ();

		System.out.println("Enter the next name:");
		String name = scan.nextLine();
		String id = "";
		while (!name.toLowerCase().equals("stop")) {
			System.out.println("Enter the next ID:");
			id = scan.nextLine();
			members.add(new TeamMember(name, id));
			System.out.println("Enter the next name:");
			name = scan.nextLine();
		}

		// insertion sort
		int n = 1;
		while (n != members.size()) { // until n gets to the end of the aray
			int insert = 0;
			for (int i = n; i >= 0; i--) {
				if (members.get(i).compareTo(members.get(n)) < 0) {
					insert = i + 1;
					break;
				}
			} 
			members.add(insert, members.get(n));
			members.remove(n+1);
			n++;
		}

		System.out.println(members);
	}
}