package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionsTest {

	@Test
	public void testAssertions() {
		// Assert equals
		assertEquals(5, 2 + 3);
		// Assert true
		assertTrue(5 > 3);
		// Assert false
		assertFalse(5 < 3);
		// Assert null
		assertNull(null);
		// Assert not null
		assertNotNull(new Object());
		}

}
