package se.nackademin.examination.examination_jacoco;

import org.junit.Test;

public class MainTest {
	@Test
	public void testMainMethod() {
		Main.main(null);
	}
	@Test
	public void testMain1Method() {
		Main main = new Main();
		Main.main(null);
	}

}
