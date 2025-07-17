import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListIndexOfExample1 {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[] { 1, 2, 1, 4, 5, 3, 3, 8 });
		System.out.println(numbers.size());
		Object[] toArrayList = { 1, 2, 10, 20, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };
		System.out.println(toArrayList.length);
//		toArrayList = numbers.toArray(toArrayList);
//		System.out.println(toArrayList.length);
//		System.out.println("Array List is : " + Arrays.toString(toArrayList));

		Object[] es = numbers.toArray();
		System.arraycopy(es, 0, toArrayList, 0, es.length);
		System.out.println("Array List is : " + Arrays.toString(toArrayList));

	}
}
