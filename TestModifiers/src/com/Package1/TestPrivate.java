package com.Package1;

public class TestPrivate {
	private class InnerPrivate {
		public void testPrivate() {
			System.out.println(" Private: Hello world!");
		}

	}

	public void testPublic() {
		InnerPrivate priv = new InnerPrivate();
		priv.testPrivate();
	}
}