package lsystems_tests;

import static org.junit.Assert.*;

import lsystems.C_B;
import lsystems.LRule;

import org.junit.Test;

public class C_B_Test {

	@Test
	public void creationTest() {
		
		LRule r1 = new C_B();
		
		char actMatch = 'C';
		char[] actBody = {'B'};
		
		assertEquals(actMatch, r1.getMatch());
		assertArrayEquals(actBody, r1.getBody());
		
	}

}
