package lsystems_tests;

import static org.junit.Assert.*;

import lsystems.A_Q;
import lsystems.LRule;

import org.junit.Test;

public class A_Q_Test {

	@Test
	public void creationTest() {
		
		LRule r1 = new A_Q();
		
		char actMatch = 'A';
		char[] actBody = {'Q'};
		
		assertEquals(actMatch, r1.getMatch());
		assertArrayEquals(actBody, r1.getBody());
		
	}

}
