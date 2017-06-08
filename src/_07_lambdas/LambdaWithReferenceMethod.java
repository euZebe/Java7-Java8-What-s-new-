package _07_lambdas;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

public class LambdaWithReferenceMethod {

	public static void sayHello(String name) {
		String message = MessageFormat.format("Hello {0}!", name);
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("world", "you");
		
		// TODO: either with a non-static method: System.out.println
		
		// TODO: or a static one: LambdaWithReferenceMethod.sayHello
	}
}





































//		names.forEach(System.out::println);
//		names.forEach(LambdaWithReferenceMethod::sayHello);