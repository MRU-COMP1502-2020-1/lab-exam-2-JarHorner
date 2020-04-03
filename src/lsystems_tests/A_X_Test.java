package lsystems_tests;

import static org.junit.Assert.*;

import lsystems.A_X;
import lsystems.LRule;

import org.junit.Test;

public class A_X_Test {

	@Test
	public void creationTest() {
		
		LRule r1 = new A_X();
		
		char actMatch = 'A';
		char[] actBody = {};
		
		assertEquals(actMatch, r1.getMatch());
		assertArrayEquals(actBody, r1.getBody());
		
	}

}
