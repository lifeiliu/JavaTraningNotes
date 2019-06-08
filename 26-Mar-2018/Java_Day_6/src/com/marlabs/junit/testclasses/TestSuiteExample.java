package com.marlabs.junit.testclasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CaliculatorTest.class, TestDateExamples.class,
		TestSecondSmallestElement.class })
public class TestSuiteExample {

}
