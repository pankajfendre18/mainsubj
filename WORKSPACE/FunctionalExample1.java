import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface Functional {
	void print();
}

public class FunctionalExample1 {

	public static void main(String[] args) {

		String s1 = "hello world";

		String s2 = "hello world";

		String s3 = new String("hello world");

		System.out.println(s1 == s2);

		System.out.println(s1 == s3);

		System.out.println(s1.equals(s2));

		System.out.println(s1.equals(s3));

		List<String> list = Arrays.asList("qeqe", "qrqwrqr", "qrtqr", "qrqter");

		Optional<String> shortestString = list.stream().min((a, b) -> Integer.compare(a.length(), b.length()));

		System.out.println(shortestString.get());

		List<String> list1 = Arrays.asList("1", "2", "3", "3", "4", "2", "3", "3", "4");

		HashSet<String> set = new HashSet<>();

//		List<String> duplicates = list1.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
		Set<String> duplicates = list1.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
				.entrySet().stream().filter(entry -> entry.getValue() > 1) // Filter duplicates
				.map(Map.Entry::getKey).collect(Collectors.toSet());

		System.out.println(duplicates);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 1, 7, 8, 3, 9, 10, 6);

		// Find duplicates using Stream API
		Set<Integer> duplicates1 = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
				.entrySet().stream().filter(entry -> entry.getValue() > 1) // Filter duplicates
				.map(Map.Entry::getKey).collect(Collectors.toSet());

		// Print duplicates
		System.out.println("Duplicate Elements: " + duplicates1);
	}

}
