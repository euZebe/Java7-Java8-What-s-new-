package _01_underscore;

public class NumericExpressions {

	public static void main(String[] args) {
		// use underscore to group digits
		double companyBalance = 47_000.45;
		System.out.println(companyBalance);

		// as many digits as you want per group
		int hexaValue = 0xFFFF_FFFC;
		System.out.println(hexaValue);

		// even with different group sizes
		double anotherCompanyBalance = 40_0_14_3.45;
		System.out.println(anotherCompanyBalance);
	}
}
