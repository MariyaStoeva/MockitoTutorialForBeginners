package com.in28minutes.mockito;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.in28minutes.junit.helper.StringHelper;

public class FirstMockitoTest {

	@InjectMocks
	StringHelper sHelper = mock(StringHelper.class);
	
	@Test
	public void test() {
		assertTrue(true);
		
	
		when(sHelper.areFirstAndLastTwoCharactersTheSame("AghjA")).thenReturn(true);
		assertEquals(true,sHelper.areFirstAndLastTwoCharactersTheSame("AghjA"));
		assertEquals(false,sHelper.areFirstAndLastTwoCharactersTheSame("AdsdS"));
		
		when(sHelper.truncateAInFirst2Positions("FFFFF")).thenReturn("A FFF");
		assertEquals("A FFF",sHelper.truncateAInFirst2Positions("FFFFF"));
		
		verify(sHelper);
		assertNull(null);
		
	
	}

}
