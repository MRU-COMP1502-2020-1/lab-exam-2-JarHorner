package lsystems;

public class A_Q extends LRule {

	@Override
	public char getMatch() {
		
		char match = 'A';
		
		return match;
	}

	@Override
	public char[] getBody() {
		
		char[] body = {'Q'};
		
		return body;
	}

}
