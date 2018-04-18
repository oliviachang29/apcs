import java.io.*;
import static java.lang.System.*;
class Lesson_15_Activity {
	public static void sortAndPrint (String str[]) {
		for (int i = 0; i < str.length; i++) {
			// find smallest
			int smallest = i;
			for (int j = i; j < str.length; j++) {
				if (str[j].compareTo(str[smallest]) < 0) {
					smallest = j;
				}
			}
			String temp = str[i];
			str[i] = str[smallest];
			str[smallest] = temp;
		}	
		for (int k = 0; k < str.length; k++) {
			System.out.print(str[k] + " ");
		}

	}

	public static void main (String str[]) throws IOException {
		String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
		sortAndPrint(list);
	}
}