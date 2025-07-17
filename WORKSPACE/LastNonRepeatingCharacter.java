import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LastNonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "Japan";
		// last non repeating character

		Character key =  new StringBuilder(str)
                .reverse().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
				entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
		System.out.println("Last repeated : " + key);

	}
}
