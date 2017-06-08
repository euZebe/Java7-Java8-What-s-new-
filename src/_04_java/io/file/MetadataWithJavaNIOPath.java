package _04_java.io.file;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class MetadataWithJavaNIOPath {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		Path filePath = Paths.get(ClassLoader.getSystemResource("bidule.txt").toURI());
		
		DosFileAttributes metadata = Files.readAttributes(filePath, DosFileAttributes.class);
		
		System.out.println("creation time ?\n\t=> "); // TODO
		System.out.println("last modification ?\n\t=> "); // TODO
		System.out.println("last access ?\n\t=> "); // TODO
		System.out.println("is symbolic link ?\n\t=> "); // TODO
		
		System.out.println("is read only ?\n\t=> "); // TODO
		System.out.println("is hidden ?\n\t=> "); // TODO
		System.out.println("is archive ?\n\t=> "); // TODO
		
		// and also POSIX file permissions...
	}
}

























//		System.out.println("creation time ?\n\t=> " + metadata.creationTime());
//		System.out.println("last modification ?\n\t=> " + metadata.lastModifiedTime());
//		System.out.println("last access ?\n\t=> " + metadata.lastAccessTime());
//		System.out.println("is symbolic link ?\n\t=> " + metadata.isSymbolicLink());
//		
//		System.out.println("is read only ?\n\t=> " + metadata.isReadOnly());
//		System.out.println("is hidden ?\n\t=> " + metadata.isHidden());
//		System.out.println("is archive ?\n\t=> " + metadata.isArchive());