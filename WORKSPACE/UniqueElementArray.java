import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElementArray {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 1, 2, 2, 3, 5 };

		Set<Integer> element = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).collect(Collectors.toMap(Entry::getKey, Entry::getValue)).keySet();
				
//				.findFirst().get().getKey();

		System.out.println(element);

		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}

		}

	}
}
