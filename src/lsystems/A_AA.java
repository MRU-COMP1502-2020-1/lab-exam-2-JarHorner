package lsystems;

public class A_AA extends LRule {

	@Override
	public char getMatch() {
		
		char match = 'A';
		
		return match;
	}

	@Override
	public char[] getBody() {
		
		char[] body = {'A','A'};
		
		return body;
	}

}
