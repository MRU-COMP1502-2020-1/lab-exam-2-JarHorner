package lsystems_tests;

import static org.junit.Assert.*;
import lsystems.A_AA;
import lsystems.LRule;

import org.junit.Test;

public class A_AA_Test {

	@Test
	public void creationTest() {
		
		LRule r1 = new A_AA();
		
		char actMatch = 'A';
		char[] actBody = {'A', 'A'};
		
		assertEquals(actMatch, r1.getMatch());
		assertArrayEquals(actBody, r1.getBody());
		
	}

}
