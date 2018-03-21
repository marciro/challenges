package br.org.mcr.codewars.challenges.tenminutewalk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTest {
  
	
	@Test
  public void Test() {
    assertEquals("Should return true", true, TenMinuteWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    assertEquals("Should return false", false, TenMinuteWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    assertEquals("Should return false", false, TenMinuteWalk.isValid(new char[] {'w'}));
    assertEquals("Should return false", false, TenMinuteWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    assertEquals("Should return true", true, TenMinuteWalk.isValid(new char[] {'w','s','n','n','e','s','s','n','s','n'}));
    assertEquals("Should return true", true, TenMinuteWalk.isValid(new char[] {'n','n','s','w','e','s','s','n','w','e'}));
    assertEquals("Should return true", true, TenMinuteWalk.isValid(new char[] {'n','n','s','w','e','s','s','n','e','w'}));
  }
}