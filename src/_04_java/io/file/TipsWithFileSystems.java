package _04_java.io.file;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TipsWithFileSystems {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		// access to a File System
		FileSystem fs = java.nio.file.FileSystems.getDefault();
		System.out.println(fs.getRootDirectories());
		// => [C:\, J:\, L:\, O:\, P:\, V:\, Y:\]

		
		// mount a .zip as file system
		Path zipPath = Paths.get(ClassLoader.getSystemResource("archive.zip").toURI());
		FileSystem zipFileSystem = FileSystems.newFileSystem(zipPath, null);
		Path innerPath = zipFileSystem.getPath("/archive");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(innerPath)) {
			stream.forEach(content -> System.out.println(content));
		}

	}
}
