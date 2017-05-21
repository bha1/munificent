package com.munificent.string;

public class StringOperationAPI {

	public Boolean containsSubSequence(String subSequence, String superString) {
		Boolean result = Boolean.FALSE;
		if (subSequence != null && superString != null) {
			StringOperationEngine engine = new StringOperationEngine();
			result = engine.containsSubSequence(subSequence, superString);
		}
		return result;
	}
}
