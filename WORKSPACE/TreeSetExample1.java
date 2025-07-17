import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<Object>();
		set.add("kkk"); // inserting String type element
		set.add(10); // inserting Integer type element
		//set.add(new Object()); // inserting Object type element
		//set.add(20.65); // inserting Double type element
		System.out.println(set);
	}
}
