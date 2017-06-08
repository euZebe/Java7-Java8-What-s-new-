package _05_java.util;

import java.util.Objects;

public class Bar {
	private Foo foo;
	private Bar parent;

	/**
	 * ToString methods
	 */

	public String oldToString() {
		return "Bar {foo = " + (foo == null ? "null" : foo.toString()) //
				+ ", parent = " + (parent == null ? "o parent, orphan" : parent.toString()) //
				+ "}";
	}

	@Override
	public String toString() {
		return "Bar {foo = " + Objects.toString(foo) //
				+ ", parent = " + Objects.toString(parent, "no parent, orphan") //
				+ "}";
	}

	/**
	 * equals methods
	 */
	public boolean oldEquals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj instanceof Bar) {
			Bar other = (Bar) obj;

			if (foo != other.foo) {
				if (foo == null || !foo.equals(other.foo)) {
					return false;
				}
			}

			if (parent != other.parent) {
				if (parent == null || !parent.equals(other.parent)) {
					return false;
				}
			}

			return true;
		}

		return false;
	}
	
	@Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        } 

        if (obj instanceof Bar) {
            Bar other = (Bar) obj; 

            return Objects.equals(foo, other.foo) && Objects.equals(parent, other.parent);
        } 

        return false;
    }

	
	
	/**
	 *
	 */
	private class Foo {
	}
}