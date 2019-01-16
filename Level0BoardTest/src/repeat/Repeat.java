package repeat;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repeat {
	/**
	 * Description: Write a function called repeatStr which repeats the given string
	 * string exactly n times.
	 *
	 * <pre>
	 * Example:
	 * repeatStr(6, "I") //"IIIIII" 
	 * repeatStr(5, "Hello") //"HelloHelloHelloHelloHello"
	 * </pre>
	 **/
	public static String repeatStr(final int repeat, final String string) {
		if (repeat == 0) {
			return "";
		}
		String word=string;
		for (int i = 0; i < repeat-1; i++) {
			word=word+string;
		}
		return word;
	}
}
