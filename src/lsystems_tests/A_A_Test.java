package lsystems_tests;

import static org.junit.Assert.*;
import lsystems.A_A;
import lsystems.LRule;

import org.junit.Test;

public class A_A_Test {

	@Test
	public void creationTest() {
		
		LRule r1 = new A_A();
		
		char actMatch = 'A';
		char[] actBody = {'A'};
		
		assertEquals(actMatch, r1.getMatch());
		assertArrayEquals(actBody, r1.getBody());
		
	}

}
