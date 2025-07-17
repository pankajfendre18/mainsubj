import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class Student {

	private Integer id;

	private String name;

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

}

public class Test {

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Krisha"));
		studentList.add(new Student(2, "Aarya"));
		studentList.add(new Student(3, "Tisha"));
		studentList.add(new Student(3, "Ishana"));

		Map<Integer, String> studentMap = studentList.stream()
				.collect(Collectors.toMap(Student::getId, Student::getName, (x, y) -> y, LinkedHashMap::new));

		// Add the Code Changes After This

		studentMap.forEach((x, y) -> System.out.println("Student ID : " + x + ", Student Name : " + y));

	}

}
