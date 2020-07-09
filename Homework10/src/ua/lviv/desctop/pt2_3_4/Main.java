
package ua.lviv.desctop.pt2_3_4;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		String str = new String("Java is the best!");

		// 2
		System.out.println(str.replace('a', '-').replace('e', '-').replace('i', '-'));

		// 3
		int count = 0;
		if (str.length() != 0) {
			count++;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
		}
		System.out.println("The number of words: " + count);

		// 4 Google це сила!

		String s3 = "Java is the best i love Java";
		String word = Arrays.stream(s3.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
		System.out.println("Most popular word is " + word);

	}

}
