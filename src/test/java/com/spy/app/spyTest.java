import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class spyTest {

	@Test
	void test() {
		assertTrue(spy.spyy(123));
		assertFalse(spy.spyy(1234));
	}

}
