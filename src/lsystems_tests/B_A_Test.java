package lsystems_tests;

import static org.junit.Assert.*;

import lsystems.B_A;
import lsystems.LRule;

import org.junit.Test;

public class B_A_Test {

	@Test
	public void creationTest() {
		
		LRule r1 = new B_A();
		
		char actMatch = 'B';
		char[] actBody = {'A'};
		
		assertEquals(actMatch, r1.getMatch());
		assertArrayEquals(actBody, r1.getBody());
		
	}

}
