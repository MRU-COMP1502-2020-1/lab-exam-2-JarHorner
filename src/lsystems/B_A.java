package lsystems;

public class B_A extends LRule {

	@Override
	public char getMatch() {
		
		char match = 'B';
		
		return match;
	}

	@Override
	public char[] getBody() {

		char[] body = {'A'};
		
		return body;
	}

}
