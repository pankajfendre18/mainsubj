import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleOne {

	public static void main(String[] args) {
		List<String> playList = Arrays.asList("Song1", "Song2", "Song3", "Song4");

		Collections.shuffle(playList);

		while (!playList.isEmpty()) {
			String song = playList.remove(0);
			play(song);
		}

	}

	public static void play(String song) {
		System.out.println(song);
	}

}
