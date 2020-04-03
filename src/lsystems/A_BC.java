package lsystems;

public class A_BC extends LRule {

	@Override
	public char getMatch() {
		
		char match = 'A';
		
		return match;
	}

	@Override
	public char[] getBody() {
		
		char[] body = {'B','C'};
		
		return body;
	}

}
