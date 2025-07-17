import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestExample {
	public static void main(String[] args) {
		
		//Outer loop runs n times, and each inner operation is O(m)
		String str[] = { "array", "apple", "rat" };
		
		for(String word : str) {
			Map<Character, Long> collect = word.chars().mapToObj(c -> (char)c).
					collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(collect);
		}
		
//		for (String s : str) {
//			char ch[] = s.toCharArray();
//			Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//			for (char c : ch) {
//				if (map.containsKey(c)) {
//					map.put(c, map.get(c) + 1);
//				} else {
//					map.put(c, 1);
//				}
//
//			}
//			System.out.println(map);
//			for (Entry<Character, Integer> entry : map.entrySet()) {
//				if (entry.getValue() == 1) {
//					System.out.println(entry.getKey());
//					break;
//				}
//
//			}
//
//		}
	}
}
