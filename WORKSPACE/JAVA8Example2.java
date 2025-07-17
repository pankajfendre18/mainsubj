import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JAVA8Example2 {

	public static void main(String[] args) {

		String str = "java is programming language java is language";
		long startTime = System.currentTimeMillis();
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<>();

		for (String s : arr) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		System.out.println((System.currentTimeMillis() - startTime) * 1000 + " ns");

		System.out.println(map);

		startTime = System.currentTimeMillis();
		Map<String, Long> map1 = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println((System.currentTimeMillis() - startTime) * 1000 + " ns");
		System.out.println(map1);

	}

}
