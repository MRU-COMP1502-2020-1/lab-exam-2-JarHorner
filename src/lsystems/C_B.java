package lsystems;

public class C_B extends LRule {

	@Override
	public char getMatch() {
		
		char match = 'C';
		
		return match;
	}

	@Override
	public char[] getBody() {

		char[] body = {'B'};
		
		return body;
	}

}
