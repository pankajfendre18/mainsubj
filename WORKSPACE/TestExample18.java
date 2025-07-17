import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class CourseResult {
	String course;
	boolean passed;

	CourseResult(String course, boolean passed) {
		this.course = course;
		this.passed = passed;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

}

class AStudent {
	String name;
	List<CourseResult> results;

	public AStudent(String name, List<CourseResult> results) {
		this.name = name;
		this.results = results;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CourseResult> getResults() {
		return results;
	}

	public void setResults(List<CourseResult> results) {
		this.results = results;
	}

}

public class TestExample18 {
	public static void main(String[] args) {
		List<CourseResult> results1 = Arrays.asList(new CourseResult("Math", true), new CourseResult("Science", true));
		List<CourseResult> results2 = Arrays.asList(new CourseResult("Math", false), new CourseResult("Science", false));
		List<CourseResult> results3 = Arrays.asList(new CourseResult("Math", true), new CourseResult("Science", false));

		List<AStudent> AStudents = Arrays.asList(
				new AStudent("Alice", results1), 
				new AStudent("Bob", results2),
				new AStudent("Charlie", results3));
		
		
		
		List<String> passedAStudents = AStudents.stream()
				.filter(s -> s.getResults().stream().allMatch(CourseResult::isPassed)).map(AStudent::getName)
				.collect(Collectors.toList());
		System.out.println(passedAStudents);

		
		
		Map<String, Long> AStudentCountPerCourse = AStudents.stream()
				.flatMap(s -> s.getResults().stream().map(CourseResult::getCourse))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(AStudentCountPerCourse);
		
		

		Map<String, Double> coursePassRates = AStudents.stream().flatMap(s -> s.getResults().stream()).collect(
				Collectors.groupingBy(CourseResult::getCourse, Collectors.averagingInt(cr -> cr.isPassed() ? 1 : 0)));

		System.out.println(coursePassRates);
		
		String topCourse = coursePassRates.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
				.orElse("No course");

		System.out.println(topCourse);
	}
}
