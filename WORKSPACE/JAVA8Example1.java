import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JAVA8Example1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 4, 5, 5);

		List<Integer> duplicates = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicates);

		Set<Integer> set = new LinkedHashSet<>();
		List<Integer> duplicates1 = list.stream().filter(s -> !set.add(s)).distinct().collect(Collectors.toList());
		System.out.println(duplicates1);

	}

}
