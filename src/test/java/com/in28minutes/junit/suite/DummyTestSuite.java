package com.in28minutes.junit.suite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mockito.Mock;

import com.in28minutes.junit.helper.ArraysTest;
import com.in28minutes.junit.helper.StringHelper;
import com.in28minutes.junit.helper.StringHelperTest;

//@RunWith(Suite.class)
@SuiteClasses({ArraysTest.class,StringHelperTest.class})
public class DummyTestSuite {

	public StringHelper sHelper = new StringHelper();
	public void Coverage() {
		testTruncateAInFirst2Positions();
		testAreFirstAndLastTwoCharactersTheSame();
	}
	@Test
	public void testTruncateAInFirst2Positions() {
		
		
		String testString1 = sHelper.truncateAInFirst2Positions("qwerty");
		String testString2 = "A erty";
		testString1.equals(testString2);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		Boolean areTheSameTrue1 = sHelper.areFirstAndLastTwoCharactersTheSame("AbcgfA");
		Boolean areTheSameTrue2 = sHelper.areFirstAndLastTwoCharactersTheSame("SbcgfS");
		Boolean areTheSameFalse = sHelper.areFirstAndLastTwoCharactersTheSame("SbcgfA");
		
		
		areTheSameTrue1.equals(areTheSameTrue2);
		areTheSameTrue1.equals(!areTheSameFalse);
		
	}
	

}
