package _04_java.io.file;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TipsWithFiles {

	public static void main(String[] args) throws URISyntaxException, IOException {

		Path source = Paths.get(ClassLoader.getSystemResource("bidule.txt").toURI());
		Path parent = source.getParent().getParent().resolve("resources").toAbsolutePath();
		Path destination = Paths.get(parent.toString(), "copy of bidule.txt");
//
		System.out.println("Before COPY, does file exists ? " + Files.exists(destination));
		Files.copy(source, destination);
		System.out.println("After COPY, does file exists ? " + Files.exists(destination));

		// TODO: delete file
//		 Files.delete(destination);
//		 System.out.println("\nAfter DELETE, does file exists ? " +
//		 Files.exists(destination));
	}
}
