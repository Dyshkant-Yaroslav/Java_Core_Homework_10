package ua.lviv.desctop.pt1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MyException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {

				System.out.println("Please enter a 5 letter word:  ");

				String word = sc.nextLine();
				if (word.length() == 5) {

					StringBuffer sb = new StringBuffer(word);
					sb.reverse();

					if (word.equalsIgnoreCase(sb.toString())) {
						System.out.println("The word is palindrom");
						System.out.println(" ");
					} else {
						System.out.println("The word isn't palindrom");
						System.out.println(" ");
					}

				} else {
					throw new MyException();
				}
			} catch (MyException e) {
				System.err.println("Wrong number of words!!!!!");
				System.out.println(" ");
			}
		}
	}
}