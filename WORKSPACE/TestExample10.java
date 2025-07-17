import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {

	private String name;
	private int age;
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Person(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

}

public class TestExample10 {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("Akshay", 26, 4), new Person("Sam", 25, 5));

		personList.stream().sorted(Comparator.comparingDouble(p -> p.getHeight())).forEach(System.out::print);

	}

}
