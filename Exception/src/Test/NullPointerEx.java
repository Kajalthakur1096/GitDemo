package Test;

public class NullPointerEx extends Throwable {
	public void string() throws NullPointerException {
		String str = null;
		System.out.println(str.length());

	}
}
