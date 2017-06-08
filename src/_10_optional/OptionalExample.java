package _10_optional;

import java.util.Optional;

import _99_utils.Address;
import _99_utils.Employee;
import _99_utils.ZipCode;

public class OptionalExample {

	public String getAddressDepartment(Employee employee) {
		if (employee != null) {
			Address address = employee.getAddress();
			if (address != null) {
				ZipCode zip = address.getZipCode();
				if (zip != null) {
					return zip.getFirstTwoDigits();
				}
			}
		}
		throw new RuntimeException("Missing data");
	}

	public String getAddressDepartmentWithOptional(Optional<Employee> employee) {
		employee //
				.flatMap(Employee::getOptAddress) //
				.flatMap(address -> address.getOptZipCode()) //
				.flatMap(zip -> zip.getOptFirstTwoDigits()) //
				.orElseThrow(() -> new RuntimeException("Missing data"));

		return null;
	}
}
