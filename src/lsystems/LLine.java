package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lsystems_exceptions.LSystemSymbolException;
import lsystems_exceptions.LSystemLengthException;

public class LLine {


	char line[];
	Set<LRule> rules;

	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}

	//I couldnt get it to work, i felt like I was on the right track but i couldnt come up with solution.
	public void process() throws LSystemSymbolException, LSystemLengthException {

		//makes list of chars that are acceptable
		List<Character> ruleChars = new ArrayList<Character>();
		for (LRule rule : rules) {
			ruleChars.add(rule.getMatch());
		}

		//makes list of chars that will changed according to rules.
		//easier to change variables in list.
		List<Character> newLine = new ArrayList<Character>();
		for (char c : line) {
			newLine.add(c);
		}

		if (line.length == 0) {
			throw new LSystemLengthException(line.length);
		}

		//if a char in line is not contained in the list of acceptable chars, exception is thrown
		for (char c : line) {
			if (!ruleChars.contains(c)) {
				throw new LSystemSymbolException(c);
			}
		}
		for (int i = 0; i < line.length; i++) {
			for (LRule rule: rules) {
				if (line[i] == rule.getMatch()){
					if (rule.getBody().length == 0) {
						newLine.remove(i);
					} else {
						int count = 0;
						for (char c : rule.getBody()) {
							if (count == 1) {
								newLine.add(i+1, c);
								i++;
							} else {
								newLine.set(i, c);
								count += 1;
							}
						}
					}
				}

				line = listToArray(newLine);
			}
		}


	}



	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {

		return new String(line);
	}

}
