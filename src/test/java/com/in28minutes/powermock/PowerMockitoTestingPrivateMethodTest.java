package com.in28minutes.powermock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.agent.PowerMockAgent;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.common.internal.impl.PowerMockJUnit4RunListener;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
//@PrepareForTest(SystemUnderTest.class)
public class PowerMockitoTestingPrivateMethodTest {

//	@Rule
//	public PowerMockRule rule = new PowerMockRule();
//
//	static {
//		PowerMockAgent.initializeIfPossible();
//	}

	@Mock
	Dependency dependencyMock;

	@InjectMocks
	SystemUnderTest systemUnderTest;



	@Test
	public void powerMockito_CallingAPrivateMethod() throws Exception {
		when(dependencyMock.retrieveAllStats()).thenReturn(Arrays.asList(1, 2, 3));
		long value = Long.parseLong(Whitebox.invokeMethod(systemUnderTest, "privateMethodUnderTest").toString());

		assertEquals(6, value);

	}

}