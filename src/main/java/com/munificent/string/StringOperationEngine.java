package com.munificent.string;

import java.util.Stack;

public class StringOperationEngine {

	/**
	 * 
	 * We say that a string, s, contains the word hackerrank if a subsequence of
	 * the characters in spell the word hackerrank. For example, haacckkerrannkk
	 * does contain hackerrank, but haacckkerannk does not (the characters all
	 * appear in the same order, but it's missing a second r).
	 * 
	 * More formally, let p0,p1,....,p9 be the respective indices of h, a, c, k,
	 * e, r, r, a, n, k in string s. If p0<p1<p2<.....<p9 is true, then contains
	 * hackerrank.
	 * 
	 * 
	 * 
	 * 
	 * @param subSequence
	 * @param superString
	 * @return
	 */
	public Boolean containsSubSequence(String subSequence, String superString) {
		return subSequenceSearch(subSequence, superString);
	}

	private Boolean subSequenceSearch(String subSequence, String superString) {
		Boolean result = Boolean.FALSE;
		Stack<String> subSequenceStack = new Stack<>();
		for (int i = subSequence.length(); i > 0; i--) {
			subSequenceStack.push(subSequence.substring(i - 1, i));
		}

		for (int i = 0; i < superString.length(); i++) {
			if (!subSequenceStack.isEmpty() && subSequenceStack.peek().equals(superString.substring(i, i + 1))) {
				subSequenceStack.pop();
			}
		}

		if (subSequenceStack.isEmpty()) {
			result = Boolean.TRUE;
		}
		return result;
	}
}
