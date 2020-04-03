package lsystems_tests;

import static org.junit.Assert.*;
import lsystems.A_BC;
import lsystems.LRule;

import org.junit.Test;

public class A_BC_Test {

	@Test
	public void creationTest() {
		
		LRule r1 = new A_BC();
		
		char actMatch = 'A';
		char[] actBody = {'B', 'C'};
		
		assertEquals(actMatch, r1.getMatch());
		assertArrayEquals(actBody, r1.getBody());
		
	}

}
